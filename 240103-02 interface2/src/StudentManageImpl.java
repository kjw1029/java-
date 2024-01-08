public class StudentManageImpl implements IStudentManage {
	protected Student[] students;
	private final int MAX_LENGTH = 10;

	public StudentManageImpl() {
		students = new Student[MAX_LENGTH];
	}

	protected int findEmpty() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public boolean register(Student s) {
		int currentPosition = findEmpty();
		if (currentPosition != -1) {
			students[currentPosition] = s;
			return true;
		}
		return false;
	}

	@Override
	public Student[] getStudent() {
		return students;
	}

	@Override
	public Student findOne(String name) {
		for (Student s : students) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public Student getOne(int index) {
		return students[index];
	}

	@Override
	public void delete(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].equals(student)) {
				students[i] = null;
			}
		}
	}
}
