
public class Money {
	private String currency;
	private int exchange;
	
	
	public void setExchange(int exchange) {
		this.exchange = exchange;
	}


	public Money(String currency, int exchange) {
		this.currency = currency;
		this.exchange = exchange;
	}


	public String getCurrency() {
		return currency;
	}


	public int getExchange() {
		return exchange;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setExchang2(int result) {
		this.exchange -= result;
	}
	public void setExchang3(int result) {
		this.exchange += result;
	}
}