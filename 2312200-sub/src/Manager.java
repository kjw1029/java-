
public class Manager {
	private EmployeeInfo employeeInfo;
	private ReservationStatus reservaion;
	private RoomInfo roomInfo;
	public Manager(EmployeeInfo employeeInfo, ReservationStatus reservaion, RoomInfo roomInfo) {
		super();
		this.employeeInfo = employeeInfo;
		this.reservaion = reservaion;
		this.roomInfo = roomInfo;
	}
	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}
	public ReservationStatus getReservaion() {
		return reservaion;
	}
	public RoomInfo getRoomInfo() {
		return roomInfo;
	}
	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
	public void setReservaion(ReservationStatus reservaion) {
		this.reservaion = reservaion;
	}
	public void setRoomInfo(RoomInfo roomInfo) {
		this.roomInfo = roomInfo;
	}
	
}
