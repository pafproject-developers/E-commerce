package com.example.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="mytable")
public class User {
	
	@Id
    private int id;
	private String name;
	private String firstname;
	private String lastname;
	private int age;
	private String password;
	
	
	public User() {
		
	}
	
	public User(String name, String firstname, String lastname, int age, String password) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstname=" + firstname + ", lastname=" + lastname + ", age="
				+ age + ", password=" + password + "]";
	}
	
	
	 
}
