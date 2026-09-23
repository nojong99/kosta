//노종현
package kr.swdl.school;

public class TeacherVO {
	String TeacherNumber;
	String TeacherName;
	char gender;
	String subject;
	int money;

	public TeacherVO(String teacherNumber, String teacherName, char gender, String subject, int money) {
		setTeacherNumber(teacherNumber);
		setTeacherName(teacherName);
		setGender(gender);
		setSubject(subject);
		setMoney(money);
	}

	public String getTeacherNumber() {
		return TeacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		TeacherNumber = teacherNumber;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println(" 교사번호 :  " + TeacherNumber + " 이름 : " + TeacherName + " 성별 : " + gender + " 담당과목 : "
				+ subject + " 급여 : " + money + "원");

	}
}
