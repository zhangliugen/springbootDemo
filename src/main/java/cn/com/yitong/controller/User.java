package cn.com.yitong.controller;

public class User {
	public String name;
	public String age;
	public String birthdate;
	public String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "UserController [name=" + name + ", age=" + age + ", birthdate=" + birthdate + ", desc=" + desc + "]";
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public User(String name, String age, String birthdate, String desc) {
		super();
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.desc = desc;
	}
	public User() {
		super();
	}
}
