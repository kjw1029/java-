import java.util.List;
import java.util.Scanner;

/*
 * 이름  국어  영어  수학
 * 길동,100,90,80
 * 둘리,80,70,60
 * 도우너,9070,50
 */

public class Main5 {
	private static Scanner scan = new Scanner(System.in);
	
	private static Student inputStudent() {
		System.out.println("학생이름?");
		String name = scan.nextLine();
		System.out.println("국어점수?");
		int kor = scan.nextInt();
		System.out.println("영어점수?");
		int eng = scan.nextInt();
		System.out.println("수학점수?");
		int math = scan.nextInt();
		scan.nextLine();
		
		return new Student(name, kor, eng, math);
	}
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
//		for (int i = 0; i < 3; i++) {
//			Student s = inputStudent();
//			dao.appendRow(s);
//		}
		List<Student>list = dao.getAll();
		for (Student s : list) {
			System.out.println(s.getName());
			System.out.println(s.getKor());
			System.out.println(s.getEng());
			System.out.println(s.getMath());
		}
	}
}
