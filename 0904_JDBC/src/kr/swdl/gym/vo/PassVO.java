package kr.swdl.gym.vo;

public class PassVO {
	private String passNum;
	private String passName;
	private int price;
	private String passDetail;
	
	public PassVO() {
	}
	
	public PassVO(String passNum, String passName, int price, String passDetail) {
		setPassNum(passNum);
		setPassName(passName);
		setPrice(price);
		setPassDetail(passDetail);
	}

	public String getPassNum() {
		return passNum;
	}
	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}
	public String getPassName() {
		return passName;
	}
	public void setPassName(String passName) {
		this.passName = passName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPassDetail() {
		return passDetail;
	}
	public void setPassDetail(String passDetail) {
		this.passDetail = passDetail;
	}
	@Override
	public String toString() {
		return "PassVO [passNum=" + passNum + ", passName=" + passName + ", price=" + price + ", passDetail="
				+ passDetail + "]\n";
	}
	
	
}
