package kr.swdl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

public class CustomerDAO {
	private Connection conn;

	
	public CustomerDAO() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		Class.forName(driver);
		System.out.println("1. driver loading OK!");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2. DBMS 연결 OK!");
	}

	// 고객 등록 - 최초 포인트는 없다. + 
	public boolean addCustomer(String name, String phoneNo) {
		boolean result = false;
		String sql = "insert into customers (customer_no, name, phone_no, in_date) "
				+ "values (customer_no_seq.nextval, ?, ?, sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNo);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public boolean addPoint(int point, int customerNo) {
		boolean result = false;
		String sql = "update customers set point = NVL(point, 0) +? where customer_no = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, point);
			pstmt.setInt(2, customerNo);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public CustomerVO customerInfo(int customerNo) {
		
		String sql = "select CUSTOMER_NO, NAME, PHONE_NO, POINT, IN_DATE from customers WHERE CUSTOMER_NO=?";

		PreparedStatement pstmt;
		CustomerVO cvo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customerNo);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			cvo =  new CustomerVO(customerNo, rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cvo;
	}

	public boolean deleteCustomer(int customerNo) {
		boolean result = false;
		String sql = "delete from customers where CUSTOMER_NO=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customerNo);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
