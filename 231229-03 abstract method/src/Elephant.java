public class Elephant extends Animal {

    public Elephant(int weight, int age){
    	super(weight, age);
    }

    public void eatHay(){
    	System.out.println("건초를 먹습니다.");
    }

	@Override
	public void printSound() {
		System.out.println("뿌우우");
		
	}
    
}
