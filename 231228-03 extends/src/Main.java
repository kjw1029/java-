// 학생
// 이름
// 점수

// 작가
// 이름
// 대표작품명

// 명절
// 이름
// 날짜

public class Main {

	public static void main(String[] args) {
		Student s = new Student("길동", 90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		
		Author a = new Author("둘리", "둘리의 대모험");
		
		System.out.println(a.getName());
		System.out.println(a.getBookTitle());

	}

}
