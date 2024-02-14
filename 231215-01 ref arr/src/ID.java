
public class ID {
	private String id;
	private String pass;

	public ID(String id, String pass) {
		
		this.id = id;
		this.pass = pass;
	}
	public boolean matches(String id, String pass) {
		return this.id.equals(id) && this.pass.equals(pass);
	}
	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
