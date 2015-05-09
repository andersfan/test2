package com.eleme.paladintest.apis.account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.testng.Assert;

@SuppressWarnings("deprecation")
public class Login {

	private final String host = "http://dist.t.ele.me/account/login/verify_code";

	public Login(String mobile, String verify_code)
			throws ClientProtocolException, IOException {
		this.mobile = mobile;
		this.verify_code = verify_code;
		this.SendRequest();
	}

	/**
	 * 
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	private void SendRequest() throws ClientProtocolException, IOException {
		httpClient = new DefaultHttpClient();
		HttpPost loginPost = new HttpPost(host);

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("mobile", mobile));
		nvps.add(new BasicNameValuePair("verify_code", verify_code));
		loginPost.setEntity(new UrlEncodedFormEntity(nvps));

		HttpContext localContext = new BasicHttpContext();
		CookieStore cookies = new BasicCookieStore();
		localContext.setAttribute(ClientContext.COOKIE_STORE, cookies);

		CloseableHttpResponse loginResponse = httpClient.execute(loginPost,
				localContext);

		Assert.assertEquals(loginResponse.getStatusLine().getStatusCode(), 302);
		Assert.assertEquals(loginResponse.getStatusLine().getReasonPhrase()
				.toUpperCase(), "FOUND");

		List<Cookie> cookieList = cookies.getCookies();
		for (int i = 0; i < cookieList.size(); i++) {
			Cookie currentCookie = cookieList.get(i);

			if (currentCookie.getName().equals("remember_token")) {
				this.cookie = currentCookie;
			}
		}

		loginResponse.close();
		httpClient.getConnectionManager().shutdown();
	}

	public Cookie getCookie() {
		return this.cookie;
	}

	private String mobile;
	private String verify_code;
	private Cookie cookie;
	private DefaultHttpClient httpClient;
}
