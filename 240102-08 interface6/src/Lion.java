public class Lion extends Animal {

    public Lion(int weight, int age){
    	super(weight, age);
    }

    public void eatMeat(){
    	System.out.println("고기를 먹습니다.");
    }

	@Override
	public void printSound() {
		System.out.println("어흥");
		
	}

}
