// 객체의 핵심 -> 재사용에 따른 유지보수 효율성
// 자바 자료형 - 기본형, 사용자 정의 타입 
public class TypeTest_01 {
	public static void main(String[] args) {
		// 기본형 - 정수, 실수, 문자, 논리
		int number1 = 10; // 선언, 연산자가 마지막에 쓰임(=)
		System.out.println(number1);
		
		number1 = 100;
		System.out.println(number1);
		// 컴파일러는 자료형의 크기
		int a1 = (char)('A');
		System.out.println(a1);
		
		float f1;
		f1 = (float) 10.5; // 타입캐스팅 <- 수식이 길어질 때
		f1 = 10.5f; // 값만 입력 시 f-F 권장

		float f2 = 10;

		int c1 = 'A'; //

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(c1 + "< >" + (char) c1);

		byte b = Byte.MAX_VALUE;

		System.out.println(b);
		int i = Integer.MAX_VALUE;
		System.out.println(i+1L);
		float d = Float.MAX_VALUE;
		System.out.println(d);
		float d1 = Float.MAX_VALUE;
		System.out.println(d1+1);
	}

}
