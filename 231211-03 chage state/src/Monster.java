// 몬스터
// HP(체력) : int

public class Monster {
	private String name;
	private int hp;
	
	public Monster (String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
