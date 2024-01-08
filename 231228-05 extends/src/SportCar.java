
public class SportCar extends Car{
	private boolean turbo;

	public SportCar(int speed,String color, boolean turbo) {
		super(speed, color);
		this.turbo = turbo;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	

}
