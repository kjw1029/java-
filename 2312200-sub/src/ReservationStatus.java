import java.util.Scanner;

public class ReservationStatus {
	private int reservatedRoom;
	private int stayingRoom;
	private int emptyRoom;
	private boolean bool;// 청소완료
	
	public static void printReservationStatus() {
//		int reservatedRoom =1;
//		int stayingRoom = 2;
//		int emptyRoom = 3;
//		System.out.println("예약현황");
//		int[][] RF = new int[20][4];
//		for (int i = 0; i < RF.length; i++) {
//			for (int j = 0; j < RF[i].length; j++) {
//					System.out.printf("%d%02d  ", j + 2, i +1);
//					
//			}
//			System.out.println();
//		}
	}
	
	public ReservationStatus(int reservatedRoom, int stayingRoom, int emptyRoom) {
		super();
		this.reservatedRoom = reservatedRoom;
		this.stayingRoom = stayingRoom;
		this.emptyRoom = emptyRoom;
	}
	public int getReservatedRoom() {
		return reservatedRoom;
	}
	public int getStayingRoom() {
		return stayingRoom;
	}
	public int getEmptyRoom() {
		return emptyRoom;
	}
	public void setReservatedRoom(int reservatedRoom) {
		this.reservatedRoom = reservatedRoom;
	}
	public void setStayingRoom(int stayingRoom) {
		this.stayingRoom = stayingRoom;
	}
	public void setEmptyRoom(int emptyRoom) {
		this.emptyRoom = emptyRoom;
	}

}


/*
public static void main(String[] args) {
// 방생성 및 배열에 값 넣기
RoomState[][] RF = new RoomState[5][20];
for (int i = 0; i < RF.length; i++) {
	for (int j = 0; j < RF[i].length; j++) {
		if (i >= 1) {
			RoomState fac = new RoomState(new Room(""), true);
			RF[i][j] = fac;
			System.out.printf("%d%02d  ", i + 1, j + 1);
			System.out.print(RF[i][j].isBool());
			if (i >= 1) {

			}
		}
	}
	System.out.println();
}

// 예약자
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
int number = scan.nextInt();
int single = scan.nextInt();

Reservation kan = new Reservation(name, number, single);

// 방 생성 및 호출
Room r = new Room("스위트룸", kan);
RF[3][3].setRoomState(r);
// 예약자 확인
boolean q = RF[3][3].getRoomState().matches("강재욱", 01062423565);
System.out.println(q);

}*/