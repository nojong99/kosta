package test.kr.swdl.admin;

import kr.swdl.admin.CustomerService;
import kr.swdl.admin.CustomerVO;

public class CustormerServiceTest {
	public static void main(String[] args) {
		CustomerService service;
		service=new CustomerService();
		System.out.println(service.addCustomer(new CustomerVO("홍길동", "M", 16)));
		
	}
}
