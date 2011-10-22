package br.com.ewerttoncompany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


/**
 * 
 * @author ewerttonbravo
 * @since 14/10/11
 *
 */
@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = -4389015326512187575L;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	private String email;
	private String serviceLevel;
	
	private List<UserBean> users = new ArrayList<UserBean>();

	public UserBean() {
	}
	
	public void validateEmail(FacesContext context, UIComponent toValidate, Object value) 
		throws ValidatorException {
		String email = (String) value;
		if (email.indexOf("@") == -1) {
			FacesMessage message = new FacesMessage("Email invalido!!!");
			throw new ValidatorException(message);
		}
	}
	
	public String addConfirmedUser() {
		String outcome = null;
		FacesMessage doneMessage = null;
		
		if (firstName.contains("e")) {
			doneMessage = new FacesMessage("Seja bem-vindo, sr(a) " + firstName);
			users.add(this);
			outcome = "done";
		} else {
			doneMessage = new FacesMessage(
					"Seu primeiro nome deveria ter a letra \"e\"");
			outcome = "register";
		}
		FacesContext fCtx = FacesContext.getCurrentInstance();
		fCtx.addMessage(null, doneMessage);
		return outcome;	
	}

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
	
	public List<UserBean> getUsers() {
		return users;
	}
	
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
}
