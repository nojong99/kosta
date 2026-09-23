package test.kr.swdl.member;

import kr.swdl.member.MemberService;
import kr.swdl.member.MemberServiceAType;
import kr.swdl.member.MemberVO;

public class AbstractMemberTest {
	public static void main(String[] args) {
		// 어떤 방식으로 로그인을 할 지 결정못했지만, 회원정보를 확인하라! 
		MemberService service;
		service = new MemberServiceAType(
				new MemberVO("memberId", "memberPw!", "노종현", 100)); //테스트 코드를 만들면서 멤버 데이터를 구해보자! 
		System.out.println(service.getMember("memberId"));
		System.out.println(service.getMember("m"));
		System.out.println(service.updatePassword("memberPw!", "1234"));
		System.out.println(service.updatePassword("memberPw!", "1234"));
		System.out.println(service.getPoint("memberId"));
		System.out.println(service.getPoint("m"));
	}
}
