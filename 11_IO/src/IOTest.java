import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("123ABC한글");

		InputStream is = System.in; // Node 타입
		// 간단한 예외는 throws
		// tip! system.in이 기다리는 중 / 앞에 byte만 읽어들인다.
		// byte에서 char로 변경하는 필터가있다 .
		InputStreamReader isr = new InputStreamReader(is); // 동적 1:1 관계 연결
//		int in = isr.read();
//		System.out.println(in);
//		System.out.println((char)(in+3));
		// char를 스트링으로 변경
		BufferedReader br = new BufferedReader(isr);
		//입력받은 문자열이 월을 처리하기 위해서는 정수만 입력 
		String data = br.readLine();
		System.out.println(Integer.parseInt(data));
		
	}
}
