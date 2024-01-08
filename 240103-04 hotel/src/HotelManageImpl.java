
public class HotelManageImpl implements HotelManage {
	protected Customer[] customers;
	protected Room[] rooms;
	private final int MAX_LENGTH = 10;
	
	@Override
	public void register(Customer c) {
		int currentPosition = 0;
		customers[currentPosition] = c;
		currentPosition++;
	}
	@Override
	public Customer[] getCustomer() {
		return customers;
	}
	@Override
	public Customer findOne(String name) {
		for(Customer c : customers)
			if (c.getName().equals(name)) {
				return c;
			}
		return null;
	}
	@Override
	public Customer getOne(int index) {
		if (index < 0 || index > customers.length) {
			return null;
		}
		return customers[index];
	}
	@Override
	public void Room(Room r) {
		
	}

}
