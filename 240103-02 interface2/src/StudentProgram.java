import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class StudentProgram {
	private Scanner scanner;
	private StudentManageImpl manager;

	public StudentProgram() {
		scanner = new Scanner(System.in);
		manager = new StudentManageImpl();
	}

	public void start() {
		while (true) {
			int input = menu();
			switch (input) {
			case 1:
				Student s = inputStudent();
				if (!manager.register(s)) {
					System.out.println("등록 가능한 최대 학생 수는 10명입니다.");
				}
				break;
			case 2:
				presentInfo();
				break;
			case 3:
				String name = inputName();
				presentOne(name);
				break;
			case 4:
				int index = inputIndex();
				presentOne(index);
			case 5:
				int deleteInput = deletSubmenu();
				deleteProcess(deleteInput);
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}

	private void deleteProcess(int deleteInput) {
		if (deleteInput == 1) {
			String name = inputName();
			Student find = manager.findOne(name);
			manager.delete(find);
		} else if (deleteInput == 2) {
			int index = inputIndex();
			Student find = manager.getOne(index);
			manager.delete(find);
		} else if (deleteInput == 3) {
			Student student = inputStudent();
			manager.delete(student);
		}
	}

	private int deletSubmenu() {
		System.out.println("1. 이름으로 삭제/ 2. 번호로 삭제/ 3. 학생정보로 삭제");
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}

	private void presentOne(int index) {
		System.out.println("검색 결과입니다.");
		Student s = manager.getOne(index);
		if (s != null) {
			System.out.println(s);
		} else {

			System.out.println("해당 학생 정보가 없습니다.");
		}
	}

	private void presentOne(String name) {
		System.out.println("검색 결과입니다.");
		Student s = manager.findOne(name);
		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("해당 학생 정보가 없습니다.");
		}
	}

	private int inputIndex() {
		System.out.println("검색할 학생 번호를 입력하세요.");
		int index = scanner.nextInt();
		scanner.nextLine();
		return index;
	}

	private String inputName() {
		System.out.println("검색할 학생 이름을 입력하세요.");
		return scanner.nextLine();
	}

	private void presentInfo() {
		System.out.println("등록된 학생 목록입니다.");
		Student[] arr = manager.getStudent();
		System.out.println(Arrays.toString(arr));

	}

	private Student inputStudent() {
		System.out.println("학생 정보를 입력하세요. (이름, 국, 영, 수)");
		String name = scanner.nextLine();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		scanner.nextInt();
		return new Student(name, kor, eng, math);
	}

	private int menu() {
		System.out.println("1. 학생등록/ 2. 학생목록보기/ 3. 이름검색/ 4. 번호검색");
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}
}
