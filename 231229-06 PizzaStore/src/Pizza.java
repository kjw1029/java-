
public class Pizza {
	private String type;
	private int price;
	private String option;

	public Pizza(String type, int price, String option) {
		super();
		this.type = type;
		this.price = price;
		this.option = option;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public String getOption() {
		return option;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
