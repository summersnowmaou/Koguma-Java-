package homework;

// 用户信息类
public class UserInfo {
	private String username;
	private String password;
	private String motto;

	public UserInfo() {
	}

	public UserInfo(String username, String password, String motto) {
		super();
		this.username = username;
		this.password = password;
		this.motto = motto;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

}
