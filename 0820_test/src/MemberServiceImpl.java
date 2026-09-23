import java.util.Scanner;

public class MemberServiceImpl {
	MemberVO memberVO;
	boolean flag = true;

	public String startMsg() {
		return "프로그램 실행 메뉴를 입력하세요.\n" + "1. 이름 입력\n" + "2. 이름 확인\n" + "q. 종료\n";
	}

	public String nameCall() {
		return "이름을 입력하세요.";
	}

	public String scannerCall() {
		Scanner sc = null;
		return sc.nextLine();
		
	}
	public String insertName(String name) {
		memberVO = new MemberVO(name);
		return name + "님 등록되었습니다.";
	}

	public String selectName() {
		memberVO.getName();
		return "현재 등록된 이름은 " + memberVO.getName() + "입니다.";
	}

	public String shutDown() {
		flag = false;
		return "시스템이 종료됩니다.";
	}
}
