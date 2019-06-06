package com.stefan.prodex.data;

import java.util.Date;

public class User {
	public enum UserType 
	{
		ADMIN,
		SELLER,
		BUYER
	};
	
	
	private String userName; 
	private String password; 
	private String firstName;
	private String lastName;
	private UserType type; 
	private Date registrationDate;
	private String phone; 
	private City city;
	private String email;
	public User(String userName, String password, String firstName, String lastName, UserType type,
			Date registrationDate, String phone, City city, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.registrationDate = registrationDate;
		this.phone = phone;
		this.city = city;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public UserType getType() {
		return type;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public String getPhone() {
		return phone;
	}
	public City getCity() {
		return city;
	}
	public String getEmail() {
		return email;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
