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
			System.out.println("4. 워크인/체크인/체크아웃");

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
				String roomType = "";
				// 제대로 입력할때까지 계속 반복되도록 만들었어요!! 당일 변경한 부분에 대해서 !! 붙여서 쓰겠습니다!!
				while (true) {
					System.out.println("싱글, 더블 입력");
					roomType = scan.next();
					if (roomType.length() > 2 && roomType.length() <= 1) {
						System.out.println("잘못된 입력입니다.");
					} else if (roomType.equals("싱글") || roomType.equals("더블")) {

						break;
					}
				}
//				StringBuilder sb = new StringBuilder(roomType);
				reservationList[index] = new ReservationPerson(guestName, phoneNumber, "예약");
//				String roomType = scan.next();

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

				// 제대로 입력할때까지 계속 반복되도록 만들었어요!!
				int floor = 0;
				while (true) {
					System.out.println("층수(2 ~ 5층)입력");
					floor = scan.nextInt();
					if (floor >= 2 && floor <= 5) {
						break;
					} else {
						System.out.println("잘못된 입력입니다");
					}
				}
				// 제대로 입력할때까지 계속 반복되도록 만들었어요!!
				// 처음에 예약시 객실선택에 따라 호수 누를 수 있게 만들었어요!!
				int unit = 0;
				while (true) {
					System.out.println("몇호(1 ~ 10호실) 입력");
					unit = scan.nextInt();
					if (roomType.equals("싱글") && unit % 2 == 1 && unit >= 1 && unit <= 10) {
						break;
					} else if (roomType.equals("더블") && unit % 2 == 0 && unit >= 1 && unit <= 10) {
						break;
					} else {
						System.out.println("객실 타입 불일치(싱글 홀수객실, 더블 짝수객실)");
					}
				}
//				Arrays.fill(RF);
//				System.out.println(RF[1][1].getReservationStatus());
				// 같은방 중복 방지!!
				if (RF[unit - 1][floor - 2].getReservationStatus().equals("빈방")) {
					RF[unit - 1][floor - 2].setReservationStatus("예약완료");
					System.out.println(RF[unit - 1][floor - 2].getReservationStatus());
					reservationList[index].setRoomUnit((floor * 100) + unit);
					index++;
				} else {
					System.out.println("이미 예약되어 있는 방 입니다.");
				}

//				RF[unit - 1][floor - 2].setUnit((floor * 100 )+ unit);

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
				// 리버스 어디에 사용되는지몰라서 주석 처리했습니다!!
//				ReservationPerson[] reverseReservationList = new ReservationPerson[80];
//				for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
//					reverseReservationList[j] = reservationList[i];
//				}

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
							&& reservationList[i].getReservationState().equals("예약")) { // 저기...getReservationState().equals
																						// 에서 저 게터가 reservationPerson에
																						// 있던데 저게 맞나요???!!
						
						System.out.println(reservationList[i].getName());
						System.out.println(reservationList[i].getPhoneNumber());
						System.out.println(reservationList[i].getRoomUnit());
						System.out.println("예약확인");
						// (reservationList[i].getRoomUnit() / 100 -2)// floor
						// (reservationList[i].getRoomUnit() % 100 - 1)// unit
						System.out.println(
								RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getAmount());
						System.out.println(
								RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100
										- 2].getRoomType());

					} else if (i == reservationList.length - 1) {
						System.out.println("일치정보 없음"); // 79 무조건 출력됨.....도와주세요!!
						break;
					}
				}
				break;

			case 3:
				// 예약 변경(취소)
				System.out.println("3. 예약변경");
				
				System.out.println("1. 예약취소 2. 방변경");
				int sellect = scan.nextInt();
				switch(sellect) {
				case 1 : 
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
				case 2 :
					System.out.println("2.방변경");
					System.out.println("이름");
					String cancelName1 = scan.next();
					System.out.println("전화번호");
					String cancelPhoneNumber1 = scan.next();
					for (int i = 0; i < reservationList.length; i++) {
						if (reservationList[i] != null && reservationList[i].getName().equals(cancelName1)
								&& reservationList[i].getPhoneNumber().equals(cancelPhoneNumber1)) {
							System.out.println("현재호수" + RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100- 2].getRoomType());
							while (true) {
								System.out.println("층수(2 ~ 5층)입력");
								floor = scan.nextInt();
								if (floor >= 2 && floor <= 5) {
									break;
								} else {
									System.out.println("잘못된 입력입니다");
								}
							}
							while (true) {
								System.out.println("몇호(1 ~ 10호실) 입력");
								unit = scan.nextInt();
								if (unit % 2 == 1 && unit >= 1 && unit <= 10) {
									break;
								} else if (unit % 2 == 0 && unit >= 1 && unit <= 10) {
									break;
								} else {
									System.out.println("객실 타입 불일치(싱글 홀수객실, 더블 짝수객실)");
								}
							}
						}
					}
					

			default:
				// 다음단계
				go = false;
				break;
			}
		}

		go = true;
		while (go) {
			System.out.println("워크/체크/아웃");
			int input1 = scan.nextInt();
			switch (input1) {
			case 1:
				// 워크인
				// 변수 지키기 위해서 위에 선언했습니다!!
				int floor = 0;
				int unit = 0;
				System.out.println("이름");
				String walkInName = scan.next();
				System.out.println("전화번호");
				String walkInphoneNumber = scan.next();
//				System.out.println("싱글, 더블 입력");
//				String walkInroomType = scan.next();

				// 밑에 주석처리되어 있었는데 reservationList에 들어가있어야 for이 돌아가는거 아닌가요? 일단 그래서 살려봤습니다!!
				reservationList[index] = new ReservationPerson(walkInName, walkInphoneNumber, "워크인");

				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(walkInName)
							&& reservationList[i].getPhoneNumber().equals(walkInphoneNumber)) {
						// 예약자에서 가져와서 누더기 만들었습니다!!
						for (int k = 0; k < RF.length; k++) {
							for (int j = 0; j < RF[j].length; j++) {
								if (RF != null && RF[k][j].getReservationStatus().equals("빈방")) {
									System.out.print(RF[k][j].getUnit());
									System.out.print("\t");
								}
							}
							System.out.println();
						}
						while (true) {
							System.out.println("층수(2 ~ 5층)입력");
							floor = scan.nextInt();
							if (floor >= 2 && floor <= 5) {
								break;
							} else {
								System.out.println("잘못된 입력입니다");
							}
						}

						while (true) {
							System.out.println("몇호(1 ~ 10호실) 입력");
							unit = scan.nextInt();
							if (unit >= 1 && unit <= 10) {
								break;
							}
						}
						RF[unit - 1][floor - 2].setReservationStatus("숙박중");
						RF[unit - 1][floor - 2].setRoomStatus("워크인");
						reservationList[index].setRoomUnit((floor * 100) + unit);

//						reservationList[index].setRoomUnit((floor * 100) + unit);
//						RF[unit - 1][floor - 2].setReservationStatus("예약완료");

						System.out.println("워크인 성공");
						if (index < 80) {
							index++;
						} else {
							index = 0; /// 음.....저거 어떻게 고급지게 보이게 할까요?!!
						}
						break;
					}
				}
				break;

			case 2:
				// 체크인
				// 수정했어요!!
				System.out.println("이름");
				String guestName = scan.next();
				System.out.println("전화번호");
				String phoneNumber = scan.next();
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(guestName)
							&& reservationList[i].getPhoneNumber().equals(phoneNumber)) {
						RF[(reservationList[i].getRoomUnit() / 100 - 2)][(reservationList[i].getRoomUnit() % 100 - 1)]
								.setReservationStatus("숙박중");
						RF[(reservationList[i].getRoomUnit() / 100 - 2)][(reservationList[i].getRoomUnit() % 100 - 1)]
								.setRoomStatus("체크인");
						System.out.println("체크인성공");
						break;
					}
				}
				break;

			case 3:
				// 수정했어요!!
				System.out.println("이름");
				String checkOutName = scan.next();
				System.out.println("전화번호");
				String checkOutPhoneNuber = scan.next();
				// 체크아웃
				for (int i = 0; i < reservationList.length; i++) {
					if (reservationList[i] != null && reservationList[i].getName().equals(checkOutName)
							&& reservationList[i].getPhoneNumber().equals(checkOutPhoneNuber)) {
						RF[(reservationList[i].getRoomUnit() / 100 - 2)][(reservationList[i].getRoomUnit() % 100 - 1)]
								.setReservationStatus("빈방");
						RF[(reservationList[i].getRoomUnit() / 100 - 2)][(reservationList[i].getRoomUnit() % 100 - 1)]
								.setRoomStatus("체크아웃");
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
}
