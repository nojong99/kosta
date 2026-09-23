package test.kr.swdl.gym;

import java.sql.SQLException;
import kr.swdl.gym.dao.GymMemberDAO;

public class GymTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GymMemberDAO Gym = new GymMemberDAO();
//		System.out.println(Gym.loginAdminInfo("A020", "nojong123"));
		System.out.println(Gym.getMemberList());
//		Gym.getMemberInfo("20");
//		System.out.println(Gym.getPassList());
//		System.out.println(Gym.updatePass("15", "골프 12개월권", 900000, "오픈 이벤트 가~"));
//		System.out.println(Gym.updatePass("16", "골프 1개월권", 180000, "오픈 이벤트 가~"));
//		System.out.println(Gym.getMemberPass("20"));
		System.out.println(Gym.updateMemberInfo("20","이진호", "남자", "1997-09-04", "010-8888-7777", "대회 준비 중~", "지인소개~", "휴회 40일"));
	}
}
