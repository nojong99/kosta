package kr.swdl.gym.vo;

public class AdminVO {
	private String adminNumber;
	private String name;
	private String role;
	private String password;
	
	public AdminVO() {
	}
	
	 	
	public AdminVO(String name, String role) {
		setName(name);
		setRole(role);
	}

	public String getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "AdminVO [name=" + name + ", role=" + role + "]";
	}
	
	
	
}
