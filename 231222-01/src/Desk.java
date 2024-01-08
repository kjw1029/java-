public class Desk {
	private ReservationStatus reservaion;
	private RoomInfo roomInfo;
	public Desk(ReservationStatus reservaion, RoomInfo roomInfo) {
		super();
		this.reservaion = reservaion;
		this.roomInfo = roomInfo;
	}
	public ReservationStatus getReservaion() {
		return reservaion;
	}
	public RoomInfo getRoomInfo() {
		return roomInfo;
	}
	public void setReservaion(ReservationStatus reservaion) {
		this.reservaion = reservaion;
	}
	public void setRoomInfo(RoomInfo roomInfo) {
		this.roomInfo = roomInfo;
	}

}
