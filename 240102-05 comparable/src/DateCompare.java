import java.time.LocalDate;
class MyDate implements Comparable<MyDate> {
	// 기준일 204-01-01
	public int day;

	public MyDate(int day) {
		this.day = day;
	}

	@Override
	public int compareTo(MyDate o) {
		return this.day - o.day;
	}
}
public class DateCompare {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 12, 31);
		
		LocalDate today =  LocalDate.now();
		
		System.out.println(date.compareTo(today));
	}

}
