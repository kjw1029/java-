

public class Monster {
private int monsterAttack;
private int monsterHP;
private int monsterHeal;



public Monster(int monsterAttack, int monsterHP) {
	this.monsterAttack = monsterAttack;
	this.monsterHP = monsterHP;
}

public int getMonsterHP() {
	return monsterHP;
}
public void setMonsterHP(int monsterHP) {
	this.monsterHP = monsterHP;
}

public int getMonsterAttack() {
	return monsterAttack;
}
public void setMonsterAttack(int monsterAttack) {
	this.monsterAttack = monsterAttack;
}
public void goDamage2(Hero hero) {
	int c = hero.getHeroHP();
	c -= monsterAttack;
	hero.setHeroHP(c);
}
	
}
