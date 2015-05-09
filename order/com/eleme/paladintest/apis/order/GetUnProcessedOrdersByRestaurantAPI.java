package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.GetAPI;
import com.eleme.paladintest.order.responseobjects.GetUndistributeOrdersByRestaurantObject;

public class GetUnProcessedOrdersByRestaurantAPI extends GetAPI {

	public GetUnProcessedOrdersByRestaurantAPI(int restaurantid) {
		this.setResponseType(GetUndistributeOrdersByRestaurantObject.class);
		this.host = "http://dist.t.ele.me/api/order/unprocessed/" + restaurantid;
	}

}
