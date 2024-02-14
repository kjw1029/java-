
public class TestDoll {

	public static void main(String[] args) {
		Doll d1 = new Doll("처키", 15000);

		Doll d2 = new Doll("허기워기", 20000);

		DollFactory fac = new DollFactory();
		Doll h = fac.createDoll(1);
		Doll c = fac.createDoll(3);
		Doll a = fac.createDoll(4);
		if (a != null ) {
			System.out.println(a.getModel());
		}
		
		System.out.println(h.getModel());
		System.out.println(c.getModel());
		
//		Doll goods1 = fac.createDoll();

//		System.out.println(goods1.getModel());
//		System.out.println(goods1.getPrice());
	}
}