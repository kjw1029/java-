public class Grasshopper extends Animal implements Flyable{

	public Grasshopper(int weight, int age) {
		super(weight, age);
	}
	@Override
	public void printSound() {
	System.out.println("메뚜");
	}
	
}
