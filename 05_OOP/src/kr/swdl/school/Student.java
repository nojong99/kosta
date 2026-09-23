package kr.swdl.school;

import java.util.Objects;

// 학번, 이름, 성별
public class Student extends Person{
	//1. member data
	private String stuentNumber;

	public Student(String stuentNumber, String name, char gender) {
		super(name, gender);
		this.stuentNumber = stuentNumber;
	}

	public String getStuentNumber() {
		return stuentNumber;
	}
	
	//overriding - 구현부 변경  
	@Override
	public void print() {
		System.out.print("학번 : "+stuentNumber);
		super.print();
	}
	
	@Override
	public String toString() {
		return "학번 : "+stuentNumber+" "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(stuentNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuentNumber, other.stuentNumber);
	}
	
	
}
