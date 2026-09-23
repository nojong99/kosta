package kr.swdl.dao;

import java.util.Date;

public class CustomerVO {
	private int customerNo;
	private String name;
	private String phoneNo;
	private int point;
	private Date inDate;

	public CustomerVO(int customerNo, String name, String phoneNo, int point, Date inDate) {
		setCustomerNo(customerNo);
		setName(name);
		setPhoneNo(phoneNo);
		setPoint(point);
		setInDate(inDate);
	}
	
	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}


	@Override
	public String toString() {
		return "CustomerVO [customerNo=" + customerNo + ", name=" + name + ", phoneNo=" + phoneNo + ", point=" + point
				+ ", inDate=" + inDate + "]";
	}

}
