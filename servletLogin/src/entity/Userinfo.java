package entity;

import java.util.Date;

public class Userinfo {
	private int id;
	private String username;
	private String password;
	private int age;
	private Date insertdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}
	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", insertdate=" + insertdate + "]";
	}
	
}
