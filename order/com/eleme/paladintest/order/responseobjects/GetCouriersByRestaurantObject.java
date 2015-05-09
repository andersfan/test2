package com.eleme.paladintest.order.responseobjects;

import java.util.List;

import com.eleme.paladintest.objectbase.ResponseObject;

public class GetCouriersByRestaurantObject extends ResponseObject {
	public class data {
		public class courier {
			public class courier_address {
				private Number latitude;

				private Number longitude;

				public Number getLatitude() {
					return this.latitude;
				}

				public Number getLongitude() {
					return this.longitude;
				}

				public void setLatitude(Number latitude) {
					this.latitude = latitude;
				}

				public void setLongitude(Number longitude) {
					this.longitude = longitude;
				}

			}

			public class ordertime {
				private Number order_id;

				private int time;

				public Number getOrder_id() {
					return this.order_id;
				}

				public int getTime() {
					return this.time;
				}

				public void setOrder_id(Number order_id) {
					this.order_id = order_id;
				}

				public void setTime(int time) {
					this.time = time;
				}
			}

			private courier_address courier_address;

			private int courier_id;

			private String courier_name;

			private String courier_pic;

			private List<ordertime> delivering;

			private List<ordertime> unconfirm;

			private List<ordertime> unpickup;

			public courier_address getCourier_address() {
				return this.courier_address;
			}

			public int getCourier_id() {
				return this.courier_id;
			}

			public String getCourier_name() {
				return this.courier_name;
			}

			public String getCourier_pic() {
				return this.courier_pic;
			}

			public List<ordertime> getordertime() {
				return this.delivering;
			}

			public List<ordertime> getUnconfirm() {
				return this.unconfirm;
			}

			public List<ordertime> getUnpickup() {
				return this.unpickup;
			}

			public void setCourier_address(courier_address courier_address) {
				this.courier_address = courier_address;
			}

			public void setCourier_id(int courier_id) {
				this.courier_id = courier_id;
			}

			public void setCourier_name(String courier_name) {
				this.courier_name = courier_name;
			}

			public void setCourier_pic(String courier_pic) {
				this.courier_pic = courier_pic;
			}

			public void setordertime(List<ordertime> delivering) {
				this.delivering = delivering;
			}

			public void setUnconfirm(List<ordertime> unconfirm) {
				this.unconfirm = unconfirm;
			}

			public void setUnpickup(List<ordertime> unpickup) {
				this.unpickup = unpickup;
			}
		}

		private List<courier> couriers;

		public List<courier> getCouriers() {
			return this.couriers;
		}

		public void setCouriers(List<courier> couriers) {
			this.couriers = couriers;
		}
	}

	private data data;

	public data getData() {
		return this.data;
	}

	public void setData(data data) {
		this.data = data;
	}
}
