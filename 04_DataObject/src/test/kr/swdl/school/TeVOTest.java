// 노종현
package test.kr.swdl.school;

import kr.swdl.school.EmployeeVO;
import kr.swdl.school.TeacherVO;

public class TeVOTest {

	public static void main(String[] args) {
		TeacherVO t1 = new TeacherVO("T001", "홍길동", 'M', "과학", 2400000);
		EmployeeVO e1 = new EmployeeVO("E001", "이영자", 'F', 2000000);

		t1.print();
		e1.print();
	}

}
