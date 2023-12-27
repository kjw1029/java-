package instance;

import java.time.LocalDate;
import java.util.Locale;

public class Testinstance {
	public static void main(String[] args) {
		//Drink d = new Drink(1000)
		
		Drink way = Drink.createInstance();
		System.out.println(way.getPrice());
		
		Drink d2000 = Drink.createInstance(2000);
		System.out.println(d2000.getPrice());

	}

}
