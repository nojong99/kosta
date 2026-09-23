package kr.swdl.gym.dao;

import java.util.List;
import kr.swdl.gym.vo.AdminVO;
import kr.swdl.gym.vo.MemberPassDTO;
import kr.swdl.gym.vo.MemberVO;
import kr.swdl.gym.vo.PassVO;

public interface Gym {
	AdminVO loginAdminInfo(String adminNumber, String password);

	List<MemberVO> getMemberList();

	MemberVO getMemberInfo(String memberNumber);

	List<MemberPassDTO> getMemberPass(String memberNumber);

	List<PassVO> getPassList();

	boolean updatePass(String passNumber, String passName, int price, String detail);

	boolean updateMemberInfo(String memberNumber, String name, String gender, String birth, String phone, String purpose,
			String route, String comments);

}
