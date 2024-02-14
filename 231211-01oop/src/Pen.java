
public class Pen {
	public void writeConsole() {
		System.out.println("펜은 콘솔에 글자를 적을 수 있음");
	}
	
	//method overloading
	public void writeConsole(String text) {
		System.out.println(text + "를 적음");
		System.out.println(text.length()+ "자를 적음");
	}
	
	public void writeConsole(int number) {
		System.out.println(number + "를 적음");
	}
}