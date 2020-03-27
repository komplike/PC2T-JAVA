
public class employee {
	private char[] nickname,email,password;
	public enum employeeType{ACTIVE,INACTIVE,DELETED}
	private employeeType type = employeeType.ACTIVE;
	
	public char[] getNickname() {
		if (nickname.length!=0)
			return nickname;
		return "nickname".toCharArray();
	}
	public void setNickname(char[] nickname) {
		this.nickname = nickname;
	}
	public char[] getEmail() {
		if (email.length!=0)
			return email;
		return "email".toCharArray();
	}
	public void setEmail(char[] email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	};
	public String getType() {
		return this.type.toString();
	};
	public void setType(employeeType type) {
		this.type = type;
	};
}
