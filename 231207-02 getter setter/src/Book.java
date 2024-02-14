// 책
// 제목
// 출판사
// 가격
// 작가이름
public class Book {
	String title;
	String publisher;
	int price;
	String authorName;
	
	public Book(String title, String publisher, int price, String authorName) {
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.authorName = authorName;
	}
	
	// 설정자 (settet)
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 접근자 (getter)
	public int getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		Book b = new Book("파워자바", "인피니티", 30000, "천인국");
		System.out.println(b.getPrice());
		b.setPrice(10000);
		System.out.println(b.getPrice());
	}
}
