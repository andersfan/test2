package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.GetAPI;
import com.eleme.paladintest.order.responseobjects.GetOrderDetailObject;

public class GetOrderDetailAPI extends GetAPI {
	public GetOrderDetailAPI(String orderid) {
		this.host = String.format("http://dist.t.ele.me/api/order/" + orderid
				+ "/detail");
		this.setResponseType(GetOrderDetailObject.class);
	}
}
