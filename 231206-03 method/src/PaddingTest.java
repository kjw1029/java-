
public class PaddingTest {

	public static void main(String[] args) {
		Padding p = new Padding();
		p.Model01 = "나이키";
		p.Model02 = "아이다스";

		p.mo1 = 10000;
		p.mo2 = 100000;
		
		p.goo2();

		System.out.println(p.Model01);
		System.out.println(p.mo1+"원");
		System.out.println(p.go);
		System.out.println(p.dis(10)+"원"+"\n");

		System.out.println(p.Model02);
		System.out.println(p.mo2+"원");
		System.out.println(p.go2);
		System.out.println(p.dis2(50)+"원");
	}

}
