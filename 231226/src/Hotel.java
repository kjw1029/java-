import java.awt.image.RasterFormatException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 */
public class Hotel {
	// 김종희 START
	/*
	 * 로그인이라는 프로그램이 최초로 실행될 때 단 1번만 생성되어야할 정보들, 변수들은 hotel 메서드가 아닌 그 위로 static
	 */
	public static int roomCount = 80;

	public static ReservationPerson[] reservationList = new ReservationPerson[roomCount];
	public static RoomInfo[][] RF = RoomInfo.totalRoom();
	public static int totalAmount[] = new int[4];

	// 청소부 유무 체크하는 변수 추가 종희
	/*
	 * hotel 메서드 처리한 다음에 매출을 조회할 수 있도록 가격정보와 나간 방의 숫자를 int[]로 받아서 처리할 수 있게함 hotel
	 * 메뉴를 입장할 때는 청소부일 경우 메뉴가 다르기 때문에 boolean변수를 받아서 호출을 해서 청소부 , 그외로 나뉘어서 호텔메뉴를 노출함
	 */
	public int[] hotel(boolean isCleaner) {

		// ReservationPerson[] reservationList = new ReservationPerson[80]; 김종희
		// RoomInfo[][] RF = RoomInfo.totalRoom(); 김종희
		Scanner scan = new Scanner(System.in);
		int index = 0;
		boolean go = true;

		if (isCleaner) {
			try {
				System.out.println("1.청소 필요방 조회\n2.나가기");
				int workInfoChk = scan.nextInt();

				/*
				 * throw new Exception 강제로 Exception을 발생시킴 코드 상으로는 에러가 아닌 상황이지만 우리 입장에서 에러다고
				 * 판단되는 곳에서 사용해서 catch에 보내고 처리함
				 */
				if (workInfoChk == 2) {
					return totalAmount;
				} else if (workInfoChk != 1) {
					throw new Exception();
				}
				System.out.println("------------------------ 현재 청소가 필요한 방 ------------------------");
				for (int i = 0; i < RF.length; i++) {
					System.out.print(i + 2 + "층: ");
					for (int j = 0; j < RF[i].length; j++) {
						if (RF != null && RF[i][j].getCleanFlag() == false) {
							System.out.print(RF[i][j].getUnit() + "호");
							System.out.print("[" + RF[i][j].getRoomType() + "] ");
							System.out.print("\t");
						}
					}
					System.out.println();
				}
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------");
				System.out.println("청소할 호실을 입력하세요[000]");
				System.out.println("돌아가려면 아무거나 입력하세요");
				int cInputUnit = scan.nextInt();
				int cFloor = cInputUnit / 100;
				int cUnit = cInputUnit % 100;
				if (RF[cFloor - 2][cUnit - 1].getCleanFlag() == true) {
					System.out.println("현재 사용중인 방 혹은 청소가 불필요한 방입니다.");
					throw new Exception();

				} else if ("".equals(RF[cFloor - 2][cUnit - 1].getRoomStatus())
						|| RF[cFloor - 2][cUnit - 1].getRoomStatus().isEmpty()) {
					System.out.println("현재 입력하신 번호는 잘못된 방 번호입니다.\n다시 입력해 주시길 바랍니다.");
					throw new Exception();
				}
				System.out.println("해당 방의 청소를 완료 처리하시겠습니까?(1.네/2.아니오)");
				int chk = scan.nextInt();
				if (chk == 2) {
					System.out.println("메뉴 처음으로 돌아갑니다.");
					hotel(true);
				} else if (chk != 1 && chk != 2) {
					throw new Exception();
				}

				RF[cFloor - 2][cUnit - 1].setClean(true);
				System.out.println("청소 완료 정상 처리되었습니다.");
				hotel(true);

			} catch (Exception c) {
				// System.out.println("올바른 호실을 입력해주세요(ex : 201)");
				System.out.println("올바른 값을 지정해 주시길 바랍니다.\n메뉴 처음으로 돌아갑니다.");
				return totalAmount;
			}

			return totalAmount;

		}
		// 종희 END
		while (go) {
			System.out.println();
//            System.out.println("------------------------------------------------------------*------------------------------------------------------------");
			System.out.println("-------------------------- 예약 메뉴 --------------------------");// 59
			System.out.println("1. 예약");
			System.out.println("2. 예약확인");
			System.out.println("3. 예약변경");

			int input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println();
				System.out.println("1. 예약");
				// 예약자 생성
				System.out.print("고객명: ");
				String guestName = scan.next();
				System.out.print("연락처: ");
				String phoneNumber = scan.next();
				System.out.print("방 타입[싱글/더블]: ");

				reservationList[index] = new ReservationPerson(guestName, phoneNumber, "예약");

				String roomType = scan.next();

				if (roomType.equals("싱글")) {
					System.out.println("------------------------ 현재 비어있는 방 ------------------------");
					for (int i = 0; i < RF.length; i++) {
						System.out.print(i + 2 + "층: ");
						for (int j = 0; j < RF[i].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("싱글")) {
								System.out.print(RF[i][j].getUnit() + "호");
								System.out.print("[" + RF[i][j].getRoomType() + "] ");
								System.out.print("\t");
							}
						}
						System.out.println();
					}
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------");
					System.out.println("예약할 호실을 입력하세요[000]");
					int inputUnit = scan.nextInt();
					int floor = inputUnit / 100;
					int unit = inputUnit % 100;

					// 종희 START
					if (!RF[floor - 2][unit - 1].getCleanFlag() && !RF[floor - 2][unit - 1].getRoomStatus().isEmpty()
							&& !"".equals(RF[floor - 2][unit - 1].getRoomStatus())) {
						System.out.println("아직 청소가 완료되지 않은 객실입니다.\n다른 객실로 예약하시길 바랍니다.");
						break;
					}
					// 종희 END
					if (inputUnit > 520 || inputUnit < 201) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 420 && inputUnit < 501) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 320 && inputUnit < 401) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 220 && inputUnit < 301) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit % 2 == 0) {
						System.out.println("잘못된 입력입니다.");
						break;

						// 이미 예약된 방에 중복 예약 가능
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("예약완료")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("숙박중")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else {
						RF[floor - 2][unit - 1].setReservationStatus("예약완료");

						System.out.println(RF[floor - 2][unit - 1].getReservationStatus());

						reservationList[index].setRoomUnit((floor * 100) + unit);
						index++;
						break;
					}

				} else if (roomType.equals("더블")) {
					System.out.println("------------------------ 현재 비어있는 방 ------------------------");
					for (int i = 0; i < RF.length; i++) {
						System.out.print(i + 2 + "층: ");
						for (int j = 0; j < RF[i].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("더블")) {
								System.out.print(RF[i][j].getUnit() + "호");
								System.out.print("[" + RF[i][j].getRoomType() + "] ");
								System.out.print("\t");
							}
						}
						System.out.println();
					}
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------");
					System.out.println("예약할 호실을 입력하세요[000]");
					int inputUnit = scan.nextInt();
					int floor = inputUnit / 100;
					int unit = inputUnit % 100;
					if (inputUnit > 520 || inputUnit < 201) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 420 && inputUnit < 501) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 320 && inputUnit < 401) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 220 && inputUnit < 301) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit % 2 != 0) {
						System.out.println("잘못된 입력입니다.");
						break;

						// 이미 예약된 방에 중복 예약 가능
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("예약완료")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("숙박중")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else {
						RF[floor - 2][unit - 1].setReservationStatus("예약완료");
						System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
						reservationList[index].setRoomUnit((floor * 100) + unit);
						index++;
						break;
					}

				} else {
					System.out.println("잘못된 입력입니다.");
					break;
				}

			case 2:
				// 예약확인
				System.out.println();
				System.out.println("2. 예약확인");
				System.out.print("고객명: ");
				String reservationName = scan.next();
				System.out.print("연락처: ");
				String reservationPhoneNumber = scan.next();
				ReservationPerson[] reverseReservationList = new ReservationPerson[80];
				for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
					reverseReservationList[j] = reservationList[i];
				}

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							&& reservationList[i].getReservationState().equals("예약")) {
						System.out.println("-------------------------- 예약 확인 --------------------------");
						System.out.println("고객명: " + reservationList[i].getName());
						System.out.println("연락처: " + reservationList[i].getPhoneNumber());
						System.out.print(reservationList[i].getRoomUnit() + "호");
						System.out.println("["
								+ RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getRoomType()
								+ "]");
						System.out.println(
								RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getAmount() + "원");
						// 중복 예약 불가 개선
					}
				}

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							&& reservationList[i].getReservationState().equals("예약")) {
						break;
					} else if (reservationList[i] == null || !reservationList[i].getName().equals(reservationName)
							|| !reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							|| !reservationList[i].getReservationState().equals("예약")
							|| reservationList[i].getReservationState().equals("숙박중")) {
						System.out.println("예약자 정보를 찾을 수 없습니다.");
						break;
					}
				}
				break;

			case 3:
				// 예약 변경(취소)
				System.out.println("3. 예약변경");
				System.out.print("고객명: ");
				reservationName = scan.next();
				System.out.print("연락처: ");
				reservationPhoneNumber = scan.next();
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)) {
						int floor = reservationList[i].getRoomUnit() / 100;
						int unit = reservationList[i].getRoomUnit() % 100;
						RF[floor - 2][unit - 1].setReservationStatus("빈방");
						RF[floor - 2][unit - 1].setClean(true); // 김종희
						reservationList[i] = null;
					}
				}
				System.out.println("취소되었습니다.");
				break;

			default:
				// 뒤로
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
				System.out.print("고객명: ");
				String guestName = scan.next();
				System.out.print("연락처: ");
				String phoneNumber = scan.next();
				System.out.print("방 타입[싱글/더블]: ");

				// 워크인은 예약으로 취급하는가?
				reservationList[index] = new ReservationPerson(guestName, phoneNumber, "예약");

				String roomType = scan.next();
				if (roomType.equals("싱글")) {
					System.out.println("------------------------ 현재 비어있는 방 ------------------------");
					for (int i = 0; i < RF.length; i++) {
						System.out.print(i + 2 + "층: ");
						for (int j = 0; j < RF[i].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("싱글")) {
								System.out.print(RF[i][j].getUnit() + "호");
								System.out.print("[" + RF[i][j].getRoomType() + "] ");
								System.out.print("\t");
							}
						}
						System.out.println();
					}
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------");
					System.out.println("숙박할 호실을 입력하세요[000]");
					int inputUnit = scan.nextInt();
					int floor = inputUnit / 100;
					int unit = inputUnit % 100;
					if (inputUnit > 520 || inputUnit < 201) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 420 && inputUnit < 501) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 320 && inputUnit < 401) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 220 && inputUnit < 301) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit % 2 == 0) {
						System.out.println("잘못된 입력입니다.");
						break;

						// 이미 예약된 방에 중복 예약 가능
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("예약완료")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("숙박중")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else {
						RF[floor - 2][unit - 1].setReservationStatus("숙박중");
						RF[floor - 2][unit - 1].setRoomStatus("워크인");
						System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
						System.out.println(RF[floor - 2][unit - 1].getRoomStatus());
						reservationList[index].setRoomUnit((floor * 100) + unit);
						index++;
						break;
					}

				} else if (roomType.equals("더블")) {
					System.out.println("------------------------ 현재 비어있는 방 ------------------------");
					for (int i = 0; i < RF.length; i++) {
						System.out.print(i + 2 + "층: ");
						for (int j = 0; j < RF[i].length; j++) {
							if (RF != null && RF[i][j].getReservationStatus().equals("빈방")
									&& RF[i][j].getRoomType().equals("더블")) {
								System.out.print(RF[i][j].getUnit() + "호");
								System.out.print("[" + RF[i][j].getRoomType() + "] ");
								System.out.print("\t");
							}
						}
						System.out.println();
					}
					System.out.println(
							"-------------------------------------------------------------------------------------------------------------------------");
					System.out.println("숙박할 호실을 입력하세요[000]");
					int inputUnit = scan.nextInt();
					int floor = inputUnit / 100;
					int unit = inputUnit % 100;
					if (inputUnit > 520 || inputUnit < 201) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 420 && inputUnit < 501) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 320 && inputUnit < 401) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit > 220 && inputUnit < 301) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (inputUnit % 2 != 0) {
						System.out.println("잘못된 입력입니다.");
						break;

						// 이미 예약된 방에 중복 예약 가능
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("예약완료")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else if (RF[floor - 2][unit - 1].getReservationStatus().equals("숙박중")) {
						System.out.println("잘못된 입력입니다.");
						break;
					} else {
						RF[floor - 2][unit - 1].setReservationStatus("숙박중");
						RF[floor - 2][unit - 1].setRoomStatus("워크인");
						System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
						System.out.println(RF[floor - 2][unit - 1].getRoomStatus());
						reservationList[index].setRoomUnit((floor * 100) + unit);
						index++;
						break;
					}

				} else {
					System.out.println("잘못된 입력입니다.");
					break;
				}

			case 2:
				System.out.println();
				System.out.println("------- 체크인 --------");
				System.out.print("고객명: ");
				String reservationName = scan.next();
				System.out.print("연락처: ");
				String reservationPhoneNumber = scan.next();
				ReservationPerson[] reverseReservationList = new ReservationPerson[80];
				int count = 0;
				for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
					reverseReservationList[j] = reservationList[i];
				}

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)) {
						System.out.println("-------------------------- 예약 확인 --------------------------");
						System.out.println(i + 1 + "번 고객님");
						System.out.println("고객명: " + reservationList[i].getName());
						System.out.println("연락처: " + reservationList[i].getPhoneNumber());
						System.out.print(reservationList[i].getRoomUnit() + "호");
						System.out.println("["
								+ RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getRoomType()
								+ "]");
						System.out.println(
								RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getAmount() + "원");
						count++;
						// 중복 예약 불가 개선
						if (count >= 1 && i == reservationList.length - 1
								&& RF[reservationList[i].roomUnit / 100 - 2][reservationList[i].roomUnit % 100 - 1]
										.getRoomStatus().equals("체크인")) {
							System.out.println("체크인할 고객번호?");
							int inputCheckIn = scan.nextInt();
							int checkInRoomUnit = reservationList[inputCheckIn - 1].getRoomUnit();
							int floor = checkInRoomUnit / 100;
							int unit = checkInRoomUnit % 100;
							RF[floor - 2][unit - 1].setReservationStatus("숙박중");
							RF[floor - 2][unit - 1].setRoomStatus("체크인");
							System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
							System.out.println(RF[floor - 2][unit - 1].getRoomStatus());
						}
					}
				}

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
							&& reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							&& reservationList[i].getReservationState().equals("예약")) {
						break;
					} else if (reservationList[i] == null || !reservationList[i].getName().equals(reservationName)
							|| !reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
							|| !reservationList[i].getReservationState().equals("예약")
							|| reservationList[i].getReservationState().equals("숙박중")) {
						System.out.println("예약자 정보를 찾을 수 없습니다.");
						break;
					}
				}

				break;

			case 3:

				System.out.println("체크아웃할 호수?");
				int inputCheckOutUnit = scan.nextInt();
//                    int checkOutRoom
//                    int checkOutRoomUnit = reservationList[inputCheckOut-1].getRoomUnit();
				int floor = inputCheckOutUnit / 100;
				int unit = inputCheckOutUnit % 100;
//                    RF[floor - 2][unit - 1].setReservationStatus("숙박중");
				// 청소완료 후 빈방
				RF[floor - 2][unit - 1].setRoomStatus("체크아웃");
				RF[floor - 2][unit - 1].setClean(false); // 종희
				System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
				System.out.println(RF[floor - 2][unit - 1].getRoomStatus());

				// 김종희 START
				if ("싱글".equals(RF[floor - 2][unit - 1].getRoomType())
						&& "체크아웃".equals(RF[floor - 2][unit - 1].getRoomStatus())) {
					totalAmount[0] = totalAmount[0] + RF[floor - 2][unit - 1].getAmount();
					totalAmount[2] = totalAmount[0] / RF[floor - 2][unit - 1].getAmount();
				} else if ("더블".equals(RF[floor - 2][unit - 1].getRoomType())
						&& "체크아웃".equals(RF[floor - 2][unit - 1].getRoomStatus())) {
					totalAmount[1] = totalAmount[1] + RF[floor - 2][unit - 1].getAmount();
					totalAmount[3] = totalAmount[1] / RF[floor - 2][unit - 1].getAmount();
				}

				break;
			// 김종희 END

			default:

				go = false;
				break;
			}

		}

		/*
		 * 체크아웃된 값 리턴
		 */

		return totalAmount;
	}

}
