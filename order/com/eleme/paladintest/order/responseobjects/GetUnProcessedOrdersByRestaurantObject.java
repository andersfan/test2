package com.eleme.paladintest.order.responseobjects;

import java.util.List;

import com.eleme.paladintest.objectbase.ResponseObject;

public class GetUnProcessedOrdersByRestaurantObject extends ResponseObject {
	public class data {
		public class restaurant {
			public class order {
				private String address;

				private int coop_id;

				private Number courier_mobile;

				private String courier_name;

				private Number created_at;

				private int deliver_time;

				private int delivery_status;

				private String delivery_status_cname;

				private String description;

				private int dish_num;

				private Number dish_price;

				private int eleme_created_at;

				private String invoice;

				private int is_book;

				private int is_online_paid;

				private int is_online_settled;

				private String order_id;

				private Number paid;

				private Number payable;

				private String phone;

				private String phone_bk;

				private int print_status;

				private Number received;

				private int report_status;

				private int restaurant_id;

				private String restaurant_name;

				private int restaurant_number;

				private String service_category;

				private int station_id;

				private String station_name;

				private String time_desc;

				private Number total_price;

				private String user_name;

				public String getAddress() {
					return this.address;
				}

				public int getCoop_id() {
					return this.coop_id;
				}

				public Number getCourier_mobile() {
					return this.courier_mobile;
				}

				public String getCourier_name() {
					return this.courier_name;
				}

				public Number getCreated_at() {
					return this.created_at;
				}

				public int getDeliver_time() {
					return this.deliver_time;
				}

				public int getDelivery_status() {
					return this.delivery_status;
				}

				public String getDelivery_status_cname() {
					return this.delivery_status_cname;
				}

				public String getDescription() {
					return this.description;
				}

				public int getDish_num() {
					return this.dish_num;
				}

				public Number getDish_price() {
					return this.dish_price;
				}

				public int getEleme_created_at() {
					return this.eleme_created_at;
				}

				public String getInvoice() {
					return this.invoice;
				}

				public int getIs_book() {
					return this.is_book;
				}

				public int getIs_online_paid() {
					return this.is_online_paid;
				}

				public int getIs_online_settled() {
					return this.is_online_settled;
				}

				public String getOrder_id() {
					return this.order_id;
				}

				public Number getPaid() {
					return this.paid;
				}

				public Number getPayable() {
					return this.payable;
				}

				public String getPhone() {
					return this.phone;
				}

				public String getPhone_bk() {
					return this.phone_bk;
				}

				public int getPrint_status() {
					return this.print_status;
				}

				public Number getReceived() {
					return this.received;
				}

				public int getReport_status() {
					return this.report_status;
				}

				public int getRestaurant_id() {
					return this.restaurant_id;
				}

				public String getRestaurant_name() {
					return this.restaurant_name;
				}

				public int getRestaurant_number() {
					return this.restaurant_number;
				}

				public String getService_category() {
					return this.service_category;
				}

				public int getStation_id() {
					return this.station_id;
				}

				public String getStation_name() {
					return this.station_name;
				}

				public String getTime_desc() {
					return this.time_desc;
				}

				public Number getTotal_price() {
					return this.total_price;
				}

				public String getUser_name() {
					return this.user_name;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public void setCoop_id(int coop_id) {
					this.coop_id = coop_id;
				}

				public void setCourier_mobile(Number courier_mobile) {
					this.courier_mobile = courier_mobile;
				}

				public void setCourier_name(String courier_name) {
					this.courier_name = courier_name;
				}

				public void setCreated_at(Number created_at) {
					this.created_at = created_at;
				}

				public void setDeliver_time(int deliver_time) {
					this.deliver_time = deliver_time;
				}

				public void setDelivery_status(int delivery_status) {
					this.delivery_status = delivery_status;
				}

				public void setDelivery_status_cname(
						String delivery_status_cname) {
					this.delivery_status_cname = delivery_status_cname;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public void setDish_num(int dish_num) {
					this.dish_num = dish_num;
				}

				public void setDish_price(Number dish_price) {
					this.dish_price = dish_price;
				}

				public void setEleme_created_at(int eleme_created_at) {
					this.eleme_created_at = eleme_created_at;
				}

				public void setInvoice(String invoice) {
					this.invoice = invoice;
				}

				public void setIs_book(int is_book) {
					this.is_book = is_book;
				}

				public void setIs_online_paid(int is_online_paid) {
					this.is_online_paid = is_online_paid;
				}

				public void setIs_online_settled(int is_online_settled) {
					this.is_online_settled = is_online_settled;
				}

				public void setOrder_id(String order_id) {
					this.order_id = order_id;
				}

				public void setPaid(Number paid) {
					this.paid = paid;
				}

				public void setPayable(Number payable) {
					this.payable = payable;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public void setPhone_bk(String phone_bk) {
					this.phone_bk = phone_bk;
				}

				public void setPrint_status(int print_status) {
					this.print_status = print_status;
				}

				public void setReceived(Number received) {
					this.received = received;
				}

				public void setReport_status(int report_status) {
					this.report_status = report_status;
				}

				public void setRestaurant_id(int restaurant_id) {
					this.restaurant_id = restaurant_id;
				}

				public void setRestaurant_name(String restaurant_name) {
					this.restaurant_name = restaurant_name;
				}

				public void setRestaurant_number(int restaurant_number) {
					this.restaurant_number = restaurant_number;
				}

				public void setService_category(String service_category) {
					this.service_category = service_category;
				}

				public void setStation_id(int station_id) {
					this.station_id = station_id;
				}

				public void setStation_name(String station_name) {
					this.station_name = station_name;
				}

				public void setTime_desc(String time_desc) {
					this.time_desc = time_desc;
				}

				public void setTotal_price(Number total_price) {
					this.total_price = total_price;
				}

				public void setUser_name(String user_name) {
					this.user_name = user_name;
				}
			}

			private String address;

			private int id;

			private String name;

			private List<order> orders;
			
			private String phone;

			private int pickup_time_7d;

			private int service_category;

			public String getAddress() {
				return this.address;
			}

			public int getId() {
				return this.id;
			}

			public String getName() {
				return this.name;
			}

			public List<order> getOrders() {
				return this.orders;
			}

			public String getPhone() {
				return this.phone;
			}

			public int getPickup_time_7d() {
				return pickup_time_7d;
			}

			public int getService_category() {
				return this.service_category;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public void setId(int id) {
				this.id = id;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setOrders(List<order> orders) {
				this.orders = orders;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public void setPickup_time_7d(int pickup_time_7d) {
				this.pickup_time_7d = pickup_time_7d;
			}

			public void setService_category(int service_category) {
				this.service_category = service_category;
			}
		}

		private int count;

		private List<restaurant> restaurants;

		public int getCount() {
			return count;
		}

		public List<restaurant> getRestaurants() {
			return this.restaurants;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public void setRestaurants(List<restaurant> restaurants) {
			this.restaurants = restaurants;
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
