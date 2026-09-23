package kr.swdl.school;

import java.util.Objects;

public class Teacher extends Person{
	private String teacherNumber;

	public Teacher(String name, char gender, String teacherNumber) {
		super(name, gender);
		this.teacherNumber = teacherNumber;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	@Override
	public void print() {
		System.out.print(" 교번 : " + teacherNumber);
		super.print();
	} 
	
	@Override
	public String toString() {
		return " 교번 : " + teacherNumber+" "+super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(teacherNumber);
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
		Teacher other = (Teacher) obj;
		return Objects.equals(teacherNumber, other.teacherNumber);
	}
	
	
	
}
