
//노종현
import java.util.Scanner;

public class IfTest_04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String op = sc.next();
		String op = "C";
		String msg = "기본형";

		switch (op) {

		case "C":
			msg += " 카메라";

		case "B":
			msg += " 썬루프";

			System.out.println(msg);
		}

	}
}
