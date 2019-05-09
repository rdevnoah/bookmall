package bookmall.vo;

public class CartVo {
	private String bookTitle;
	private int amount;
	private int price;
	private Long memberNo;
	private Long bookNo;

	public CartVo() {
	}

	public CartVo(Long memberNo, Long bookNo, int amount) {
		this.memberNo = memberNo;
		this.bookNo = bookNo;
		this.amount = amount;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public Long getBookNo() {
		return bookNo;
	}

	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}

	@Override
	public String toString() {
		return "CartVo [bookTitle=" + bookTitle + ", amount=" + amount + ", price=" + price + ", memberNo=" + memberNo
				+ ", bookNo=" + bookNo + "]";
	}

}
