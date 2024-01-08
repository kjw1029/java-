
public class Customer {
	private String name;
	private String phoneNumber;
	private int roomNumver;

	public Customer(String name, String phoneNumber, int roomNumver) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.roomNumver = roomNumver;
	}

	public boolean equalsStrict(Customer target) {
		if (this.equals(target) && this.roomNumver == target.roomNumver) {
			return true;
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getRoomNumver() {
		return roomNumver;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setRoomNumver(int roomNumver) {
		this.roomNumver = roomNumver;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", roomNumver=" + roomNumver + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + roomNumver;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phoneNumber == null) {
			if (other.phoneNumber != null) {
				return false;
			}
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		if (roomNumver != other.roomNumver) {
			return false;
		}
		return true;
	}
	
	
}
