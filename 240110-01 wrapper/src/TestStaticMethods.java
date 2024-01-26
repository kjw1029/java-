public class TestStaticMethods {
	public static void main(String[] args) {
		int parse = Integer.parseInt("456");
		System.out.println(parse + 100);
		
		Integer value = Integer.valueOf("987");
		System.out.println(value);
		
		int result = value.compareTo(Integer.valueOf(100));
		System.out.println(result);
		
		boolean same = value.equals(Integer.valueOf(987));
		System.out.println(same);
//		int ext = Integer.parseInt("zz");
		
		System.out.println("프로그램 정상 종료");
	}

}
