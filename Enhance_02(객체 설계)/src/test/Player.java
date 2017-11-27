package test;

public class Player {
	String id;
	int level;
	int attack;
	int hp;
	String info() {
	return "{\"id\":\"" + id + "\",\"level\":" + level +
			",\"attack\":" + attack +",\"hp\":"+hp+ "}";	
	}
	Player(String id){
		level=1;
		attack=5;
		hp=20;
		this.id=id;
	}
	void setLev(int lev) {
		if(level>lev)
			return;
		int def=lev-this.level;
		level=lev;
		attack=attack+(3*def);
		hp=hp+(10*hp);
	}
	void levUp() {
		level++;
		attack+=3;
		hp+=10;
	}
	String getId() {
		return id;
	}
	int getLev() {
		return level;
	}
	int getAtk() {
		return attack;
	}
	int getHp() {
		return hp;
	}
	void info1() {
		System.out.println(id+"님의 캐릭정보");
		System.out.println("레벨 :"+level);
		System.out.println("공격력 : "+attack);
		System.out.println("체력 : "+hp);
		
	}
	void levelUp(int level){
		this.level+=level;
		attack+=level*3;
		hp+=level*10;
	}
}
