
public class Author extends Person{
	private String bookTitle;
	
	public Author (String name, String bookTitle) {
		super(name);
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
}
