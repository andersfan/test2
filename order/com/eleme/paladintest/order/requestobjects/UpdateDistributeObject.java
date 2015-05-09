package com.eleme.paladintest.order.requestobjects;

import com.eleme.paladintest.objectbase.RequestObject;

public class UpdateDistributeObject extends RequestObject {
	private int courier_id;

	public void setCourier_id(int courier_id) {
		this.courier_id = courier_id;
	}

	public int getCourier_id() {
		return this.courier_id;
	}
}
