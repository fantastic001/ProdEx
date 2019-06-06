package com.stefan.prodex.data;

import java.util.Date;

public class Admin extends User {

	public Admin(String userName, String password, String firstName, String lastName, UserType type,
			Date registrationDate, String phone, City city, String email) {
		super(userName, password, firstName, lastName, type, registrationDate, phone, city, email);
		// TODO Auto-generated constructor stub
	}

}
