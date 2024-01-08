
public interface IPizza {
	public static final int PEPPERRONI_PIZZA_PRICE = 12000;
	public static final int BACON_PIZZA_PRICE = 10000;
	public static final int PEPPERONI_ONE_PRICE = 500;
	public static final int BACON_GRAM_PRICE = 100;

	public int getPrice();

}
abstract class Pizza implements IPizza, Comparable<Pizza>{
	public final int defaultPrice;

	public Pizza(int defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public int getDefaultPrice() {
		return defaultPrice;
	}

	@Override
	public int compareTo(Pizza o) {
		return this.getPrice() - o.getPrice();
	}
}

class PepperoniPizza extends Pizza {
	private int pepperoniCount;

	public PepperoniPizza(int pepperoniCount) {
		super(PEPPERRONI_PIZZA_PRICE);
		this.pepperoniCount = pepperoniCount;
	}

	@Override
	public int getPrice() {
		return defaultPrice + pepperoniCount * PEPPERONI_ONE_PRICE;
	}

}

class BaconPizza extends Pizza {
	private int baconGram;

	public BaconPizza(int baconGram) {
		super(BACON_PIZZA_PRICE);
		this.baconGram = baconGram;
	}

	@Override
	public int getPrice() {
		return defaultPrice + baconGram * BACON_GRAM_PRICE;
	}

}
