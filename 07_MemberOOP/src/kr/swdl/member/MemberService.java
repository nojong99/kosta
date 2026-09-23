package kr.swdl.member;

public interface MemberService {
	//	비밀번호 수정 완료 시 true 
	boolean updatePassword(String oldPw, String newPw);
	int getPoint(String memberId);
	MemberVO getMember(String memberId); //이름만 확인한다. 
	MemberVO login(String memberId,String password);
	MemberVO login(MemberVO memberVO);
}
