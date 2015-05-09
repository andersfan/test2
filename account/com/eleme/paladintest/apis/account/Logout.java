package com.eleme.paladintest.apis.account;

import java.io.IOException;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.Assert;

@SuppressWarnings("deprecation")
public class Logout {

	public Logout(Cookie cookie) throws IOException {
		SendRequest(cookie);
	}

	private void SendRequest(Cookie cookie) throws IOException {
		httpClient = new DefaultHttpClient();

		CookieStore cookieStore = new BasicCookieStore();
		cookieStore.addCookie(cookie);
		httpClient.setCookieStore(cookieStore);

		HttpGet logoutGet = new HttpGet(host);
		CloseableHttpResponse logoutResponse = httpClient.execute(logoutGet);

		Assert.assertEquals(logoutResponse.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(logoutResponse.getStatusLine().getReasonPhrase()
				.toUpperCase(), "OK");
		
		logoutResponse.close();
		httpClient.getConnectionManager().shutdown();
	}
	
	private DefaultHttpClient httpClient;
	private final String host = "http://dist.t.ele.me/account/logout";
}
