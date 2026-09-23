package kr.swdl;

public interface MemberService {
	public MemberVO CreateMember(String memberId, String name,char gender) throws NameSizeException, GenderValueException;
}
