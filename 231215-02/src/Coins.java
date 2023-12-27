

public class Coins {
	private int userType;
	private int transType;
	private Money[] money;
	
	public Coins(int userType, int transType) {
		super();
		this.userType = userType;
		this.transType = transType;
	}
	
	public boolean matches(int userType, int transType) {
		return this.userType==(userType) && this.transType==(transType);
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getTransType() {
		return transType;
	}

	public void setTransType(int transType) {
		this.transType = transType;
	}

	public Money[] getMoney() {
		return money;
	}

	public void setMoney(Money[] money) {
		this.money = money;
	}
	
	
	
	
}
