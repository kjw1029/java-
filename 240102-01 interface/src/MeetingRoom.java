import java.util.Arrays;

public class MeetingRoom {
	private Speakable[] members;

	public MeetingRoom(Speakable[] members) {
		super();
		this.members = members;
	}
	
	public void printIntroduceAll() {
		for (Speakable s : members) {
			s.printHello();
			
		}
	}
	
	public boolean isInclude(Speakable s) {
		for(Speakable elem : members) {
			if(elem.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public Speakable[] getMembers() {
		return members;
	}

	public void setMembers(Speakable[] members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "MeetingRoom [members=" + Arrays.toString(members) + "]";
	}

}
