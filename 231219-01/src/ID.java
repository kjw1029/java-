
public class ID {
	private String id;
	private String password;

	public ID(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public boolean matches(String id, String password) {
		return this.id.equals(id) && this.password.equals(password);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
