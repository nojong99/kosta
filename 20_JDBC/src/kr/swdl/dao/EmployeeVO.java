package kr.swdl.dao;
//VO 1. table 2. 요구사항기반(학번, 급여, 이름) 3. join, view(테이블이 합쳐지는 경우)의 결과
//vo를 만드는 기준 컬럼의 개수
public class EmployeeVO {
	private int employeeId;
	private float salary;
	private String firstName;
	
	public EmployeeVO() {}
	
	public EmployeeVO(int employeeId, float salary, String firstName) {
		setEmployeeId(employeeId);
		setSalary(salary);
		setFirstName(firstName);
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", salary=" + salary + ", firstName=" + firstName + "]";
	}
	
	
	
}
