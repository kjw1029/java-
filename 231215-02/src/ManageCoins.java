
// 코인관리

public class ManageCoins {
	private Coins[] coin;

	public ManageCoins(Coins[] coin) {
		super();
		this.coin = coin;
	}

	public boolean contain(int userType, int transType) {
		for (int i = 0; i < coin.length; i++) {
			if (coin[i].matches(userType, transType)) {
				return true;
			}
		}
		return false;
	}
	
	
}
