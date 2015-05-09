package com.eleme.paladintest.objectbase;


public abstract class ResponseObject extends JsonObject {
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	private int code;
	private String msg;
}
