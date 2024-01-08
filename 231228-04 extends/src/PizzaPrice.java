
public class PizzaPrice {

	public static void main(String[] args) {
		Pizza[] pepper = new Pizza[] {
				new PepperoniPizza(10000, 20)
				, new PepperoniPizza(15000, 25)
				, new PepperoniPizza(20000, 30)
				, new BulgogiPizza(10000, 200)
				, new BulgogiPizza(15000, 250)
				, new BulgogiPizza(20000, 300)
		};
		
		int sum = 0;
		for (int i = 0; i < pepper.length; i++) {
			sum += pepper[i].getPrice();
		}
		
		int count = 0;
		for (int i = 0; i < pepper.length; i++) {
			if (pepper[i] instanceof PepperoniPizza) {
			PepperoniPizza down = (PepperoniPizza) pepper[i];
			count += down.getCountPepperoni();
			}
		}
		System.out.println(sum);
		System.out.println(count);
		
		// 불고기 그램 수 총합
		 
		int g = 0;
		for (int i = 0; i < pepper.length; i++) {
			if (pepper[i] instanceof BulgogiPizza) {
				BulgogiPizza down = (BulgogiPizza) pepper[i];
				g += down.getMeatWeight();
			}
		}
		System.out.println(g);
	}

}
