// 다음과 같은 달력 모양을 콘솔에 출력하는 프로그램
// 1.오늘의 날짜 정보확인
// 2. 해당 월의 첫번째 날의 요일 확인
// 3. 해당 월의 길이 확인
// 사용자 입력(년, 월)
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Calendar;

public class PrintCalendar {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat kr = new SimpleDateFormat("yyyy-MM-dd");
		
		int year = scan.nextInt();
		int month = scan.nextInt();
		int date = scan.nextInt();
		cal.set(year, month - 1, date);
		
//		now.getDayOfWeek().toString(); // 요일 문자열
//		now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd E"));
		LocalDate dayOfWeek = now.withDayOfMonth(1); // 당일 기준 해당 월 1일 요일
		
		LocalDate firstDay = LocalDate.of(year, month, 1);
		int dayOfWeek1 = firstDay.getDayOfWeek().getValue();
		
		
		System.out.println(kr.format(cal.getTime()));
		System.out.print("일   월   화   수   목   금   토");
		
		int a = 1;
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int length = firstDay.lengthOfMonth();
		
										for (int i = 1; i < dayOfWeek1; i++) {
											System.out.println("   ");
										}
										
										for (int i = 1; i <= length; i++) {
											System.out.printf("%02d ", i);
											dayOfWeek1++;
											if (dayOfWeek1 % 7 ==0) {
												System.out.println();
	}
}
	}
}
		


		
//		for (int i = 0; i < 6; i++) {
//			System.out.println();
//			for (int j = 0; j < 7; j++) {
//				if (i == 0 && j == 0) {
//					if (dayOfWeek1 == 1) {
//					} else if (dayOfWeek1 == 2) {
//						System.out.print("   ");
//						j = 1;
//					} else if (dayOfWeek1 == 3) {
//						System.out.print("   ");
//						j = 2;
//					} else if (dayOfWeek1 == 4) {
//						System.out.print(" ");
//						j = 3;
//					} else if (dayOfWeek1 == 5) {
//						System.out.print("         ");
//						j = 4;
//					} else if (dayOfWeek1 == 6) {
//						System.out.print("            ");
//						j = 5;
//					}
//				}
//				for (int k = 0; k < 1; k++) {
//					if (lastDay >= a) {
//						System.out.printf("%02d ", a);
//						a++;
//					}
//				}
//			}
//		}
//	}
//}
//	
