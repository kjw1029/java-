import java.util.Calendar;

public class TestMutable {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar bookDay = today;
		
		bookDay.set(2023, 12, 30);
		
		System.out.println(today.get(Calendar.DAY_OF_MONTH));

	}

}
