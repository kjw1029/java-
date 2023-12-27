
public class TestDate {

	public static void main(String[] args) {
		Date d = new Date(2023, 12 , 8);
		
		d.setYear(2024);
		boolean result = d.setYear(0);
		System.out.println(result);
		d.setMonth(13); 
		d.setDay(33);
		
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());

	}

}
