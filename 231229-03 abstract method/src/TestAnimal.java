public class TestAnimal {
	public static void main(String[] args) {
//		Animal a = new Animal(100,7); 
//		Bird b = new Bird(100,6);
		Lion l = new Lion(1000, 11);
		l.eatMeat();
		l.printSound();
		
		Animal a = l;
// 		a.eatMeat();
		a.printSound();
		
		Duck d = new Duck(30, 2);
		d.printSound();
		d.fly();
		
		Animal sup = d;
		sup.printSound();
//		sup.fly();
		
	}

}
