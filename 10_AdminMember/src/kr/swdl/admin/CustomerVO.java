package kr.swdl.admin;

import java.util.Date;

public class CustomerVO {
	private String name;
	private String gender;
	private int point;
	private String inDate;
	// 추가 해석
	private String email;
	// 생성자 -> 판단이 안 설 때 다 넣기 지금 test! 만드는게 좋다!
	// 외부 노출? 메서드는 여러번 호출, 생성자는 1회 호출 
	// 당장 필요한 인자값은 String name, String gender, int point
	// 생성자 overloading 규칙은 매개인자 많은 거 -> 적은거 순으로 개발 -> 여러번 호출할 수 없기때문
	// 리팩토링 시 기존 소스 없애는 건 하지말고 제약조건을 바꾸거나 추가하는 개념으로 접근
	
	/**
	 * @exception NameLengthException
	 * */
	public CustomerVO(String name, String gender, int point){
		this(name, gender, point,new Date().toString(), null); // 생성자가 다른 생성자를 호출 ??
	}
	
	/**
	 * @exception NameLengthException
	 * */
	private CustomerVO(String name, String gender, int point, String inDate, String email){
		super();
		setName(name);
		setGender(gender);
		setPoint(point);
		setInDate(inDate);
		setEmail(email);
	}
	
	public String getName() {
		return name;
	}
//	이름만 보고 checked인지 runtime인지 알 수 없다.
//  throws 하기 싫으면 -> 아래 처럼하면 생략 
	/**
	 * @exception NameLengthException
	 * */
	
	public void setName(String name){
		if(name.length()<2) 
			throw new NameLengthException("2자 이상 이름을 넣어주세요.");		

		this.name = name;
	}

	public String getGender() {
		return gender;
	}
	/**
	 * @exception GenderValueException
	 * */
	public void setGender(String gender) {
		if(!gender.equals("M") && !gender.equals("F")) 
			throw new GenderValueException("M or F");
		this.gender = gender;
	}

	public int getPoint() {
		return point;
	}
	// 테스트하면서 계속 검증해야한다.
	public void setPoint(int point) {
		if(point <10) 
			this.point=10;
		else 
			this.point = point;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerVO [name=" + name + ", gender=" + gender + ", point=" + point + ", inDate=" + inDate
				+ ", email=" + email + "]";
	}

}
