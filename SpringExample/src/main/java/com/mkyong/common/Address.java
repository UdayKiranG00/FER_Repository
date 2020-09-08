package com.mkyong.common;

public class Address {
	private int addressid;
	private String area;
	private int userid;
	public Address(int addressid, String area, int userid) {
		this.addressid = addressid;
		this.area = area;
		this.userid = userid;
	}void printAddress(){
		System.out.println("  addressid:"+addressid+"  area:"+area+"  userid:"+userid);
	}
}
