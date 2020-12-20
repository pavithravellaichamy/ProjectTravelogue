package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "register")
public class UserRegistration 
{
	@Id
	@Column
	@NotEmpty
	private String username;
	@Column
	@NotEmpty
	private String name;
	@Column
	@NotEmpty
	@Size(min=8, message="Your password is not strong !")
	private String password;
	@Column
	private String reenter_password;
	@Column
	@Email(message="Enter valid MailId")
	private String emailid;
	@Column
	private String dob;
	@Column
	@Min(value=10, message="Your age is too small")
	private int age;
	@Column
	private String city;
	@Column
	private String interest;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getReenter_password() {
		return reenter_password;
	}
	public void setReenter_password(String reenter_password) {
		this.reenter_password = reenter_password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
}
