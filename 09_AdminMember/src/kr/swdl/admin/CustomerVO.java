package kr.swdl.admin;

import java.time.LocalDate;

public class CustomerVO {
	private int memberId;
	private String name;
	private char gender;
	private int point;
	private LocalDate data;
	
	public CustomerVO(int memberId, String name, char gender, int point ) {
		setMemberId(memberId);
		setName(name);
		setGender(gender);
		setPoint(point);
		setData(LocalDate.now());
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CustomerVO [memberId=" + memberId + ", name=" + name + ", gender=" + gender + ", point=" + point
				+ ", data=" + data + "]";
	}
	
	
}
