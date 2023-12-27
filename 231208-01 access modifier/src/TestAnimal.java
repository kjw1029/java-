
public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal("고양이", "고양이과", 10, 8);
		
		a.allPrint();
		
		a.setName("사자");
		System.out.println(a.getName());
		
		a.allPrint();
	}

}
