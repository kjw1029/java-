interface MyInterface {
	public default void someMethod() {
		System.out.println("완선된 메소드");
	}
}

class MyImpl implements MyInterface {
}

class YourImpl implements MyInterface {
}

class TheirImpl implements MyInterface {
}

public class Test {
	public static void main(String[] args) {
		MyImpl a = new MyImpl();
		a.someMethod();
	}
}
