package kr.swdl.dao;

public class DepartmentVO {
	private int employeeId;
	private int departmentId;
	private String departmentName;
	private float salary;
	
	
	
	public DepartmentVO(int employeeId, float salary) {
		setEmployeeId(employeeId);
		setSalary(salary);
	}
	public DepartmentVO(int employeeId, String departmentName) {
		setEmployeeId(employeeId);
		setDepartmentName(departmentName);
	}
	
	public DepartmentVO(int employeeId, int departmentId, String departmentName, float salary) {
		setEmployeeId(employeeId);
		setDepartmentId(departmentId);
		setDepartmentName(departmentName);
		setSalary(salary);
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "DepartmentVO [employeeId=" + employeeId + " salary="
				+ salary+"]";
	}

	
	
	
	 
	
	
}
