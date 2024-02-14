
public class Guest {
//	public void drinkWater(Cup cup) {
//		cup.decrease();
//	}
	private Cup cup;
	
	public Guest(Cup cup) {
		this.cup = cup;
	}
	
	public void drinkWater() {
		cup.decrease();
	}
}
