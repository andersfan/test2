package com.eleme.paladintest.apibase;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;

import com.eleme.paladintest.objectbase.ResponseObject;

@SuppressWarnings("deprecation")
public abstract class BaseAPI {
	protected DefaultHttpClient httpClient;
	protected String host;
	private static DefaultHttpClient defaultHttpClient = new DefaultHttpClient();

	public abstract ResponseObject SendRequest(Cookie cookie)
			throws ClientProtocolException, IOException;

	public static DefaultHttpClient getDefaultHttpClient() {
		return defaultHttpClient;
	}

	public static void setDefaultHttpClient(DefaultHttpClient defaultHttpClient) {
		BaseAPI.defaultHttpClient = defaultHttpClient;
	}
}
