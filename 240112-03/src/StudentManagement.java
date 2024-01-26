import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {
	List<Set<Student>> allEnglish;
	List<Set<Student>> allMath;
	
	Set<Student> currentEnglish;
	Set<Student> currentMath;
	
	public StudentManagement() {
		currentEnglish = new HashSet<>();
		currentMath = new HashSet<>();
		
		allEnglish = new ArrayList<>();
		allEnglish.add(currentEnglish);
		allMath = new ArrayList<>();
		allMath.add(currentMath);
	}
	
	public void addEnglish(Student s) {
		// 기존 영어반에 등록되어 있으면 중복
		if (examDuplicateAllEnglish(s)) {
			return;
		}
		// 3명이 총원
		createEnglishIfFull();
		currentEnglish.add(s);
	}
	
	public void printEnglish() {
		for(int i = 0; i < allEnglish.size(); i++) {
			System.out.println("영어"+(i+1)+ "반 학생: " + allEnglish.get(i));
		}
	}
	
	private boolean examDuplicateAllEnglish(Student s) {
		for (Set<Student> set : allEnglish) {
			if (set.contains(s)) {
				return true;
			}
		}
		return false;
	}
	private void createEnglishIfFull() {
		if (currentEnglish.size() ==3) {
			Set<Student> created = new HashSet<>();
			allEnglish.add(created);
			currentEnglish = created;
		}
	}
}
