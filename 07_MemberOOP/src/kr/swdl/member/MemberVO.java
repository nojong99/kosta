package kr.swdl.member;

import java.util.Objects;

public class MemberVO {
	private String memberId;
	private String password;
	private String name;
	private int point;

	public MemberVO(String memberId, String password, String name, int point) {
		this.memberId = memberId;
		setPassword(password);
		setName(name);
		setPoint(point);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberId() {
		return memberId;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + ", point=" + point + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(memberId, other.memberId);

	}
}
