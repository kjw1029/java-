
public class ManageIDs {
	private ID[] ids;

	public ManageIDs (ID[] ids) {
		this.ids = ids;
	}
	
	public boolean contain(String id, String pass) {
		for(int i = 0; i <ids.length; i++) {
			if (ids[i].matches(id, pass)) {
				return true;
			}
		}
		return false;
	}
}
