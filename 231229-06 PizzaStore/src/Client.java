
public class Client extends Person{
	private int money;

	public Client(String name, String phoneNumber, String nationality, int money) {
		super(name, phoneNumber, nationality);
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
		
}
