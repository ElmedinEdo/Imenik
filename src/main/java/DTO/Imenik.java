package DTO;

public class Imenik {

// data fields
	
	private String name;
	private String lastname;
	private String phoneNum;
	private String email;
	
	
	public Imenik (String name, String lastname, String phoneNum, String email) {
		this.email= email;
		this.name = name;
		this.lastname = lastname;
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}	
}
