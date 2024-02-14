// 컵
// 현재 물의양
public class Cup {
	private int water;
	
	public Cup(int water) {
		this.water = water;
	}
	
	public int getWater() {
		return water;
	}
	
	public void setWater(int water) {
		this.water = water;
	}
	public void increase() {
		this.water++;
	}
	public void decrease() {
		this.water--;
	}
}
