package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.GetAPI;
import com.eleme.paladintest.order.responseobjects.GetUndistributeOrdersByRestaurantObject;

public class GetUndistributeOrdersByRestaurantAPI extends GetAPI {
	public GetUndistributeOrdersByRestaurantAPI(int restaurantid) {
		this.setResponseType(GetUndistributeOrdersByRestaurantObject.class);
		this.host = "http://dist.t.ele.me/api/order/undistribute/" + restaurantid;
	}
}
