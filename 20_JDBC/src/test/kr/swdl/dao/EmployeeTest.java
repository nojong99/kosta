package test.kr.swdl.dao;

import java.sql.SQLException;

import kr.swdl.dao.EmployeeDAO;

public class EmployeeTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//  모델이 ui랑 만날일이없으니 throws
		// 다각도로 테스트 할 필요가 없다 입력값이 없음
		// select는 오류 상황이 존재 x 쿼리문은 검증된 것만 사용하기 때문에 
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.getEmployeeAVG());
		System.out.println(dao.getEmployeeSalary(100));
		System.out.println(dao.getEmployeeSalary(1));
//		System.out.println(dao.getEmployees("Pat"));
//		System.out.println(dao.getEmployees("William"));
	}
}
