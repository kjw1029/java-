public class eagle extends Bird implements Flyable {

	public eagle(int weight, int age) {
		super(weight, age);
	}

    public void Hunt(){
    	System.out.println("사냥");
    }

	@Override
	public void printSound() {
		System.out.println("빼에엑");
	}

}
