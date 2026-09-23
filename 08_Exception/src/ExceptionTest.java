// Exception은 api에서 응용된다. 
// 하지만 유일하게 배열은 VM이 알아서 해주기때문에 객체가 없다!
// 예외는 -1, 2가 문제 / 44나 55 / 예외가 발생되면 어디까지 관리할 지 결정하는게 핵심!!   
public class ExceptionTest {
	public static void main(String[] args) {

		int[] sizes = { 44, 55 };

		for (int i = -1; i < 3; i++) {
			try {
				System.out.print(sizes[i] + " ");
			} catch (ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
			}
		}

		System.out.println("\n정상종료 되었습니다.");
	}

}
