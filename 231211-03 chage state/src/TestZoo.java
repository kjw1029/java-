
public class TestZoo {

	public static void main(String[] args) {
		peeStore p1 = new peeStore(100, 200);
		
		Hip p = new Hip();
		
		Lion z = new Lion();
		
		p.eatFeed(p1);
		z.eatFeed(p1);
		
		System.out.println(p1.getMeat());
		System.out.println(p1.getHay());
	}

}
