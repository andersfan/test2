package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.PostAPI;
import com.eleme.paladintest.objectbase.ResponseObject;

public class PostReportOrderAPI extends PostAPI {
	public PostReportOrderAPI(String orderid) {
		this.setResponseType(ResponseObject.class);
		this.host = String.format("http://dist.t.ele.me/api/order/" + orderid
				+ "/report");
	}
}
