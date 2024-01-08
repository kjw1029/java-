// p275
// 라운드제 스포츠 경기

// 시간제 스포츠 경기

// 스포츠 경기
class EPL extends Sports {
	private final String title = "English Premere League";
	
	public EPL() {
		super("축구", 11);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name + " : " + title;
	}

	@Override
	public int getPlayers() {
		// TODO Auto-generated method stub
		return players;
	}
	
}
public abstract class Sports {
	public String name;
	public int players;
	
	
	public Sports(String name, int players) {
		super();
		this.name = name;
		this.players = players;
	}
	
	public abstract String getName();
	
	public abstract int getPlayers();
}
