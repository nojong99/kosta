import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		//jar 파일 배포 시 driver 갖고있는 인터페이스 찾기
		// 복잡한 코드가 아니라 throws
		// 라이브러리를 강제로 적용하는 방법 
		
		Class.forName(driver);
		System.out.println("1. driver loading OK!");
		// 메모리에 올라간 것을 관리하는
		// 다리를 만드는 커넥션
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn =  DriverManager.getConnection(url,"hr","hr");
		System.out.println("2. DBMS 연결 OK!");
 
		// 업무에 따라 sql과 결과처리
		// 사원의 사번, firstname, 급여
		String sql = "select employee_id, first_name, salary from employees";
		Statement stmt = conn.createStatement(); // 차선
		// 결과는 따라온다.
		ResultSet rs = stmt.executeQuery(sql);
		// 이마트 갔을때 장바구니 -> 집으로 가져오면 안돼요! 이 커넥션 안에서만 쓸수있다.
		// 몇개인지 예상할 수 없이 많음, 그냥 위치값이다.
		// 데이터나 자료형의 크기를 확인 
		// 모든 데이터 베이스는 문자열이기때문에 salary(number)도 오류안남
		while(rs.next()) 
			System.out.println(rs.getString(1)+" "+rs.getString(2)
			+" "+rs.getFloat(3));
		// 5. 자원 반환 
		rs.close();
		stmt.close();
		conn.close();
		
	}
}
