package kr.swdl;

import java.time.LocalDate;

public class MemberVO {
	private String memberId;
	private String name;
	private char gender;
	private int point;
	private LocalDate date;
	
	public MemberVO(String memberId, String name, char gender, int point) throws NameSizeException, GenderValueException {
		setMemberId(memberId);
		setName(name);
		setGender(gender);
		setPoint(point);
		setDate(LocalDate.now());
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameSizeException {
		if(name.length()<2) {
			throw new NameSizeException("The name must be at least 2 characters long"); 
		}
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) throws GenderValueException {
		if(!(gender=='M' || gender=='F')) {
			throw new GenderValueException("gender is M or F!");
		}
		this.gender = gender;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate localDate) {
		this.date = LocalDate.now();
	}

	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + ", gender=" + gender + ", point=" + point
				+ ", date=" + date + "]";
	}
	
}
