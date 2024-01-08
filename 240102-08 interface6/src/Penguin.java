
public class Penguin extends Bird {

	public Penguin(int weight, int age) {
		super(weight, age);
	}

	@Override
	public void printSound() {
		System.out.println("펭귄!");
	}
	
}
