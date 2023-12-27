// 인형
// 상품명
// 가격

public class Doll {
	private String model;
	private int price;
	
	public Doll(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
