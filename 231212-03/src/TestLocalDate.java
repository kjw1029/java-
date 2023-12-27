import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		// 오늘 날짜 LocalDate 인스턴스 생성
		LocalDate now = LocalDate.now();
		
		System.out.println(now.toString());
		
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		// 기존 날짜를 기준으로 생성
		LocalDate thisMinthFirstDay = now.withDayOfMonth(1);
		// 기존 날짜를 기준으로 생성 
		LocalDate twoDayAfter = now.plusDays(2);
		// 특정 날짜 인스턴스 생성 (int 년, int 월, int 일)
		LocalDate nextDay = LocalDate.of(2023, 12, 13);
		// (String "날짜문자열표현")
		LocalDate christMas = LocalDate.parse("2023-12-25");
		
		// 요일 (월 1 ~ 일요일 7)
		int dayofWeek = now.getDayOfWeek().getValue();
		System.out.println(dayofWeek);
		// 한 달의 끝 날짜
		int length = now.lengthOfMonth();
		System.out.println(length);
		
	}

}
