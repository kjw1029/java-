import java.util.HashSet;
import java.util.List;
import java.util.Set;

class EmployeeAttendance {
	private String name;
	private String attendance;
	private String time;

	public EmployeeAttendance(String name, String attendance, String time) {
		super();
		this.name = name;
		this.attendance = attendance;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public String getAttendance() {
		return attendance;
	}

	public String getTime() {
		return time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public void setTime(String time) {
		this.time = time;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EmployeeAttendance)) {
			return false;
		}
		EmployeeAttendance other = (EmployeeAttendance) obj;
		if (attendance == null) {
			if (other.attendance != null) {
				return false;
			}
		} else if (!attendance.equals(other.attendance)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeAttendance [name=" + name + ", attendance=" + attendance + ", time=" + time + "]";
	}

}

public class Main4 {
	public static void main(String[] args) {
		// 직원의 출퇴근을 기록하는 프로그램
		// 한 직원의 출근 기록이 중복 x
		EmployeeAttendance record1 = new EmployeeAttendance("길동", "출근", "09:00");
		EmployeeAttendance record2 = new EmployeeAttendance("길동", "퇴근", "18:00");
		
		EmployeeAttendance record3 = new EmployeeAttendance("길동", "출근", "10:00");
		
//		System.out.println(record1.equals(record2));
//		System.out.println(record1.equals(record3));
//		
//		System.out.println(record1.hashCode());
//		System.out.println(record2.hashCode());
//		System.out.println(record3.hashCode());
		Set<EmployeeAttendance> oneDay = new HashSet<>();
		oneDay.add(record1);
		oneDay.add(record1);
		oneDay.add(record1);
		
		oneDay.add(new EmployeeAttendance("도우너", "출근", "09:00"));
		oneDay.add(new EmployeeAttendance("도우너", "퇴근", "18:00"));
		
		System.out.println(oneDay);
		
		List<Set<EmployeeAttendance>> oneMonth;
	}

}
