import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); // 정적 메소드 호출
		System.out.println(calendar.getTime());
		
		SimpleDateFormat kr = new SimpleDateFormat("yyyy-MM-dd");
		String result = kr.format(calendar.getTime());
		System.out.println(result);
	}

}
