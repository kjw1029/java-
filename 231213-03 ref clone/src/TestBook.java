// 책을 4권 보관할 수 있는 책장에
// 파워자바, 20000
// 파워자바의 복사본
// 스프링, 25000
// 비어있음

public class TestBook {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		Book powerJava = new Book("p", 20000);
		
		bookShelf.setBook1(powerJava);
//		bookShelf.setBook2(powerJava);
		bookShelf.setBook2(CopyWriter.shallowCopy(powerJava));
	
		
		Book book1 = bookShelf.getBook1();
		book1.setTitle("파워를자바라");
		Book book2 = bookShelf.getBook2();
		System.out.println(book2.getTitle());
		
		Book spring = new Book("스프링", 25000);
		bookShelf.setBook3(spring);
		
		bookShelf.setBook3(null);
		bookShelf.setBook4(spring);
	}

}
