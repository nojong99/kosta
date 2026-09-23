package test.kr.swdl.school;

import kr.swdl.school.StudentVO; // 다른 패키지에 있다면 import
import kr.swdl.school.TeacherVO;

// 패키지를 나눴음 실제 코드랑 테스트 코드를 분리하기 위함
public class StudentVOTest {
	public static void main(String[] args) {
		int month = 10;
		StudentVO s1 = new StudentVO("200101001", "홍길동", 'M');
		s1.print();

		// StudentVO s2 = new StudentVO();
//		// s2.setStudentNumber("200101002");
//		s2.setName("이");
//		s2.setGender('M');
//
//		s2.print();

	}

}
