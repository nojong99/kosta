package kr.swdl.admin;
// 만일 명확한 요구사항이라고 판단을 했다면 선택(인터페이스 or 클래스)
// 입력 하나로 본다는 가정!
public class CustomerService {
	// overloading - 업무는 1개인데 입력값이 다양하게 해석되거나 추가될 수 있는 상황에 하는 것
	// 입력과 동시에 문제없이 처리됐는지 확인 - 저장?
	// CustomerVO <- 지금 넣을 값은 3개지만 추후 2개를 더 확인해야하기 때문에 해당 리턴 타입 사용
	// email
	// 메서드, 생성자의 인터페이스를 찾아내는 찾아내는 분석설계 스킬, 앱스트렉션하는 과정
	public CustomerVO addCustomer(String name, String gender, int point) {
		// 나중에는 db에서 처리
		return new CustomerVO(name, gender, point);
	}
	public CustomerVO addCustomer(CustomerVO vo) {
		// email의 요구사항이 결정 x
		return addCustomer(vo.getName(), vo.getGender(), vo.getPoint());
	}
}
