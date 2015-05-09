package com.eleme.paladintest.tests.sample;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.cookie.Cookie;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.eleme.paladintest.apis.account.Login;
import com.eleme.paladintest.apis.account.Logout;
import com.eleme.paladintest.apis.order.GetCountAPI;
import com.eleme.paladintest.apis.order.GetCouriersByRestaurantAPI;
import com.eleme.paladintest.apis.order.GetOrderDetailAPI;
import com.eleme.paladintest.apis.order.GetUnProcessedOrdersByRestaurantAPI;
import com.eleme.paladintest.apis.order.GetUndistributeOrdersByRestaurantAPI;
import com.eleme.paladintest.apis.order.PostReportOrderAPI;
import com.eleme.paladintest.apis.order.PostUpdateUndistributeAPI;
import com.eleme.paladintest.order.responseobjects.GetCountObject;
import com.eleme.paladintest.order.responseobjects.GetCouriersByRestaurantObject;
import com.eleme.paladintest.order.responseobjects.GetCouriersByRestaurantObject.data.courier;
import com.eleme.paladintest.order.responseobjects.GetOrderDetailObject;
import com.eleme.paladintest.order.responseobjects.GetUnProcessedOrdersByRestaurantObject;
import com.eleme.paladintest.order.responseobjects.GetUnProcessedOrdersByRestaurantObject.data.restaurant;
import com.eleme.paladintest.order.responseobjects.GetUnProcessedOrdersByRestaurantObject.data.restaurant.order;
import com.eleme.paladintest.order.responseobjects.GetUndistributeOrdersByRestaurantObject;
import com.eleme.paladintest.order.responseobjects.GetUndistributeOrdersByRestaurantObject.Data.Restaurants.Workspace;
import com.eleme.paladintest.order.responseobjects.GetUndistributeOrdersByRestaurantObject.Data.Restaurants.Workspace.Order;

public class SampleTest {

	private Cookie cookie;

	@AfterSuite
	public void afterSuite() throws IOException {
		new Logout(this.cookie);
	}

	@BeforeSuite
	public void beforeSuite() throws ClientProtocolException, IOException {
		Login login = new Login("18616521543", "sad");
		this.cookie = login.getCookie();
	}

	// @Test
	public void testUndistributeSample() throws ClientProtocolException,
			IOException {
		int restaurantid = 1;
		String couriername = "范旭斐";

		GetCountAPI countAPI = new GetCountAPI(restaurantid);
		GetCountObject counts = (GetCountObject) countAPI
				.SendRequest(this.cookie);

		// Verify number of undistribute > 0
		Assert.assertTrue(counts.getData().getCount().getUndistribute() > 0);

		GetUndistributeOrdersByRestaurantAPI undistributeAPI = new GetUndistributeOrdersByRestaurantAPI(
				1);
		GetUndistributeOrdersByRestaurantObject responseObject = (GetUndistributeOrdersByRestaurantObject) undistributeAPI
				.SendRequest(this.cookie);
		GetUndistributeOrdersByRestaurantObject.Data.Restaurants.Workspace[] workspaces = responseObject
				.getData().getRestaurants().getWorkspace();

		for (Workspace workspace : workspaces) {
			for (Order order : workspace.getOrders()) {
				// Verify the status of all the orders
				Assert.assertEquals("未分配", order.getCourier_name());

				GetCouriersByRestaurantAPI getCouriersByRestaurantAPI = new GetCouriersByRestaurantAPI(
						restaurantid);
				GetCouriersByRestaurantObject couriers = (GetCouriersByRestaurantObject) getCouriersByRestaurantAPI
						.SendRequest(this.cookie);
				courier targetcourier = null;
				for (courier courier : couriers.getData().getCouriers()) {
					if (courier.getCourier_name().equals(couriername)) {
						targetcourier = courier;
					}
				}
				// Verify the courier was exist
				Assert.assertTrue(targetcourier != null);

				PostUpdateUndistributeAPI updateundistributeAPI = new PostUpdateUndistributeAPI(
						order.getOrder_id(), targetcourier.getCourier_id());
				updateundistributeAPI.SendRequest(this.cookie);

				GetOrderDetailAPI getorderAPI = new GetOrderDetailAPI(
						order.getOrder_id());
				GetOrderDetailObject orderdetail = (GetOrderDetailObject) getorderAPI
						.SendRequest(this.cookie);
				// Verify the info of order
				Assert.assertEquals(order.getOrder_id(), orderdetail.getData()
						.getOrder().getOrder_id());
			}
		}
	}

	@Test
	public void testUnprocessedSample() throws ClientProtocolException,
			IOException {
		int restaurantid = 1;
		GetUnProcessedOrdersByRestaurantAPI unprocessedorders = new GetUnProcessedOrdersByRestaurantAPI(
				restaurantid);
		GetUnProcessedOrdersByRestaurantObject unprocessedObject = (GetUnProcessedOrdersByRestaurantObject) unprocessedorders
				.SendRequest(this.cookie);
		for (restaurant restaurant : unprocessedObject.getData()
				.getRestaurants()) {
			for (order order : restaurant.getOrders()) {
				// Verify status of order
				Assert.assertEquals("待取餐", order.getDelivery_status_cname());

				PostReportOrderAPI reportAPI = new PostReportOrderAPI(
						order.getOrder_id());
				reportAPI.SendRequest(this.cookie);
			}
		}
	}
}