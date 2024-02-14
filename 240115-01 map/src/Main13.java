import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main13 {
	public static void main(String[] args) {
		// 빼빼로데이, 11월 11일
		// 농업인의날, 11월 11일
		// 어린이날, 5월 5일
		
		Map<String, LocalDate> map;
		Map<LocalDate, List<String>> map2;
		
		// 어린이날, 5월 5일에 길동이랑 약속
		Map<LocalDate, List<String>> mapHoliday = new HashMap<>();
		mapHoliday.put(LocalDate.of(2024, 5, 5), Arrays.asList("어린이날"));
		Map<LocalDate, String> mapPromiss = new HashMap<>();
		mapPromiss.put(LocalDate.of(2024, 5, 5), "길동이랑 약속");
		
		LocalDate aDay = LocalDate.of(2024, 5, 5);
		System.out.println(mapHoliday.get(aDay));
		System.out.println(mapPromiss.get(aDay));
	}

}
