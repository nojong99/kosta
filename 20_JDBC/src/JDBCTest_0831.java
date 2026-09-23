import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_0831 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String firstName = " ";

		Class.forName(driver);
		System.out.println("1. driver loading OK!");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2. DBMS 연결 OK!");

		String sql = "select employee_id, salary, department_id from employees " + "where first_name='" + firstName
				+ "'";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

		rs.close();
		stmt.close();
		conn.close();

	}
}
