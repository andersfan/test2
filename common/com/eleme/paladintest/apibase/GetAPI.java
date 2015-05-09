package com.eleme.paladintest.apibase;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import com.eleme.paladintest.objectbase.ResponseObject;
import com.google.gson.Gson;

@SuppressWarnings("deprecation")
public abstract class GetAPI extends BaseAPI {
	private Class<?> responsetype;

	public Class<?> getResponseType() {
		return responsetype;
	}

	@Override
	public ResponseObject SendRequest(Cookie cookie)
			throws ClientProtocolException, IOException {
		httpClient = new DefaultHttpClient();;

		CookieStore cookieStore = new BasicCookieStore();
		cookieStore.addCookie(cookie);
		httpClient.setCookieStore(cookieStore);

		HttpGet httpGet = new HttpGet(this.host);
		httpGet.setHeader("Accept-Encoding", "gzip, deflate, sdch");
		CloseableHttpResponse httpResponse = this.httpClient.execute(httpGet);

		Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(httpResponse.getStatusLine().getReasonPhrase()
				.toUpperCase(), "OK");

		HttpEntity entity = httpResponse.getEntity();
		Gson gson = new Gson();
		GzipDecompressingEntity gzipentity = new GzipDecompressingEntity(entity);
		ResponseObject responseObject = (ResponseObject) gson.fromJson(
				EntityUtils.toString(gzipentity), this.responsetype);
		EntityUtils.consume(entity);

		httpResponse.close();
		httpClient.getConnectionManager().shutdown();

		return responseObject;
	}

	public void setResponseType(Class<?> responsetype) {
		this.responsetype = responsetype;
	}
}
