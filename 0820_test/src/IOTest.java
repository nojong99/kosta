import java.util.Scanner;

public class IOTest {
	public static void main(String[] args) {
		MemberServiceImpl impl = new MemberServiceImpl();
		Scanner sc = new Scanner(System.in);

		while (impl.flag) {
			System.out.println(impl.startMsg());

			switch (sc.nextLine()) {
			case "1":
				System.out.println(impl.nameCall());
				System.out.println(impl.insertName(sc.nextLine()));
				break;
			case "2":
				System.out.println(impl.selectName());
				break;
			case "q":
				System.out.println(impl.shutDown());
			}
		}
	}
}
