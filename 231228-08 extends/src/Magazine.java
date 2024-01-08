
public class Magazine extends Book {
	private String releasedate;

	
	public Magazine(String title, int totalpage, String author, String releasedate) {
		super(title, totalpage, author);
		this.releasedate = releasedate;
	}
	
	@Override // annotation
	public void allPrint() {
		super.allPrint();
		System.out.println("발매일: " + releasedate);
	}

	public String getDate() {
		return releasedate;
	}

	public void setDate(String date) {
		this.releasedate = date;
	}
	
}
