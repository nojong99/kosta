
public class LoopTest_03 {
	public static void main(String[] args) {
		int inputNumber = 2; // 매개인자
		String outData = "";

		for (int i = 1; i < 10; i++) {
			outData += (inputNumber + " * " + i + " = " + inputNumber * i + "\n");
		}
		System.out.println(outData); // 리턴타입
	}
}
