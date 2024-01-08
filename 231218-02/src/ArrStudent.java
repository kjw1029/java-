import java.util.Arrays;

public class ArrStudent {

	public static void main(String[] args) {
		Student[] arr = new Student[] {
				new Student ("홍길동", 50)
				,new Student ("둘리", 100)
				,new Student ("고길동", 70)
			};
		
		//int result = "문자열".compareTo("abc");
		//System.out.println(result);

	
	// 학생의 이름으로 오름차순 정력 완성해보기
	Arrays.sort(arr, new StudentNameComparator());
	
	for(Student s : arr) {
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println("---");
	}
	
	Arrays.sort(arr, new StudentScoreComparator());
	for(Student s : arr) {
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println("---");
	}
	}
}
