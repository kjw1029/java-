// 문서서랍장
// 3개의 문서 보관

// 문서
// 작성자
// 작성일
// 내용요약
// 중요도( 중요도 높은게 앞쪽 ) 중요도 값이 기준보다 낮으면 무시, 높으면 새로 들어가게
// ,중복은 개인판단

public class TestDocuments {

	public static void main(String[] args) {
		DocumentsShelf documentsshelf = new DocumentsShelf();
		
		Documents documents1 = new Documents("하", 20231213, "??", 2);
		Documents documents2 = new Documents("중", 20221213, "??", 3);
		Documents documents3 = new Documents("상", 20221213, "??", 4);
		Documents documents4 = new Documents("최상", 20211213, "??", 5);
		
//		documentsshelf.setDocuments7(documents1);
//		System.out.println(documentsshelf.getDocuments7().getWrite());
		
//		documentsshelf.setDocuments8(documents1);
//		System.out.println(documentsshelf.getDocuments8().getWrite());
		
		documentsshelf.setDocuments9(documents4);
		System.out.println(documentsshelf.getDocuments9().getWrite());
		
		documentsshelf.setDocuments9(documents3);
		System.out.println(documentsshelf.getDocuments9().getWrite());
		
		System.out.println(documentsshelf.getDocuments10().getWrite());

		
		
	}

}
