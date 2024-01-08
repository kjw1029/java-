import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class InfoDesk {
	public static void printInfoDeskMenu() {
	
	Scanner scan = new Scanner(System.in);
    // 로그인 성공시
	
	GuestInfo[] guest = new GuestInfo[80];
			int count = 0;
    while (true) {
        System.out.println("---메뉴---");
        System.out.println("1. 예약/ 예약 확인/ 예약 변경");
        System.out.println("2. 체크인/ 체크아웃/ 워크인");
        System.out.println("3. 프로그램 종료");
        System.out.println("번호를 입력하세요.");
        int mainMenuNum = scan.nextInt();

        switch (mainMenuNum) {
            case 1:

                System.out.println("1. 예약");
                System.out.println("2. 예약 확인");
                System.out.println("3. 예약 변경");
                int menuNum1 = scan.nextInt();
                switch (menuNum1) {
                    case 1:

                        System.out.println("1. 예약");
                        // 고객정보 기입
//                        Reservation.reservationMenu();
//                        System.out.println("고객정보를 입력하세요.");
//                        System.out.println("성명: ");
//                        String reservationPerson = scan.next();
//                        System.out.println("전화번호: ");
//                        String ReservationPhoneNumber = scan.nextLine();
//                        scan.nextLine();
                        // 날짜 및 시간
                        LocalDate today = LocalDate.now();
//                System.out.println(today.toString());
//                System.out.println(today.getDayOfWeek().toString());

                        int year = today.getYear();
                        int month = today.getDayOfMonth();
                        LocalDate firstDay = today.withDayOfMonth(1);
                        String format = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd E"));
                        System.out.println(format);

//                LocalDate firstDay = LocalDate.of(year, month, 1);

                        int dayOfWeek = firstDay.getDayOfWeek().getValue();
                        int length = firstDay.lengthOfMonth();

                        System.out.println(" 일\t월\t화\t수\t목\t금\t토");

                        for (int i = 0; i < dayOfWeek; i++) {
                            System.out.print("\t");
                        }

                        for (int i = 1; i <= length; i++) {
                            System.out.printf("%2d\t", i);
                            dayOfWeek++;
                            if (dayOfWeek % 7 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.print("예약 날짜(yyyyMMdd): ");
                        int reservationDate = scan.nextInt();

                        // 빈 객실


                        // 예약
                        
                        GuestInfo guestInfo = new GuestInfo();
                        guestInfo.getName();
                        guest[count] = guestInfo;
                        System.out.println(guestInfo.getName());
                        System.out.println(guest[0].getName());
                        count++;
                        // 결제
                        break;

                    case 2:
                        System.out.println("2. 예약 확인");
                        
                        if (name.equals(name) && number == number && date == date) {
                			
                		}
                		
                        System.out.println(guest[0].getName());
                        break;
                    case 3:
                        System.out.println("3. 예약 변경");
                        break;
                    default:
                        System.out.println("다시 한번 입력하세요.");
                }
                break;
            case 2:
                System.out.println("1. 체크인");
                System.out.println("2. 체크아웃");
                System.out.println("3. 워크인");
                int menuNum2 = scan.nextInt();
                switch (menuNum2) {
                    case 1:
                        System.out.println("1. 체크인");

                        break;
                    case 2:
                        System.out.println("2. 체크아웃");

                        break;
                    case 3:
                        System.out.println("3. 워크인");

                        break;
                    default:
                        System.out.println("다시 한번 입력하세요.");

                }
                break;

         case 3:
               return ;
               

            default:
                System.out.println("다시 한번 입력하세요.");

        }
    }

}
}
