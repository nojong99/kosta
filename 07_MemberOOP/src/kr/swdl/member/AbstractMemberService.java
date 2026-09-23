package kr.swdl.member;

//
public abstract class AbstractMemberService implements MemberService {
	private MemberVO memberVO;

	public AbstractMemberService(MemberVO sampleData) {
		memberVO = sampleData; // 생성자를 만들고 필요한 데이터를 추론해서 memberData를 올림 좋은거아님;;;;
	}

	@Override
	public boolean updatePassword(String oldPw, String newPw) {
		// memberVO에 비밀번호를 확인하고 새 비밀번호를 등록 <- 구현하기위해서는 memberVO의 메서드가 필요 < TDD 방식;;;;;
		// 인터페이스를 구현하려고 보니까 vo에는 getPassword가 필요할 것 같다!
		if (memberVO.getPassword().equals(oldPw)) {
			memberVO.setPassword(newPw);
			return true;
		}
		return false;
	}

	@Override
	public int getPoint(String memberId) {
		// 등록된 회원의 포인트만 확인 (없는 회원 -1 or 예외 발생)
		if(memberVO.getMemberId().equals(memberId)) {
			return memberVO.getPoint();
		}
		return -1;
	}

	@Override
	public MemberVO getMember(String memberId) {
		if(memberVO.getMemberId().equals(memberId)) {
			return memberVO;
		}
		return null; //예외
	}
	
	

}
