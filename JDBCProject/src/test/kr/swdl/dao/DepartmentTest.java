package test.kr.swdl.dao;

import java.sql.SQLException;

import kr.swdl.dao.DepartmentDAO;

public class DepartmentTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DepartmentDAO dao =new DepartmentDAO();
		System.out.println(dao.getMaxSalayInfo("Sales"));
		
	}

}
