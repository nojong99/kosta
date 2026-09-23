package kr.swdl.cui;

import java.util.Objects;

public class Student extends Member{
	private String Sno;
	private String gender;
	private static int count;
	
	public Student( String gender, String name) {
		super();
		this.Sno= "S00"+ ++count;
		setGender(gender);
		setName(name);
	}
	
	public String getSno() {
		return Sno;
	}
	 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return " 학번 " + Sno + " 이름 " +  getName() + " 성별 "+gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Sno, gender);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Sno, other.Sno) && Objects.equals(gender, other.gender);
	}
	 
}
