package com.eleme.paladintest.apibase;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.GzipDecompressingEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import com.eleme.paladintest.objectbase.ResponseObject;
import com.google.gson.Gson;

@SuppressWarnings("deprecation")
public abstract class PostAPI extends BaseAPI {
	private boolean getResult = false;
	private List<NameValuePair> requestContent;
	private Class<?> responsetype;

	public List<NameValuePair> getRequestContent() {
		return requestContent;
	}

	public Class<?> getResponseType() {
		return responsetype;
	}

	public boolean isGetResult() {
		return getResult;
	}

	@Override
	public ResponseObject SendRequest(Cookie cookie)
			throws ClientProtocolException, IOException {
		httpClient = new DefaultHttpClient();

		CookieStore cookieStore = new BasicCookieStore();
		cookieStore.addCookie(cookie);
		httpClient.setCookieStore(cookieStore);

		HttpPost httpPost = new HttpPost(this.host);
		httpPost.setHeader("Accept-Encoding", "gzip, deflate, sdch");
		httpPost.setEntity(new UrlEncodedFormEntity(this.requestContent));

		CloseableHttpResponse httpResponse = this.httpClient.execute(httpPost);

		Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
		Assert.assertEquals(httpResponse.getStatusLine().getReasonPhrase()
				.toUpperCase(), "OK");

		ResponseObject responseObject = null;
		if (this.getResult) {
			HttpEntity entity = httpResponse.getEntity();
			GzipDecompressingEntity gzipentity = new GzipDecompressingEntity(
					entity);
			Gson gson = new Gson();
			responseObject = (ResponseObject) gson.fromJson(
					EntityUtils.toString(gzipentity), this.responsetype);
			EntityUtils.consume(entity);
		}

		httpResponse.close();
		httpClient.getConnectionManager().shutdown();

		return responseObject;
	}

	public void setGetResult(boolean getResult) {
		this.getResult = getResult;
	}

	public void setRequestContent(List<NameValuePair> requestContent) {
		this.requestContent = requestContent;
	}

	public void setResponseType(Class<?> responsetype) {
		this.responsetype = responsetype;
	}

}
