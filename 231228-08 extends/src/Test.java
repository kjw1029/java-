// Book 클래스
// 1. 필드정보
//  제목, 페이지수, 저자명
// 2. 메소드
//  모든 필드를 출력할 수 있는 메소드

// Magazine 클래스
// 1. 필드정보
//  제목, 페이지수, 저자명, 발매일
//  모든 필드를 출력할 수 있는 메소드

// 각각의 클래스에
// 모든 필드를 초기화하는 생성자
// getter / setter
public class Test {
	private Book[] maga; 
	private Magazine magazine;

	public static void main(String[] args) {
		Book book = new Book ("큰동", 405, "김동수"); 
		Magazine magazine =	new Magazine("큰동동", 70, "저자명" ,"2023.12.12");
		book.allPrint();
		magazine.allPrint();

		
	}
}
