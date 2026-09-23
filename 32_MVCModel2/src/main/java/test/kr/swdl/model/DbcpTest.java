package test.kr.swdl.model;

import java.sql.SQLException;

import kr.swdl.model.CustomerDAO;
import kr.swdl.model.DBCP;

public class DbcpTest {

	public static void main(String[] args) {
		try {
			CustomerDAO cdao = new CustomerDAO(DBCP.getConnection());
			System.out.println(cdao.getCustomer(3));
			System.out.println(cdao.getCustomer(13));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
