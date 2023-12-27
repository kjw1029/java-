package instance;

public class Drink {
	private int price;

	private Drink(int price) {
		this.price = price;
	}
	
	public static Drink createInstance() {
		return new Drink(1000);
	}
	
	public static Drink createInstance(int price) {
		return new Drink(price);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
