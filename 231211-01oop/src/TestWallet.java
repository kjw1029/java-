
public class TestWallet {

	public static void main(String[] args) {
		Wallet w = new Wallet(5000);
		
		w.setMoney(15000);
		System.out.println(w.getMoney());
		
		
		Customer cus = new Customer(w);
		Wallet cusWallet = cus.getWallet();
		System.out.println(cusWallet.getMoney());
		
		
		cus.setMoney(-10000);
		System.out.println(cus.getMoney());
		System.out.println(w.getMoney());
		
		Customer cus2 = new Customer(w);
		Customer cus3 = new Customer(new Wallet(30000));
		
		System.out.println(cus.getMoney() == cus2.getMoney());
		System.out.println(cus.getMoney() == cus3.getMoney());
	}

}
