
public class peeStore {
	private int meat;
	private int hay;
	
	public peeStore(int meat, int hay) {
		this.meat = meat;
		this.hay = hay;
	}
	
	public int getMeat() {
		return meat;
	}
	
	public int getHay() {
		return hay;
	}
	
	public void decreaseMeat(int amount) {
		meat -= amount;
	}
	
	public void decreatHay(int amount) {
		hay -= amount;
	}
}
