// 스마트 기기
// 제조사
// 가격
class SmartDevice {
	private String production;
	private int price;

	public SmartDevice(String production, int price) {
		super();
		this.production = production;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SmartDevice)) {
			return false;
		}
		SmartDevice other = (SmartDevice) obj;
		if (price != other.price) {
			return false;
		}
		if (production == null) {
			if (other.production != null) {
				return false;
			}
		} else if (!production.equals(other.production)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SmartDevice [production=" + production + ", price=" + price + "]";
	}

	public String getProduction() {
		return production;
	}

	public int getPrice() {
		return price;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// 인터페이스 - 통화가능
interface PhoneCallable {
	public abstract void call();
}

// 아이폰 - 통화가능
class IPhone extends SmartDevice implements PhoneCallable {
	public IPhone(String production, int price) {
		super(production, price);
	}

	@Override
	public void call() {
		System.out.println("아이폰은 통화 기능이 있습니다.");

	}
}

// 아이패드
class IPad extends SmartDevice {
	public IPad(String production, int price) {
		super(production, price);
	}
}
// 유심이 있는 아이패드 - 통화 가능
class IPadWithUsim extends IPad implements PhoneCallable {

	public IPadWithUsim(String production, int price) {
		super(production, price);
		}

	@Override
	public void call() {
		System.out.println("유심이 있는 아이패드는 통화 기능이 있습니다.");
	}
}

class DialPhone implements PhoneCallable {

	@Override
	public void call() {
		System.out.println("다이얼 전화기는 통화 기능이 있습니다.");
		
	}
}

public class Main {
	public static void main(String[] args) {
		IPhone iphone = new IPhone("애플", 100);
		IPad ipad = new IPad("애플", 150);
		IPadWithUsim iPadWithUsim = new IPadWithUsim("애플", 170);
		
		iphone.call();
//		ipad.call();
		iPadWithUsim.call();
		
//		SmartDevice device = iphone;
//		device.call();
		
		PhoneCallable call = iphone;
		call.call();
		
		System.out.println("--------------");
		
		PhoneCallable[] arr = { iphone, iPadWithUsim, new DialPhone() };
		for (PhoneCallable elem : arr) {
			elem.call();
		}
	}
}
