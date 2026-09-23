//노종현
package kr.swdl.school;

public class EmployeeVO {
	String employeeNumber;
	String employeeName;
	char gender;
	int money;
 

	public EmployeeVO(String employeeNumber, String employeeName, char gender, int money) {
		setEmployeeNumber(employeeNumber);
		setEmployeeName(employeeName);
		setGender(gender);
		setMoney(money);
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println(
				" 교직원번호 : " + employeeNumber + " 이름 : " + employeeName + " 성별 : " + gender + " 급여 : " + money + "원");
	}

}
