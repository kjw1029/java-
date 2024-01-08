import java.awt.image.RasterFormatException;
import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
	// public void main(String[] args) {
	public static void hotel() {
        Scanner scan = new Scanner(System.in);
        ReservationPerson[] reservationList = new ReservationPerson[80];
        int index = 0;
        boolean go = true;

        RoomInfo[][] RF = RoomInfo.totalRoom();
//        loopout :
        while (go) {
            System.out.println();
//            System.out.println("------------------------------------------------------------*------------------------------------------------------------");
            System.out.println("-------------------------- 예약 메뉴 --------------------------");//59
            System.out.println("1. 예약");
            System.out.println("2. 예약확인");
            System.out.println("3. 예약취소");
            System.out.println("4. 워크인/체크인/체크아웃");
            System.out.println("5. 종료하기");
            
            
            int input = scan.nextInt();
            if(1 <= input && 5 >= input) {
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

                    /*
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
                    */

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
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
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
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
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

                    /*
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
                    */

                case 2:
                    // 예약확인
                    System.out.println();
                    System.out.println("2. 예약확인");
                    System.out.print("고객명: ");
                    String reservationName = scan.next();
                    System.out.print("연락처: ");
                    String reservationPhoneNumber = scan.next();
//                    ReservationPerson[] reverseReservationList = new ReservationPerson[80];
//                    for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
//                        reverseReservationList[j] = reservationList[i];
//                    }

                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && reservationList[i].getReservationState().equals("예약")) {
                            System.out.println("-------------------------- 예약 확인 --------------------------");
                            System.out.println("고객명: " + reservationList[i].getName());
                            System.out.println("연락처: " + reservationList[i].getPhoneNumber());
                            System.out.print(reservationList[i].getRoomUnit() + "호");
                            System.out.println("[" + RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getRoomType() + "]");
                            System.out.println(RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getAmount() + "원");
                            reservationList[i].setReservationState("예약확인");
                            // 중복 예약 불가 개선
                            
                            /*
                             int floor = cancelRoomUnit / 100;
                    int unit = cancelRoomUnit % 100;
                    RF[floor - 2][unit - 1].setReservationStatus("빈방");
                    RF[floor - 2][unit - 1].setRoomStatus("체크아웃");
                            */
                            
                            
                            
                            
                            
                        }
                    }
                    
                    
                    // 두번째 고객의 정보 검색시) 첫번째 고객이 조건을 만족하지 못해서 엘스이프(정보를 찾을수없다)
                    // 고객정보 필드에 데이터 값을 추가해서 예약이 확인된 경우 출력이 안되게 만듬
                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && !reservationList[i].getReservationState().equals("예약확인")) {
                        	
                        	System.out.println("예약자 정보를 찾을 수 없습니다.");
                            break;
                        } 
//                        else if (reservationList[i] == null || !reservationList[i].getName().equals(reservationName)
//                                || !reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//                                || !reservationList[i].getReservationState().equals("예약") || reservationList[i].getReservationState().equals("숙박중")) {
//                            System.out.println("예약자 정보를 찾을 수 없습니다.");
//                            break;
//                        }
                    }
                    break;

                /*
                for (int i = 0; i < reservationList.length; i++) {
                    if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                            && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                            && reservationList[i].getReservationState().equals("예약")) { // 저기...getReservationState().equals
                        // 에서 저 게터가 reservationPerson에
                        // 있던데 저게 맞나요???!!
//						// 같은 사람이 간격으로 두고 예약했을떄를 가정해서 만들었어요!! 실패했어요!!
//						for (int j = 0; j < reservationList.length; j++) {
//							if (reservationList[i].getName() == reservationList[j].getName()
//									&& reservationList[i].getPhoneNumber() == reservationList[j].getPhoneNumber()) {
//							}
//						}
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
                */


                case 3:
                    // 예약 변경(취소)
                    System.out.println("3. 예약취소");
//                    System.out.print("고객명: ");
//                    reservationName = scan.next();
//                    System.out.print("연락처: ");
//                    reservationPhoneNumber = scan.next();
//                    for (int i = 0; i < reservationList.length; i++) {
//                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
//                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)) {
//                            int floor = reservationList[i].getRoomUnit() / 100;
//                            int unit = reservationList[i].getRoomUnit() % 100;
//                            RF[floor - 2][unit - 1].setReservationStatus("빈방");
//                            reservationList[i] = null;
//                        }
//                    }
//                    System.out.println("취소되었습니다.");
                    
//                    System.out.println();
                    System.out.println("------- 예약 취소 --------");
                    System.out.print("고객명: ");
                    reservationName = scan.next();
                    System.out.print("연락처: ");
                    reservationPhoneNumber = scan.next();
//                    ReservationPerson[] reverseReservationList = new ReservationPerson[80];
//                    for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
//                        reverseReservationList[j] = reservationList[i];
//                    }

                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && reservationList[i].getReservationState().equals("예약")) {
                            System.out.println("-------------------------- 예약 확인 --------------------------");
                            System.out.println(i + 1 + "번 고객님");
                            System.out.println("고객명: " + reservationList[i].getName());
                            System.out.println("연락처: " + reservationList[i].getPhoneNumber());
                            System.out.print(reservationList[i].getRoomUnit() + "호");
                            System.out.println("[" + RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getRoomType() + "]");
                            System.out.println(RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getAmount() + "원");
                            // 중복 예약 불가 개선
                        }
                    }

                    System.out.println("예약취소할 고객번호?");
                    int inputCancel = scan.nextInt();
                    int cancelRoomUnit = reservationList[inputCancel-1].getRoomUnit();
                    int floor = cancelRoomUnit / 100;
                    int unit = cancelRoomUnit % 100;
                    RF[floor - 2][unit - 1].setReservationStatus("빈방");
                    RF[floor - 2][unit - 1].setRoomStatus("체크아웃");
                    reservationList[inputCancel-1] = null;
                    System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
                    System.out.println(RF[floor - 2][unit - 1].getRoomStatus());




                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && reservationList[i].getReservationState().equals("예약")) {
                            break;
                        } else if (reservationList[i] == null || !reservationList[i].getName().equals(reservationName)
                                || !reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                || !reservationList[i].getReservationState().equals("예약") || reservationList[i].getReservationState().equals("숙박중")) {
                            System.out.println("예약자 정보를 찾을 수 없습니다.");
                            break;
                        }
                    }
//                    for (int i = 0; i < reservationList.length; i++) {
//                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
//                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//                                && reservationList[i].getReservationState().equals("예약")) {
//                            System.out.println("-------------------------- 예약 확인 --------------------------");
//                            System.out.println(i + 1 + "번 고객님");
//                            System.out.println("고객명: " + reservationList[i].getName());
//                            System.out.println("연락처: " + reservationList[i].getPhoneNumber());
//                            System.out.print(reservationList[i].getRoomUnit() + "호");
//                            System.out.println("[" + RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100 - 2].getRoomType() + "]");
//                            System.out.println(RF[reservationList[i].getRoomUnit() % 100 - 1][reservationList[i].getRoomUnit() / 100 - 2].getAmount() + "원");
//                            // 중복 예약 불가 개선
//                        }
//                    }
//
//                    System.out.println("체크인할 고객번호?");
//                    int inputCheckIn = scan.nextInt();
//                    int checkInRoomUnit = reservationList[inputCheckIn-1].getRoomUnit();
//                    int floor = checkInRoomUnit / 100;
//                    int unit = checkInRoomUnit % 100;
//                    RF[floor - 2][unit - 1].setReservationStatus("숙박중");
//                    RF[floor - 2][unit - 1].setRoomStatus("체크인");
//                    System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
//                    System.out.println(RF[floor - 2][unit - 1].getRoomStatus());


                    break;

//                default:
//                    // 뒤로
//                    go = false;
//                    break;
//            }
            
//        }

//        go = true;
//        while (go) {
        case 4 :
            System.out.println("워크/체크/아웃");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    // 워크인
                    System.out.print("고객명: ");
                    guestName = scan.next();
                    System.out.print("연락처: ");
                    phoneNumber = scan.next();
                    System.out.print("방 타입[싱글/더블]: ");

                    // 워크인은 예약으로 취급하는가?
                    reservationList[index] = new ReservationPerson(guestName, phoneNumber, "예약");

                    roomType = scan.next();
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
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("숙박할 호실을 입력하세요[000]");
                        int inputUnit = scan.nextInt();
                        floor = inputUnit / 100;
                        unit = inputUnit % 100;
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
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("숙박할 호실을 입력하세요[000]");
                        int inputUnit = scan.nextInt();
                        floor = inputUnit / 100;
                        unit = inputUnit % 100;
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

                    /*

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
                    */



                case 2:
                    System.out.println();
                    System.out.println("------- 체크인 --------");
                    System.out.print("고객명: ");
                    reservationName = scan.next();
                    System.out.print("연락처: ");
                    reservationPhoneNumber = scan.next();
//                    ReservationPerson[] reverseReservationList = new ReservationPerson[80];
//                    for (int i = reservationList.length - 1, j = 0; i >= 0; i--, j++) {
//                        reverseReservationList[j] = reservationList[i];
//                    }

                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && reservationList[i].getReservationState().equals("예약")) {
                            System.out.println("-------------------------- 예약 확인 --------------------------");
                            System.out.println(i + 1 + "번 고객님");
                            System.out.println("고객명: " + reservationList[i].getName());
                            System.out.println("연락처: " + reservationList[i].getPhoneNumber());
                            System.out.print(reservationList[i].getRoomUnit() + "호");
                            System.out.println("[" + RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getRoomType() + "]");
                            System.out.println(RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getAmount() + "원");
                            // 중복 예약 불가 개선
                        }
                    }
                    
                    
                    
                    // 체크인 고객번호 출력안되게하ㅣㄱ!
                    for (int i = 0; i < reservationList.length; i++) {
                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
                                && !reservationList[i].getReservationState().equals("예약확인")) {
                        	
                        	System.out.println("체크인 정보를 찾을 수 없습니다.");
                            break;
                        } 
                    }
                      
                    System.out.println("체크인할 고객번호?");
                    int inputCheckIn = scan.nextInt();
                    int checkInRoomUnit = reservationList[inputCheckIn-1].getRoomUnit();
                    floor = checkInRoomUnit / 100;
                    unit = checkInRoomUnit % 100;
                    RF[floor - 2][unit - 1].setReservationStatus("숙박중");
                    RF[floor - 2][unit - 1].setRoomStatus("체크인");
                    System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
                    System.out.println(RF[floor - 2][unit - 1].getRoomStatus());




//                    for (int i = 0; i < reservationList.length; i++) {
//                        if (reservationList[i] != null && reservationList[i].getName().equals(reservationName)
//                                && reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//                                && reservationList[i].getReservationState().equals("예약")) {
//                            break;
//                        } else if (reservationList[i] == null || !reservationList[i].getName().equals(reservationName)
//                                || !reservationList[i].getPhoneNumber().equals(reservationPhoneNumber)
//                                || !reservationList[i].getReservationState().equals("예약") || reservationList[i].getReservationState().equals("숙박중")) {
//                            System.out.println("예약자 정보를 찾을 수 없습니다.");
//                            break;
//                        }
//                    }
                    
                    

                    
                    // 체크인
//                    System.out.println("이름");
//                    String guestName = scan.next();
//                    System.out.println("전화번호");
//                    String phoneNumber = scan.next();
//                    for (int i = 0; i < reservationList.length; i++) {
//                        if (reservationList[i] != null && reservationList[i].getName().equals(guestName)
//                                && reservationList[i].getPhoneNumber().equals(phoneNumber)) {
//                            reservationList[i].setReservationState("체크인");
//                            System.out.println("체크인성공");
//                            break;
//                        }
//                    }
//                    break;


                /*
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
                */





                case 3:

                    System.out.println("체크아웃할 호수?");
                    int inputCheckOutUnit = scan.nextInt();
//                    int checkOutRoom
//                    int checkOutRoomUnit = reservationList[inputCheckOut-1].getRoomUnit();
                    floor = inputCheckOutUnit / 100;
                    unit = inputCheckOutUnit % 100;
//                    RF[floor - 2][unit - 1].setReservationStatus("숙박중");
                    // 청소완료 후 빈방
                    RF[floor - 2][unit - 1].setRoomStatus("체크아웃");
                    System.out.println(RF[floor - 2][unit - 1].getReservationStatus());
                    System.out.println(RF[floor - 2][unit - 1].getRoomStatus());

//                    System.out.println("이름");
//                    String checkOutName = scan.next();
//                    System.out.println("전화번호");
//                    String checkOutPhoneNuber = scan.next();
//                    // 체크아웃
//                    for (int i = 0; i < reservationList.length; i++) {
//                        if (reservationList[i] != null && reservationList[i].getName().equals(checkOutName)
//                                && reservationList[i].getPhoneNumber().equals(checkOutPhoneNuber)) {
//                            reservationList[i].setReservationState("체크아웃");
//                            System.out.println("체크아웃");
//                            break;
//                        }
//
//                    }
                    break;


                /*
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
                */
            }
                case 5 : 
                	System.out.println("5.종료하기");
                	go = false;
//                	return hotel();
                	break;
                default:
                System.out.println("잘못된 입력입니다.");
                break;//switch
            
//            go = false;

        }//s
           
            
        }// if
//            break;
        }
//        return hotel();
//		return hotel();
        for (int i = 0; i < RF.length; i++) {
			for (int j = 0; j < RF[i].length; j++) {
				if(RF[i][j].getRoomStatus().equals("숙박중") && RF[i][j].getReservationStatus().equals("체크아웃") ) {
					System.out.println("-------------------------- 예약 확인 --------------------------");
                    System.out.println(i + 1 + "번 고객님");
                    System.out.println("고객명: " + reservationList[i].getName());
                    System.out.println("연락처: " + reservationList[i].getPhoneNumber());
                    System.out.print(reservationList[i].getRoomUnit() + "호");
                    System.out.println("[" + RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getRoomType() + "]");
                    System.out.println(RF[reservationList[i].getRoomUnit() / 100 - 2][reservationList[i].getRoomUnit() % 100 - 1].getAmount() + "원");
				
//					LostItemManagement lostItemManagement = new LostItemManagement(RF[i][j],reservationList[i]);
//					RF[i][j].setRoomStatus(roomStatus);
		}
        
	}
        }
	}
}
