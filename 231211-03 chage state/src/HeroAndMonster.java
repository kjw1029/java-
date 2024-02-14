public class HeroAndMonster {
	public static void main(String[] args) {
		// 영웅 한 명을 생성
		// 몬스터를 생성하고
		// 영웅.공격(몬스터)
		Hero h = new Hero("검사", 100);
		Monster m = new Monster("드래곤", 500);
		
		System.out.println(m.getHp());
		h.attMonster(m);
		h.attMonster(m);
		System.out.println(m.getHp());
		
		
		
		
	}
}
