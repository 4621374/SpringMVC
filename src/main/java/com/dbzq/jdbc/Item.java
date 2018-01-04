package com.dbzq.jdbc;

import java.util.Date;

public class Item {
@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", detail=" + detail + ", pic=" + pic + ", createtime="
				+ createtime + "]";
	}
private String name;
private double price;
private String detail;
private String pic;
private Date createtime;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public Date getCreatetime() {
	return createtime;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}

}
