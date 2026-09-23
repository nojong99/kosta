package test.kr.swdl.model;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.swdl.model.CustomerDAO;
import kr.swdl.model.DBCP;

public class CustomerDAOTXTest {
	private Connection conn;
	@Before
	public void 단위_테스트_시작() throws Exception {
		conn=DBCP.getConnection();
		conn.setAutoCommit(false); // 자동 확정 해제 꼭!!!
	}
	@After
	public void 단위_테스트_종료() throws Exception {
		// 업무일때는 확정(commit) 테스트 취소
		conn.rollback();
		conn.setAutoCommit(true); // 원상복구		
	}
	@Test
	public void testAddCustomer() {
		new CustomerDAO(conn).addCustomer("yyy", "010-5552-1123");
		           
	}

}
