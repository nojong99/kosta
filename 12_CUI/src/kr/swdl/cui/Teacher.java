package kr.swdl.cui;

public class Teacher extends Member{
	private String Tno;
	private String subject;
	private static int count;
	
	 
	public Teacher(String subject, String name) {
		super();
		this.Tno= "T00"+count++;
		setSubject(subject);
		setName(name);
	}
	
	
	public String getTno() {
		return Tno;
	}
	 
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return " 교번 " + Tno + " 이름 " +  getName() + " 과목 " + subject;
	}
	 
}
