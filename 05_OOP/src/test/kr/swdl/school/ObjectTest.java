package test.kr.swdl.school;

import kr.swdl.school.Person;
import kr.swdl.school.Student;

public class ObjectTest {

	public static void main(String[] args) {
		// 급여를 원 또는 달러로 받을 수 있다. <- 업무의 단위 = 급여
		double d1 = 1555;
		d1= 150.3;
		
		// 로그인 하면 학생 또는 교사의 정보를 확인할 수 있다. - 어떤 사람이라도 로그인할 수 있어야한다.?
		Person p1; //뭘로 선언할 지 모를 때
		p1 = new Student("200101001 ", "김학생 ", 'F');
		p1.print();	
		
	}

}
