
import java.util.Scanner;


class User {
	private String username;
	private String password;
	private boolean isAdmin;

	public User(String username, String password, boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getUsername() {
		return username;
	}

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	public boolean isAdmin() {
		return isAdmin;
	}



}

class LoginManager {
	private User[] users;
	private int userCount;

	public LoginManager(int capacity) {
		users = new User[capacity];
		userCount = 0;
		// 기본 사용자 추가
		users[userCount++] = new User("매니저", "매니저1234", true);
		users[userCount++] = new User("데스크", "데스크1234", false);
		users[userCount++] = new User("청소", "청소1234", false);
	}

	public User login(String username, String password) {
		for (int i = 0; i < userCount; i++) {
			if (users[i].getUsername().equals(username) && users[i].checkPassword(password)) {
				return users[i];
			}
		}
		return null; // 사용자가 없거나 비밀번호가 일치하지 않는 경우
	}


}
