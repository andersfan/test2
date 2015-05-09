package com.eleme.paladintest.order.responseobjects;

import java.util.List;

import com.eleme.paladintest.objectbase.ResponseObject;

public class GetOrderDetailObject extends ResponseObject {
	public class data {
		public class order {
			public class extra {
				private int category_id;

				private String description;

				private int id;

				private String name;

				private Number price;

				private int quantity;

				private int stats_quantity;

				private int type;

				public int getCategory_id() {
					return this.category_id;
				}

				public String getDescription() {
					return this.description;
				}

				public int getId() {
					return this.id;
				}

				public String getName() {
					return this.name;
				}

				public Number getPrice() {
					return this.price;
				}

				public int getQuantity() {
					return this.quantity;
				}

				public int getStats_quantity() {
					return this.stats_quantity;
				}

				public int getType() {
					return this.type;
				}

				public void setCategory_id(int category_id) {
					this.category_id = category_id;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setPrice(Number price) {
					this.price = price;
				}

				public void setQuantity(int quantity) {
					this.quantity = quantity;
				}

				public void setStats_quantity(int stats_quantity) {
					this.stats_quantity = stats_quantity;
				}

				public void setType(int type) {
					this.type = type;
				}
			}

			public class group {
				public class nestgroup {
					private int category_id;

					private Number discount;

					private Number discount_price;

					private List<Object> garnish;

					private int id;

					private String name;

					private Number price;

					private int quantity;

					public int getCategory_id() {
						return this.category_id;
					}

					public Number getDiscount() {
						return this.discount;
					}

					public Number getDiscount_price() {
						return this.discount_price;
					}

					public List<Object> getGarnish() {
						return this.garnish;
					}

					public int getId() {
						return this.id;
					}

					public String getName() {
						return this.name;
					}

					public Number getPrice() {
						return this.price;
					}

					public int getQuantity() {
						return this.quantity;
					}

					public void setCategory_id(int category_id) {
						this.category_id = category_id;
					}

					public void setDiscount(Number discount) {
						this.discount = discount;
					}

					public void setDiscount_price(Number discount_price) {
						this.discount_price = discount_price;
					}

					public void setGarnish(List<Object> garnish) {
						this.garnish = garnish;
					}

					public void setId(int id) {
						this.id = id;
					}

					public void setName(String name) {
						this.name = name;
					}

					public void setPrice(Number price) {
						this.price = price;
					}

					public void setQuantity(int quantity) {
						this.quantity = quantity;
					}
				}

				private nestgroup nestgroup;

				public nestgroup getnestgroup() {
					return this.nestgroup;
				}

				public void setnestgroup(nestgroup nestgroup) {
					this.nestgroup = nestgroup;
				}
			}

			private int allow_cancel;

			private String clip;

			private List<extra> extras;

			private List<group> groups;

			private String order_id;

			public int getAllow_cancel() {
				return this.allow_cancel;
			}

			public String getClip() {
				return this.clip;
			}

			public List<extra> getExtra() {
				return this.extras;
			}

			public List<group> getGroup() {
				return this.groups;
			}

			public String getOrder_id() {
				return this.order_id;
			}

			public void setAllow_cancel(int allow_cancel) {
				this.allow_cancel = allow_cancel;
			}

			public void setClip(String clip) {
				this.clip = clip;
			}

			public void setExtra(List<extra> extra) {
				this.extras = extra;
			}

			public void setGroup(List<group> group) {
				this.groups = group;
			}
			
			public void setOrder_id(String order_id) {
				this.order_id = order_id;
			}
		}

		private order order;

		private List<Object> order_changes;

		public order getOrder() {
			return this.order;
		}

		public List<Object> getOrder_changes() {
			return this.order_changes;
		}

		public void setOrder(order order) {
			this.order = order;
		}

		public void setOrder_changes(List<Object> order_changes) {
			this.order_changes = order_changes;
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
