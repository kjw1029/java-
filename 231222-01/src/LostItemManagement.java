
public class LostItemManagement {
	private RoomInfo roomInfo;
	private ReservationPerson reservationPeron;
	private boolean haslostItem;

	public LostItemManagement(RoomInfo roomInfo, ReservationPerson reservationPeron, boolean haslostItem) {
		super();
		this.roomInfo = roomInfo;
		this.reservationPeron = reservationPeron;
		this.haslostItem = haslostItem;
	}

	public boolean isHaslostItem() {
		return haslostItem;
	}

	public void setHaslostItem(boolean haslostItem) {
		this.haslostItem = haslostItem;
	}

	public int getRoomInfo() {
		return roomInfo.getUnit();
	}

	public String getReservationPeronName() {
		return reservationPeron.getName();
	}

	public String getReservationPeronPhoneNumber() {
		return reservationPeron.getPhoneNumber();
	}

	public void setRoomInfo(RoomInfo roomInfo) {
		this.roomInfo = roomInfo;
	}

	public void setReservationPeron(ReservationPerson reservationPeron) {
		this.reservationPeron = reservationPeron;
	}

}
