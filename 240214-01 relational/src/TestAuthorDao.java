import java.util.List;

public class TestAuthorDao {
	public static void main(String[] args) {
		AuthorDAO dao = new AuthorDAO();
		BookDAO bookDAO = new BookDAO();

		Author author = dao.getById(2);
		System.out.println(author);
		
		
		
//		List<Author> list = dao.getAll();
//		for (Author a : list) {
//			List<Book> bookList = bookDAO.getByAuthorId(a.getId());
//			a.setBooks(bookList);
//			for (Book b : bookList) {
//				b.setAuthor(a);
//			}
//		}
		
//		System.out.println(list.get(0).getBooks().get(0).getAuthor().getName());
//		System.out.println(list); // toString 수정 서로 계속 주고 받음
//		List<Book> bookList =bookDAO.getByAuthorId(1);
//		System.out.println(bookList);
	} 
}
