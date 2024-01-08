
public class TestPerson {
	public static void main(String[] args) {
		Person kil = new KoreanPerson("길동");
		Person tom = new EnglishPerson("Tom");
		
		System.out.println(kil.toString());
		System.out.println(tom.toString());
		
//		KoreanPerson kor = (KoreanPerson) kil;
//		kor.printHello();
		
//		EnglishPerson kor = (EnglishPerson) kil;
//		kor.printHello();

		Speakable s = (Speakable) kil;
		s.printHello();
		
		s = (Speakable) tom;
		s.printHello();
		
		
	}
}
