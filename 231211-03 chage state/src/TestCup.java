
public class TestCup {

	public static void main(String[] args) {
		Cup cup = new Cup(100);
		Cup cup2 = new Cup(100);
		
		Guest guest1 = new Guest(cup);
		Guest guest2 = new Guest(cup2);
		
		guest1.drinkWater();
		
		guest2.drinkWater();
		guest2.drinkWater();
		
		System.out.println(cup2.getWater());
		
//		Guest guest = new Guest();
//		
//		guest.drinkWater(cup);
//		guest.drinkWater(cup);
//		
//		System.out.println(cup.getWater());
//		
//		Guest guest2 = new Guest();
//		guest2.drinkWater(cup);
//		guest2.drinkWater(cup);
//		
//		System.out.println(cup.getWater());

	}

}
