package com.eleme.paladintest.apis.order;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.eleme.paladintest.apibase.PostAPI;
import com.eleme.paladintest.objectbase.ResponseObject;

public class PostUpdateUndistributeAPI extends PostAPI {
	public PostUpdateUndistributeAPI(String orderid, int courier_id) {
		this.setResponseType(ResponseObject.class);
		this.host = String.format("http://dist.t.ele.me/api/order/" + orderid
				+ "/distribute");
		List<NameValuePair> requestContent = new ArrayList<NameValuePair>();
		requestContent.add(new BasicNameValuePair("courier_id", Integer
				.toString(courier_id)));
		this.setRequestContent(requestContent);
	}
}
