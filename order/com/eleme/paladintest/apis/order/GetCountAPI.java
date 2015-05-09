package com.eleme.paladintest.apis.order;

import com.eleme.paladintest.apibase.GetAPI;
import com.eleme.paladintest.order.responseobjects.GetCountObject;

public class GetCountAPI extends GetAPI {
	public GetCountAPI(int id) {
		this.setResponseType(GetCountObject.class);
		this.host = "http://dist.t.ele.me/api/order/count/" + id;
	}
}
