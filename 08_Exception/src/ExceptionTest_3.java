// 

import java.util.Date;

public class ExceptionTest_3 {
	public static void main(String[] args) {
		Date d = new Date(); // 컴파일 할 때 먼저 생성여부 확인
		
		try {
			Class.forName("java.util.Dat");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 실행 시에만 경로를 확인
		System.out.println("he");
	}
}
