package VendingMachine;

public class Money {
	private String won;
	private String dollar;
	private String yen;
	private String yuan;
	private final int wo = 1000; 
	private final int dol = 1; 
	private final int ye = 100;
	private final int yu = 5; 
	
	public Money(int won, int dollar, int yen, int yuan) {
		super();
		this.won = won;
		this.dollar = dollar;
		this.yen = yen;
		this.yuan = yuan;
	}
	public Money() {
		// TODO Auto-generated constructor stub
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getDollar() {
		return dollar;
	}
	public void setDollar(int dollar) {
		this.dollar = dollar;
	}
	public int getYen() {
		return yen;
	}
	public void setYen(int yen) {
		this.yen = yen;
	}
	public int getYuan() {
		return yuan;
	}
	public void setYuan(int yuan) {
		this.yuan = yuan;
	}
	
	
}
