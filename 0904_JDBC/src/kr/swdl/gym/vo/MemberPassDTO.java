package kr.swdl.gym.vo;

import java.sql.Date;

public class MemberPassDTO {
	private String passName;
	private int price;
	private Date startDate;
	private Date endDate;
	private Date paymentDate;
	
	public MemberPassDTO(String passName, int price, Date startDate, Date endDate, Date paymentDate) {
		setPassName(passName);
		setPrice(price);
		setStartDate(startDate);
		setEndDate(endDate);
		setPaymentDate(paymentDate);
	}
	public String getPassName() {
		return passName;
	}
	public void setPassName(String passName) {
		this.passName = passName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymeDate) {
		this.paymentDate = paymeDate;
	}
	@Override
	public String toString() {
		return "MemberPassDTO [passName=" + passName + ", price=" + price + ", startDate=" + startDate + ", endDate="
				+ endDate + ", paymeDate=" + paymentDate + "]\n";
	}
	
	
}
