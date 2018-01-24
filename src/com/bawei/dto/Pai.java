package com.bawei.dto;

public class Pai {

	private Integer pid;
	
	private String brandc;
	
	private String brand;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getBrandc() {
		return brandc;
	}

	public void setBrandc(String brandc) {
		this.brandc = brandc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Pai(Integer pid, String brandc, String brand) {
		super();
		this.pid = pid;
		this.brandc = brandc;
		this.brand = brand;
	}

	public Pai() {
		super();
	}

	@Override
	public String toString() {
		return "Pai [pid=" + pid + ", brandc=" + brandc + ", brand=" + brand + "]";
	}
	
	
	
	
}
