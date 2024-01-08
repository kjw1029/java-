import java.util.Scanner;

public class TestRoom {
	public static void main(String[] args) {
		Speakable[] members = new Speakable[] {
				new KoreanPerson("호동")
				, new KoreanPerson("수근")
				, new KoreanPerson("종민")
				, new EnglishPerson("Eun")
		};
		
		MeetingRoom room = new MeetingRoom(members);
//		room.printIntroduceAll();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회의에 참석 여부를 확인하고자 하는 이름");
		String name = scan.nextLine();
		
		boolean result = room.isInclude(new KoreanPerson(name));
		
		if(result) {
			System.out.println("회의에 참석중입니다.");
		} else {
			System.out.println("해당 인원은 없습니다.");
		}
	}
}
