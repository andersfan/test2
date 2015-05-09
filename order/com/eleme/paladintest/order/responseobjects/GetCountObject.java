package com.eleme.paladintest.order.responseobjects;

import com.eleme.paladintest.objectbase.ResponseObject;

public class GetCountObject extends ResponseObject {

	public class Data {

		public class Count {			
			private int delivering;
			private int unassigned;
			private int unconfirm;
			private int undistribute;
			private int unpickup;
			private int unprocessed;
			public int getDelivering() {
				return delivering;
			}
			public int getUnassigned() {
				return unassigned;
			}
			public int getUnconfirm() {
				return unconfirm;
			}
			public int getUndistribute() {
				return undistribute;
			}
			public int getUnpickup() {
				return unpickup;
			}
			public int getUnprocessed() {
				return unprocessed;
			}		
			public void setDelivering(int delivering) {
				this.delivering = delivering;
			}
			public void setUnassigned(int unassigned) {
				this.unassigned = unassigned;
			}
			public void setUnconfirm(int unconfirm) {
				this.unconfirm = unconfirm;
			}
			public void setUndistribute(int undistribute) {
				this.undistribute = undistribute;
			}
			public void setUnpickup(int unpickup) {
				this.unpickup = unpickup;
			}
			public void setUnprocessed(int unprocessed) {
				this.unprocessed = unprocessed;
			}
		}

		private Count count;	
		public Count getCount() {
			return count;
		}
		public void setCount(Count count) {
			this.count = count;
		}
	}

	private Data data;

	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
