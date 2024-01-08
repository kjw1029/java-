// 피자
// 가격

// 페퍼로니피자
// 가격
// 페퍼로니개수

// 불고기피자
// 가격
// 고기중량(그램)
class BulgogiPizza extends Pizza {
	private int meatWeight;
	
	public BulgogiPizza(int price, int meatWeight) {
		super(price);
		this.meatWeight = meatWeight;
		
	}

	public int getMeatWeight() {
		return meatWeight;
	}

	public void setMeatWeight(int meatWeight) {
		this.meatWeight = meatWeight;
	}
	
}
class PepperoniPizza extends Pizza {
	private int countPepperoni;

	public PepperoniPizza(int price, int countPepperoni) {
		super(price);
		this.countPepperoni = countPepperoni;
	}

	public int getCountPepperoni() {
		return countPepperoni;
	}

	public void setCountPepperoni(int countPepperoni) {
		this.countPepperoni = countPepperoni;
	}
	
}
public class Pizza {
	private int price;
	
	public Pizza(int price) {
		super();
		this.price = price;
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
