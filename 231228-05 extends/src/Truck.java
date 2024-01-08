
public class Truck extends Car{
	private int maxWeight;

	public Truck(int speed, String color, int maxWeight) {
		super(speed, color);
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
}
