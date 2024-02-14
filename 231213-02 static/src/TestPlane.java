import plane.Plane;

// 각 필드 정의 및 private 접근 제한자 설정
// public 생성자 및 getter/setter

// 생성자 정의
// (String, STring int)
// (String, String) => int값 전달이 없을 경우, 최대 승객수는 250이다

// main 메소드를 포함한 테스트 클래스에서 객체 생성
// 생성된 인스턴스의 수를 나타낼 수 있는 변수를 선언하고, 인스턴스 생성시 1씩 증가한다.
// 여러개의 인스턴스 생성 후, planeCount 값을 출력해서 확인

// 음속.

public class TestPlane {
	public static void main(String[] args) {
		// 생성1
		Plane tp = new Plane("보잉", "A380", 300);
		// 생성2
		Plane tp2 = new Plane("에어버스", "Boeing");
		// 생성 3
		Plane tp3 = new Plane("DC10", "맥도널더글라스");
		tp.getModel();
		tp.getPassenger();
		
		
		System.out.println("음속: " + Plane.SPEED_OF_SOUND);
		System.out.println(Plane.getPlaneCount());
		

	}

}
