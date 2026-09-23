import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		// byte-char-String-2자리 정수 읽음
		// exception이 3개지만 오류 없다 -> runtime일 확률이 높다.
		int num = sc.nextInt();
		System.out.println(num);
	}
}
