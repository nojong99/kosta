package test.kr.swdl.admin;

import kr.swdl.admin.CustomerVO;

// 보통 이 테스트 코드는 다음 코드의 구현부로 활용할 수 있다. ! 구현부는 impl
// 2차적으로는 다음 코드의 구현부~ 
// 요구사항에 맞지 않음 하지만, 어떻게든 결과값이 나오면 괜찮
// gender => char, point>=10, date -> 같은 데이터라하더라도 상황을 결정하는 방식이 다름
// checked or runtime 인지 
public class CustomerVOTest {
	public static void main(String[] args) {
//		CustomerVO v1 = new CustomerVO("홍길동", "남", 5, "2001-01-01", "email@gmail.com");
// 		인터페이스부터 수정 이후 구현부 수정 -> 마음에 안들어도 테스트 코드는 수정하지 않고 인터페이스 수정(디테일)
		// 문법, 패턴, 프레임워크(불편함을 느껴야 프레임워크를 쓰는 이유가 생김)
		// 필요한 건 설계도를 만들 되, 과하게 하지말라
		// 
		CustomerVO v1 = new CustomerVO("홍길이", "M", 15);
		System.out.println(v1);
	}
} 
