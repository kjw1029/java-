
public class Customer {
	// 고객이 지갑을 가지고 있다.
	private Wallet wallet;
	
	public Customer(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public Wallet getWallet() {
		return wallet;
	}
	
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public int getMoney() {
		return wallet.getMoney();
	}
	
	public void setMoney(int money) {
		wallet.setMoney(money);
	}
}
