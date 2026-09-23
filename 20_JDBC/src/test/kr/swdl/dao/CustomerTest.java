package test.kr.swdl.dao;

import java.sql.SQLException;

import kr.swdl.dao.CustomerDAO;

public class CustomerTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CustomerDAO c= new CustomerDAO();
		System.out.println(c.addCustomer("이순신", "010-1111-2212"));
//		System.out.println(c.addPoint(50, 3));
//		System.out.println(c.customerInfo(1));
		System.out.println(c.customerInfo(3));
//		System.out.println(c.deleteCustomer(5));
	}
}
