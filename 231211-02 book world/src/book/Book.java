package book;
// 책
// 제목
// 가격
// 작가명
// 작가이메일

// 생정자 (모든필드)
// 게터/세터 쌍
public class Book {
	private String name;
	private int price;
	private String write;
	private String e_mail;
	private author author;
	
	public Book(String name, int price, 
			author author) {
		this.name = name;
		this.price =price;
		this.author = author;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public author getWrit() {
		return author;
	}
	public void setWrit(author author) {
		this.author = author;
	}
	public String getWritName() {
		return author.getName();
	}
	
	public String getWritE_mail() {
		return author.getE_mail();
	}
}
