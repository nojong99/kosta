package test.kr.swdl.school;

import kr.swdl.school.Student;
import kr.swdl.school.Teacher;

// data 중심의 객체를 만들었음. 
// data 중심의 객체는 자료의형태 type = 기본형 타입 & 객체형 타입
public class TypeTest {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 10;
		String s1 = "hi";
		String s2 = new String("hi"); // VM이 해결해줌 ?
		Student student = new Student("200101001", "홍길동", 'M');
		// 이클립스가 new Student(s1, s2, 0); 이렇게 만듦 
		// 타입을 출력할 때
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(student);//a~f는 주소값
		System.out.println(student.toString());
		Teacher teacher = new Teacher(" 이순신 ", 'M', " t001 ");
		Teacher teacher2 = new Teacher(" 이순신 ", 'M', " t001 ");
		Teacher teacher3 = new Teacher(" 이순신 ", 'M', " t001 ");
		
		System.out.println(teacher.toString());
		System.out.println(number1 == number2);
		System.out.println(s1.equals(s2));
		System.out.println(teacher == teacher2);
		System.out.println(teacher.equals(teacher2));
		
		
	}
}
