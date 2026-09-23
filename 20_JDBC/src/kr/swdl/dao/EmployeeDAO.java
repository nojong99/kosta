package kr.swdl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// database를 연결하는 로딩이 먼저 실행되어야한다. 
public class EmployeeDAO {
	private Connection conn;
	// 생성자가 무조건 메소드보다 먼저 실행되는 애들이다
	// 확실하게 공통 코드만들기 가능
	public EmployeeDAO() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		Class.forName(driver);
		System.out.println("1. driver loading OK!");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2. DBMS 연결 OK!");
	}
	
	// 사원의 평균 급여를 확인하세요. - sql 검증 / 없으면 0 리턴 
	public float getEmployeeAVG(){
		String sql ="select avg(salary) from employees";
		float avg =  0; // 출력값의 디폴트 값으로 변수 선언하기
		try {
			Statement stmt = conn.createStatement(); //쿼리문이 잘못되어 오류날 x
			ResultSet rs =  stmt.executeQuery(sql);
			rs.next(); // 항상 데이터가 1개만 있으면 while, if 필요없음 
			avg=rs.getFloat(1); // 1<-개수
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} //입력값이 없어서 문제없다. 
		return avg;
	}
	// 특정 사원의 급여를 확인 사원이 존재하지 않는다. 0 or -1 의미를 부여 
	// 사원이 없는 거 -> -1로 표현
	// 의미를 부여 어렵..
	public float getEmployeeSalary(int employeeId) { 
		String sql ="select salary from employees "
				+ "where employee_id=?";
		float salary=-1;
		try {
			PreparedStatement pstmt =  conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) // 0개 1개
				salary = rs.getFloat(1); // <- 개수
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salary;
	}
	// 설계한 것의 입력값과 출력값이 같아야 한다. 
	// 공격성 문제가 생길 확률이 있다. 
	// VO까지 지정해놔야 인터페이스 설계이다. 
	public List<EmployeeVO> getEmployees(String firstName){
		List<EmployeeVO> list = new ArrayList<>();
		String sql ="select employee_id,salary from employees where first_name = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstName); // <- 알아서 '' 처리해줌 
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) 
				list.add(new EmployeeVO(rs.getInt(1),rs.getFloat(2), firstName));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
