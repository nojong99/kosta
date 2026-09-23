// 자주 사용하는 api 
public class ExceptionTest_2 {
	public static void main(String[] args) {
		// 정수를 문자열로 변경하라!
		int number = 10;
		String numberString = number+"";
		
		// 웹에서 입력받을때 "50" --> 정수
		String data = "5";
		int dataInt=0; // 지역변수 {} 밖에서 초기화가 안되면 stack은 문제발생 -> 디폴트 초기화
		try {
			dataInt = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(dataInt);
		System.out.println("정상종료");
	}
}
