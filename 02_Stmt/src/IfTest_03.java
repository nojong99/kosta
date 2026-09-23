import java.util.Scanner;

public class IfTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		int sm = sc.nextInt();
		int month = 4;
		int d = 31;
		switch (sm) {
		case 2: {
			d = 28;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			d = 30;
			break;
		}

		default:
			d = 31;
			break;
		}
		System.out.println(sm + "월은 " + d + "일까지");
	}

}
