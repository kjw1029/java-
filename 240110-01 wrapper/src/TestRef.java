public class TestRef {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(10); 
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2)); // 같은 참조 사용 
		
		Integer i3 = new Integer(10); 
		
		System.out.println(i1 == i3);
		System.out.println(i1.equals(i3));
		
		i1 = i1 + 50; // 참조 변경이 일어남, 값 변경 불가능
	}

}
