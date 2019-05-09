package bookmall.vo;

public class OrderVo {
	private Long no;
	private Long memberNo;
	private int price;
	private String address;

	private String memberName;
	private String memberEmail;

	public OrderVo() {
	}

	public OrderVo(Long memberNo, int price, String address) {
		super();
		this.memberNo = memberNo;
		this.price = price;
		this.address = address;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", memberNo=" + memberNo + ", price=" + price + ", address=" + address
				+ ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}

}
