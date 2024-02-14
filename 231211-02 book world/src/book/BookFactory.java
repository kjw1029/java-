package book;

public class BookFactory {
	public Book createPowerJava() {
		return new Book("파워자바", 25000,
			new author("천인국", "chun@naver.com"));
	}
	
	public static void main(String[] args) {
		BookFactory fac = new BookFactory();
		Book powerJava1 = fac.createPowerJava();
		Book powerJava2 = fac.createPowerJava();
		Book powerJava3 = fac.createPowerJava();
		
		System.out.println(powerJava1.getName());
		System.out.println(powerJava2.getName());
		System.out.println(powerJava3.getName());
		
	}
}
