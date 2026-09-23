package kr.swdl;

public class Manager extends Employee {

	private String rank;

	public Manager(String empNumber, String name, int salary, String rank) {
		super(empNumber, name, salary);
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Manager [rank=" + rank + "]"+super.toString();
	}
	@Override
	public String EmplInfo(Employee[] persons) {
		// TODO Auto-generated method stub
		return super.EmplInfo(persons);
	}
	
}
