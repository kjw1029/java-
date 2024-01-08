public class Test {
	public static void main(String[] args) {
//		MyInterface my = new MyInterface();
		MyKoreanPrinter kor = new MyKoreanPrinter();
		MyEnglishPrinter eng = new MyEnglishPrinter();
		
		kor.printHello();
		eng.printHello();
		
		Speakable i = kor;
		i.printHello();
		
		i = eng;
		i.printHello();
	}

}
