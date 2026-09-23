// 노종현
public class MultipleLoopTest_01 {
	public static void main(String[] args) {
		// 입력을 받아서 해당 구구단을 출력
		int inputNumber1 = 7;
		int inputNumber2 = 9;
		int temp;
		String outData = "";

		if (inputNumber1 > inputNumber2) {
			temp = inputNumber1;
			inputNumber1 = inputNumber2;
			inputNumber2 = temp;
		}

		for (int i = 1; i < 10; i++) {
			for (int j = inputNumber1; j <= inputNumber2; j++) {
				outData +=" "+ j + " x " + i + " = " + i * j + "\t ";
			}
			outData += "\n";
		}

		System.out.println(outData);
	}
}
