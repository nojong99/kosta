// 0~10까지 출력하세요
public class LoopTest_01 {
	public static void main(String[] args) {
		System.out.println("<<for문>>");
		String message = "";
		for(int i=0; i<10; i++) {
//			System.out.print(i+" ");
			message +=(i+" ");
		}
		System.out.print(message);
		System.out.println("\n<<while문>>");
		int j=0;
		while(j<10) {
			System.out.print(j+" ");
			j++; // 업데이트 구문 
		}
	}

}
