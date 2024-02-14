package book;
// 3권의 책 생성
// 파워자바, 25000, 천인국, chun@naver.com
// 파워파이썬, 22000, 천인국, chun@naver.com
// 스프링웹프로젝트, 30000, 구멍가게코딩단, goo@gmail.com

public class TestBook {

	public static void main(String[] args) {
		author w1 = new author("천인국", "chun@naver.com");
		author w2 = new author("구멍가게코딩단", "goo@gmail.com");
		Book b1 = new Book("파워자바", 25000, w1);
		Book b2 = new Book("파워파이썬", 22000, w1);
		Book b3 = new Book("스프링웹프로젝트", 30000, w2);
		
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		System.out.println(b1.getWrit().getName());
		System.out.println(b1.getWrit().getE_mail());
		
		
	}

}
