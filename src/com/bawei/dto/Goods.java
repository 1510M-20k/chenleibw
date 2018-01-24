package com.bawei.dto;

public class Goods {

	private Integer gid;
	
	private String gnumber;
	
	private String gname;
	
	private String price;
	
	private String num;
	
	private String sales_volume;
	
	private String stock;
	
	private Integer pid;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGnumber() {
		return gnumber;
	}

	public void setGnumber(String gnumber) {
		this.gnumber = gnumber;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getSales_volume() {
		return sales_volume;
	}

	public void setSales_volume(String sales_volume) {
		this.sales_volume = sales_volume;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gnumber=" + gnumber + ", gname=" + gname + ", price=" + price + ", num=" + num
				+ ", sales_volume=" + sales_volume + ", stock=" + stock + ", pid=" + pid + "]";
	}

	public Goods(Integer gid, String gnumber, String gname, String price, String num, String sales_volume, String stock,
			Integer pid) {
		super();
		this.gid = gid;
		this.gnumber = gnumber;
		this.gname = gname;
		this.price = price;
		this.num = num;
		this.sales_volume = sales_volume;
		this.stock = stock;
		this.pid = pid;
	}

	public Goods() {
		super();
	}

	
	
}
