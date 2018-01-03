package register_login;

public class Register {
	private String name;
	private String password;
	private String motto;
	public Register() {
	}
	
	public Register(String name, String password, String motto) {	
		this.name = name;
		this.password = password;
		this.motto = motto;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.password.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		if(obj==this) {
			return true;
		}
		Register re = (Register)obj;
		if(!(this.name==null)&&!(this.password==null) && this.name.equals(re.name) &&this.password.equals(re.password)) {
			return true;
		}
			return false;
	}

	@Override
	public String toString() {
		return "name+»¶Ó­Äã£¡ÄãµÄ¸ñÑÔÊÇ£º+motto]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
