package kr.swdl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
	private Connection conn;
	// 생성자가 무조건 메소드보다 먼저 실행되는 애들이다
	// 확실하게 공통 코드만들기 가능
	public DepartmentDAO() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		Class.forName(driver);
		System.out.println("1. driver loading OK!");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2. DBMS 연결 OK!");
	}
	
	public String  getDepartmentInfo(int departmentId){
		List<DepartmentVO> list = new ArrayList<>();
		String sql ="select employees.employee_id, departments.department_name from employees, departments where employees.department_id=? and employees.department_id=departments.department_id";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
				list.add(new DepartmentVO(rs.getInt(1), rs.getString(2)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list.toString();
		
	}
	
	public DepartmentVO getMaxSalayInfo(String departmentName) {
		String sql = "select distinct employees.employee_id, employees.salary from employees,departments "
				+ "where (select MAX(employees.salary) from employees,departments "
				+ "where departments.department_name=? and employees.department_id=departments.department_id) =employees.salary";
		DepartmentVO dvo=null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, departmentName);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			dvo = new DepartmentVO(rs.getInt(1),rs.getFloat(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dvo;
		
	}
	
	
}
