package kr.swdl.gym.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.swdl.gym.vo.AdminVO;
import kr.swdl.gym.vo.MemberPassDTO;
import kr.swdl.gym.vo.MemberVO;
import kr.swdl.gym.vo.PassVO;

public class GymMemberDAO implements Gym {
	private Connection conn;

	public GymMemberDAO() throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		Class.forName(driver);
		System.out.println("1. driver loading OK!");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("2. DBMS 연결 OK!");
	}
	 
	@Override
	public AdminVO loginAdminInfo(String adminNumber, String password) {
		String sql = "select name, role from admins " + "where admin_number=? and password=?";
		PreparedStatement pstmt;
		AdminVO avo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, adminNumber);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				avo = new AdminVO(rs.getString(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avo;
	}

	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> list = new ArrayList<>();
		String sql = "select name,gender,birth,phone from members";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new MemberVO(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4)));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberVO getMemberInfo(String memberNumber) {
		MemberVO mvo = null;
		String sql = "select members.member_number, members.NAME, members.gender, members.birth, "
				+ "members.phone, members.IN_DATE, members.purpose, members.route,members.COMMENTS, "
				+ "members.total_amount, admins.ADMIN_NUMBER from members, admins "
				+ "where members.admin_number=admins.ADMIN_NUMBER and members.member_number=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberNumber);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				mvo = new MemberVO(memberNumber, rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5),
						rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10),
						rs.getString(11));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mvo;
	}

	@Override
	public List<MemberPassDTO> getMemberPass(String memberNumber) {
		List<MemberPassDTO> list = new ArrayList<>();
		String sql = "select pass_info.pass_name, pass_info.price, members_pass.start_date, "
				+ "members_pass.END_DATE, members_pass.PAYMENT_DATE "
				+ "from members_pass, pass_info where members_pass.member_number=? "
				+ "and members_pass.PASS_NUM=pass_info.PASS_NUM";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberNumber);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new MemberPassDTO(rs.getString(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getDate(5)));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<PassVO> getPassList() {
		List<PassVO> list = new ArrayList<>();
		String sql = "select pass_num, pass_name, price, pass_detail from pass_info";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new PassVO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean updatePass(String passNumber, String passName, int price, String detail) {
		boolean result = false;
		String sql = "update pass_info set pass_name=? ,price=? ,pass_detail=? " + "where pass_num=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, passName);
			pstmt.setInt(2, price);
			pstmt.setString(3, detail);
			pstmt.setString(4, passNumber);
			result = pstmt.executeUpdate() == 1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean updateMemberInfo(String memberNumber, String name, String gender, String birth, String phone, String purpose,
			String route, String comments) {
		boolean result = false;
		String sql ="update members set name=?,gender=?,birth=?, phone=?, "
				+ "purpose=?, ROUTE =?, comments=? where member_number=?";
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setString(3, birth);
			pstmt.setString(4, phone);
			pstmt.setString(5, purpose);
			pstmt.setString(6, route);
			pstmt.setString(7, comments);
			pstmt.setString(8, memberNumber);
			result = pstmt.executeUpdate()==1;
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
