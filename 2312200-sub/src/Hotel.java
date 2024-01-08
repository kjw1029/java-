import java.awt.image.RasterFormatException;
import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ReservationPerson[] reservationList = new ReservationPerson[80];
		int index = 0;
		boolean go = true;

//		RoomInfo[][] RF = new RoomInfo[20][4];
		RoomInfo[][] RF = RoomInfo.totalRoom();
//		RoomInfo
//		RoomInfo[][] RF = new RoomInfo[20][4];
		while (go) {
			System.out.println("메뉴선택");
			System.out.println("1. 예약");
			System.out.println("2. 예약확인");
			System.out.println("3. 예약변경");

			int input = scan.nextInt();
			switch (input) {

			case 1:
				System.out.println("1. 예약");
				// 예약자 생성
				System.out.println("이름");
				String guestName = scan.next();
				System.out.println("전화번호");
				String phoneNumber = scan.next();
//				scan.next();
				System.out.println("싱글, 더블 입력");
				reservationList[index] = new ReservationPerson(guestName, phoneNumber, "예약");
//				String roomType = scan.next();
				
				

				String roomType = scan.next();
				if (roomType.equals("싱글")) {
					for (int i = 0; i < RF.length; i++) {
						for (int j = 0; j < RF[j].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("싱글")) {
								System.out.print(RF[i][j].getUnit());
								System.out.print("\t");
							}
						}
						System.out.println();
					}

				} else if (roomType.equals("더블")) {
					for (int i = 0; i < RF.length; i++) {
						for (int j = 0; j < RF[j].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("더블")) {
								System.out.print(RF[i][j].getUnit());
								System.out.print("\t");
							}
						}
					}
				}

//				for (int i = 0; i < reservationList.length; i++) {
//					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
//							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//							&& reservationList[i].getReservationState().equals("예약")) {
//						System.out.println("예약확인");
//						break;
//					} else if(i == reservationList.length-1) {
//						System.out.println("일치정보 없음");
//						break;
//					}
//				}
//				break;

				System.out.println("몇층");
				int floor = scan.nextInt();
				System.out.println("몇호");
				int unit = scan.nextInt();
//				Arrays.fill(RF);
//				System.out.println(RF[1][1].getReservationStatus());
				RF[unit - 1][floor - 2].setReservationStatus("예약완료");
				System.out.println(RF[unit - 1][floor - 2].getReservationStatus());

				
//				RF[unit - 1][floor - 2].setUnit((floor * 100 )+ unit);
			
				reservationList[index].setRoomUnit((floor * 100 )+ unit);
				index++;
//				for(int i = 0; i < RF.length; i++) {
//					for (int j = 0; j < RF[i].length; j++) {
//						System.out.print(RF[j][i].getUnit());
//						System.out.print(RF[j][i].getReservationStatus());
//					}
//					System.out.println();
//				}

				break;

			case 2:
				// 예약확인
				System.out.println("2. 예약확인");

				System.out.println("이름");
				String reservationName = scan.next();
				System.out.println("전화번호");
				String reservationPhoneNumber = scan.next();
				ReservationPerson[] reverseReservationList = new ReservationPerson[80];
				for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
					reverseReservationList[j] = reservationList[i];
				}

//				for (int i = 0; i < reverseReservationList.length; i++) {
//					if (reverseReservationList[i] != null && reverseReservationList[i].getName().equals(reservationName)
//							&& reverseReservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//							&& reverseReservationList[i].getReservationState().equals("예약")) {
//						System.out.println("예약확인");
//						
//					} else {
//						System.out.println("일치정보 없음");
//						break;
//					}
//				}

//				for (int i = reservationList.length - 1; i <= 0; i--) {
//					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
//							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//							&& reservationList[i].getReservationState().equals("예약")) {
//						System.out.println("예약확인");
//						break;
//					} else {
//						System.out.println("일치정보 없음");
//						break;
//					}
//				}

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							&& reservationList[i].getReservationState().equals("예약")) {
						System.out.println("예약확인");
						System.out.println(reservationList[i].getName());
						System.out.println(reservationList[i].getPhoneNumber());
						System.out.println(reservationList[i].getRoomUnit());
						//(reservationList[i].getRoomUnit() / 100 -2)// floor
						//(reservationList[i].getRoomUnit() % 100 - 1)// unit
						System.out.println(RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100 -2].getAmount());
						System.out.println(RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100 -2].getRoomType());

						
						
					} else if (i == reservationList.length - 1) {
						System.out.println("일치정보 없음");
						break;
					}
				}
				break;
				
				
			case 3:
				// 예약 변경(취소)
				System.out.println("3. 예약변경");

				System.out.println("이름");
				String cancelName = scan.next();
				System.out.println("전화번호");
				String cancelPhoneNumber = scan.next();
				System.out.println("메뉴선택");
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(cancelName)
							&& reservationList[i].getPhoneNumber().equals(cancelPhoneNumber)) {
						reservationList[i].setReservationState("취소");
						reservationList[i] = new ReservationPerson("", "", "");
//						reservationList[i] = null;
						System.out.println("취소되었습니다.");

						
					}

				}
				break;

			default:// 뒤로
				go = false;
				break;
			}
		}

		go = true;
		while (go) {
			System.out.println("워크/체크/아웃");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				// 워크인
				System.out.println("이름");
				String walkInName = scan.next();
				System.out.println("전화번호");
				String walkInphoneNumber = scan.next();
//				System.out.println("싱글, 더블 입력");
//				String walkInroomType = scan.next();

//				reservationList[index] = new ReservationPerson(walkInName, walkInphoneNumber, walkInroomType, "워크인");
				if (index < 80) {
					index++;
				} else {
					index = 0;
				}
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(walkInName)
							&& reservationList[i].getPhoneNumber().equals(walkInphoneNumber)) {
						reservationList[i].setReservationState("워크인");
						System.out.println("워크인 성공");
						break;
					}
				}
				break;

			case 2:
				// 체크인
				System.out.println("이름");
				String guestName = scan.next();
				System.out.println("전화번호");
				String phoneNumber = scan.next();
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(guestName)
							&& reservationList[i].getPhoneNumber().equals(phoneNumber)) {
						reservationList[i].setReservationState("체크인");
						System.out.println("체크인성공");
						break;
					}
				}
				break;

			case 3:
				System.out.println("이름");
				String checkOutName = scan.next();
				System.out.println("전화번호");
				String checkOutPhoneNuber = scan.next();
				// 체크아웃
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(checkOutName)
							&& reservationList[i].getPhoneNumber().equals(checkOutPhoneNuber)) {
						reservationList[i].setReservationState("체크아웃");
						System.out.println("체크아웃");
						break;
					}

				}
//				RoomInfo.printReservationUnit();
				break;

			default:
				go = false;
				break;
			}

		}
	}
}
