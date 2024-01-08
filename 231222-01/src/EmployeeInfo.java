public class EmployeeInfo {
	private String goToWorkTime;
	private String leaveWorkTime;
	private String ID;
	private String password;
	public EmployeeInfo(String goToWorkTime, String leaveWorkTime, String iD, String password) {
		super();
		this.goToWorkTime = goToWorkTime;
		this.leaveWorkTime = leaveWorkTime;
		ID = iD;
		this.password = password;
	}
	public String getGoToWorkTime() {
		return goToWorkTime;
	}
	public String getLeaveWorkTime() {
		return leaveWorkTime;
	}
	public String getID() {
		return ID;
	}
	public String getPassword() {
		return password;
	}
	public void setGoToWorkTime(String goToWorkTime) {
		this.goToWorkTime = goToWorkTime;
	}
	public void setLeaveWorkTime(String leaveWorkTime) {
		this.leaveWorkTime = leaveWorkTime;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
