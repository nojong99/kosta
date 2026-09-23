package kr.swdl.member;
//로그인? -> 
//3. 확정되지 않거나 애매한 구현부는 1가지 이상일 경우가 많
// 이 예제를 왜하냐면 -> vo -< lmp 만들어놓고 아무것도 안했을 때 
public class MemberServiceAType extends AbstractMemberService{

	public MemberServiceAType(MemberVO sampleData) {
		super(sampleData);
	}

	@Override
	public MemberVO login(String memberId, String password) {
		return null;
	}

	@Override
	public MemberVO login(MemberVO memberVO) {
		return null;
	}
	
}
