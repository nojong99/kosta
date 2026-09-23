package kr.swdl.school;

//VO(ValueObject) 패턴명은 대문자.
public class StudentVO {
	// 접근 지정자
	// 멤버 데이터는 일반적으로 private 권장 -> 캡슐화라고 함
	// 인캡슐레이션이 되는 것부터 객체 시작
	String studentNumber;
	String name;
	char gender = 'M';
	// 범위가 확정적인 경우 정해놓고 하는건 옛날방식
	//

	// 생성자 - 클래스 이름이 같아야함. 값 초기화를 목적, 리턴 타입자리는 없음
	// vm은 생성자가 없을때만 기본 생성자(매개인자없고, 하는 일도 없는)를 제공

	public String getStudentNumber() {
		return studentNumber;
	}

	public StudentVO(String studentNumber, String name, char gender) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}

	public StudentVO() {
	};

	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() >= 2)
			this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F')
			this.gender = gender;
	}

	// 반복 호출이 있더라 // 리턴 타입있을까 없을까?
	public void print() {
		System.out.println("학번 : " + studentNumber + " 이름: " + name + " 성별: " + gender);
	}
}
