package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.GetAPI;
import com.eleme.paladintest.order.responseobjects.GetCouriersByRestaurantObject;

public class GetCouriersByRestaurantAPI extends GetAPI {
	public GetCouriersByRestaurantAPI(int restaurantid) {
		this.setResponseType(GetCouriersByRestaurantObject.class);
		this.host = "http://dist.t.ele.me/api/station/" + restaurantid
				+ "/courier_dashboard";
	}
}
