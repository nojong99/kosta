package kr.swdl.gym.vo;

import java.util.Date;

public class MemberVO {
	private String memberNumber;
	private String name;
	private String gender;
	private Date birth;
	private String phone;
	private Date inDate;
	private String purpose;
	private String route;
	private String comments;
	private int totalAmount;
	private String adminNumber;
	
	public MemberVO(String name, String gender, Date birth, String phone) {
		setName(name);
		setGender(gender);
		setBirth(birth);
		setPhone(phone);
	}
	
	public MemberVO(String memberNumber, String name, String gender, Date birth, String phone, Date inDate,
			String purpose, String route, String comments, int totalAmount, String adminNumber) {
		setMemberNumber(memberNumber);
		setName(name);
		setGender(gender);
		setBirth(birth);
		setPhone(phone);
		setInDate(inDate);
		setPurpose(purpose);
		setRoute(route);
		setComments(comments);
		setTotalAmount(totalAmount);
		setAdminNumber(adminNumber);
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAdminNumber() {
		return adminNumber;
	}

	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}

	@Override
	public String toString() {
		return "MemberVO name=" + name + ", gender=" + gender + ", birth=" + birth
				+ ", phone=" + phone +"]\n";
	}
	
	
	public void getMemberInfo() {
		System.out.println("MemberVO [memberNumber=" + memberNumber + ", name=" + name + ", gender=" + gender + ", birth=" + birth
				+ ", phone=" + phone + ",\n inDate=" + inDate + ", purpose=" + purpose + ", route=" + route
				+ ", comments=" + comments + ", totalAmount=" + totalAmount + ", adminNumber=" + adminNumber + "]");
	}

}
