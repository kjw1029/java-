
public interface HotelManage {
	// 명단 등록
	void register(Customer c);
	// 명단 접근
	Customer[] getCustomer();
	// 고객 찾기
	Customer findOne(String name);
	// 고객 접근
	Customer getOne(int index);
	// 방 
	void Room(Room r);
	// 예약
	// 방 체크인
	// 체크아웃
}
