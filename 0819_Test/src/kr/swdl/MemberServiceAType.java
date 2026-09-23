package kr.swdl;

import java.time.LocalDate;

public class MemberServiceAType implements MemberService {

	@Override
	public MemberVO CreateMember(String memberId, String name, char gender) throws NameSizeException, GenderValueException {
		MemberVO membervo = null;
		int defaultPoint = 10;
		int eventPoint = 0;
		if (LocalDate.now().getMonthValue() == 8) {
			eventPoint = 5;
		}

		membervo = new MemberVO(memberId, name, gender, defaultPoint + eventPoint);
		return membervo;
	}

	
}
