package test.kr.swdl.school;

import kr.swdl.school.Person;
import kr.swdl.school.Student;
import kr.swdl.school.Teacher;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 학생 또는 교사의 정보를 3명 입력 확인
		// 단, 중복 데이터는 허용하지 않는다. ==> Collection 중에서 Set으로 처리
		Person[] persons = new Person[3]; // 가장 가까운 것부터 코딩시작;
		persons[0] = new Student("200101001", "홍길동", 'M');
		persons[1] = new Student("200101002", "이순신", 'M');
		persons[2] = new Teacher("세종대왕", 'F', "t001");
		// 모든 정보를 확인
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getName());
		}
		//정보 중에서 학생의 정보만 확인
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Student) {
				Student tmp = (Student)persons[i]; // 캐스팅
				System.out.println(tmp.getStuentNumber());
			}
		}
		
	}

}
