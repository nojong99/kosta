package kr.swdl;

import java.util.Objects;

public class Employee {
	private String EmpNumber;
	private String name;
	private int salary;

	public Employee(String empNumber, String name, int salary) {
		setEmpNumber(empNumber);
		setName(name);
		setSalary(salary);
	}

	public void setEmpNumber(String empNumber) {
		EmpNumber = empNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpNumber() {
		return EmpNumber;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(EmpNumber, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(EmpNumber, other.EmpNumber) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employee [EmpNumber=" + EmpNumber + ", name=" + name + ", salary=" + salary + "]";
	}

	public String EmplInfo(Employee[] persons) {
		
		int maxSalary=0;
		String text="";
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getSalary() > maxSalary) {
				maxSalary = persons[i].getSalary();
				text = persons[i].toString();
				}
		}
		return text;
	}
	
}
