
public class DollFactory {
	public Doll createDoll(int option) {
		if (option == 1) {
			return new Doll("허기워기", 20000);
		} else if (option == 2){
			return new Doll("처키", 15000);
		} else if (option == 3) {
			return new Doll("애나벨", 25000);
		}
		return null;
	}
}
