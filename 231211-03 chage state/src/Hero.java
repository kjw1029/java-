// 영웅
// 직업 : 검사, 마법사, 도적 ...
// 공격력 : int
// 공격한다(몬스터) {
//	몬스터의 HP(체력)이 공격력만큼 감소해야 합니다.
// }
public class Hero {
	private String job;
	private int att;
	
	public Hero(String job, int att) {
		this.job = job;
		this.att = att;
	}
	
	public void setAt(int att) {
		this.att = att;
	}
	
	public int getAt() {
		return att;
	}
	
	public void attMonster(Monster monster) {
		int a = monster.getHp();
		a -= att;
		monster.setHp(a);
	}
}
