package plane;

public class Plane {
	private String comname;
	private String model;
	private int passenger;
	private static int planeCount;
	public static final int SPEED_OF_SOUND = 340;
	
	
	public Plane(String comname, String model, int passenger) {
		this.comname =comname;
		this.model = model;
		this.passenger = passenger;
		planeCount++;
	}
	public Plane(String comname, String model) {
		this.comname =comname;
		this.model = model;
		this.passenger = 250;
		planeCount++;
	}
	
	public void setComname(String comname) {
		this.comname = comname;
		planeCount++;
	}
	public void setModel(String model) {
		this.model = model;
		planeCount++;
	}
	public void setPassenger(int passenger) {
		this.passenger =passenger;
		planeCount++;
	}
	
	public String getComname() {
		planeCount++;
		return comname;
	}
	public String getModel() {
		planeCount++;
		return model;
	}
	public int getPassenger() {
		planeCount++;
		return passenger;		
	}
	public static int getPlaneCount() {
		return planeCount;
	}


}
