
public class TestClone2 {

	public static void main(String[] args) {
		int number = 22;
		int copynumber = number;
		
//		Toy toy = new Toy(22);
//		Toy sameRef = toy;
//		
//		toy.setPrice(20);
//		Toy copy = new Toy(toy.getPrice());
//		
//		System.out.println(sameRef.getPrice());
//		System.out.println(copy.getPrice());
		
		Box box = new Box(3, new Toy(32));
//		Box sameRef = box;
		Box shallowCopy = new Box(box.getSize(), box.getToy());
		System.out.println(shallowCopy.getToy().getPrice());
		Box deepCopy = new Box(box.getSize(), new Toy(33));
	}

}
