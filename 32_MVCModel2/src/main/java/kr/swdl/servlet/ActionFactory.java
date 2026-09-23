package kr.swdl.servlet;
//중간다리
public class ActionFactory {

	public static Action getAction(String cmd) {
		if(cmd == null) cmd="";
		Action a = null;
		// 메뉴-> 규칙이 없지만 값을 비교한다.
		switch (cmd) {
		
		case "customersUI":
			a=new CustomersUIAction();
			break;
		case "addCustomerAction":
			a=new AddCustomerAction();
			break;
		case "addCustomerUI":
			a=new AddCustomerUIAction();
			break;
		case "loginUI": 
			a=new LoginUIAction2();
			break;
		case "loginAction":
			a=new LoginAction();
			break;
		case "logoutAction":
			a=new LogoutAction();
		case "waste":
			a=new waste();
			break;
		case "wasteList":
			a=new wasteList();
			break;
		case "memberInventoryList":
			a=new memberInventoryList();
			break;
		default :
			a= new MainUIAction();
		}
		return a;
	}
	
}
