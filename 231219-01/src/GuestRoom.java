// 객실

public class GuestRoom {

		private String room;
		private GuestInfo GuestInfo;
		private GuestRoom roomState;
		// 방 정보
		public GuestRoom(String room) {
			this.room = room;
		}
		
		// 방 정보, 고객정보
		public GuestRoom(String room, GuestInfo GuestInfo) {
			this.room = room;
			this.GuestInfo = GuestInfo;
		}

		public String getRoom() {
			return room;
		}

		public void setRoom(String room) {
			this.room = room;
		}

		public GuestInfo getReservation() {
			return GuestInfo;
		}

		public void setReservation(GuestInfo GuestInfo) {
			this.GuestInfo = GuestInfo;
		}

		// 고객명단 일치 여부
		public boolean matches(String name, int number) {
			if (GuestInfo.getName().equals(name) && GuestInfo.getNumber() == (number)) {
				return true;
			}
			return false;
		}

		
//		private boolean bool;
//		// boolean값으로 예약 가능여부
//		public RoomState(Room roomState, boolean bool) {
//			this.bool = bool;
//			this.roomState = roomState;
//		}
//
//		public Room getRoomState() {
//			return roomState;
//		}
//
//		public void setRoomState(Room roomState) {
//			this.roomState = roomState;
//		}
//
//		public boolean isBool() {
//			return bool;
//		}
//
//		public void setBool(boolean bool) {
//			this.bool = bool;
//		}
//		// 고객 이름, 번호 출력
//		public void searchGuest() {
//			System.out.println(roomState.getReservation().getName());
//			System.out.println(roomState.getReservation().getNumber());
//		}
//		


}
