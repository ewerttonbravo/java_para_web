package br.com.ewerttoncompany;

import java.util.Date;


/**
 * 
 * @author ewerttonbravo
 * @since 14/10/11
 *
 */
public class UserBean {
	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	private String gender;
	
	private String email;
	
	private String serviceLevel;
	
	public UserBean() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
}
