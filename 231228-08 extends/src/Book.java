
public class Book {
	private String title;
	private int totalpage;
	private String author;
	
	
	public Book(String title, int totalpage, String author) {
		super();
		this.title = title;
		this.totalpage = totalpage;
		this.author = author;
	}
	
	public void allPrint() {
			System.out.println("제목: " + title);
			System.out.println("페이지수: " + totalpage);
			System.out.println("작가명: " + author);
	}

	public String getTitle() {
		return title;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
