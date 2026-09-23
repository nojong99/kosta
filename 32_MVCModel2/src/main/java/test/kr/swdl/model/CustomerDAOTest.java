package test.kr.swdl.model;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//표준 아님

import kr.swdl.model.CustomerDAO;
import kr.swdl.model.DBCP;

public class CustomerDAOTest {
	private static Connection conn;
	@BeforeClass
	public static void 클래스_사전동작() throws SQLException {
		conn=DBCP.getConnection();
		System.out.println("클래스 사전동작-select 공통 코드");
	}
	//트랜잭션 메서드 
	// commit뒤에서 함 
	@Before
	public void 단위테스트_사전동작() {
		System.out.println("단위테스트 사전동작");
	}
	@Test
	public void 고객정보_못_가져오기() throws SQLException {
		assertEquals(new CustomerDAO(conn).getCustomer(400), null);
	}
	@Test
	public void 고객정보_이름_가져오기() throws SQLException {
		assertEquals(new CustomerDAO(conn).getCustomer(4), "이순신");
	}
}
