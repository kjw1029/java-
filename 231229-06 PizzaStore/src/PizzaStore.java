public class PizzaStore {
	private Person person;
	private Pizza pizza;
	private int amount;

	public PizzaStore(Person person, Pizza pizza, int amount) {
		super();
		this.person = person;
		this.pizza = pizza;
		this.amount = amount;
	}

	public void totalMoney(Pizza pizza) {
		amount += pizza.getPrice();
	}

	public Person getPerson() {
		return person;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public int getAmount() {
		return amount;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
