public abstract class Animal extends Object {
    private int weight;
    private int age;
    
    public Animal(int weight, int age) {
		super();
		this.weight = weight;
		this.age = age;
	}
    
    public abstract void printSound();
    
	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

 

}
