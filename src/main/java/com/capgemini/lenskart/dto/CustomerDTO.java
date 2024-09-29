package com.capgemini.lenskart.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.capgemini.lenskart.entity.User;



public class CustomerDTO {

	private int cid;
	@NotBlank(message="The name should not be blank")
	@Size(min=3,max=100)
	private String name;
	@NotBlank(message="The email could not be blank or null or empty")
	@Email(message="Please enter the valid email id",regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9.]{2,5}")
	private String email;
	@NotNull(message="The contact number should be not null")
	private Long contactNumber;
	//private int userId;
	private String address;
	//@NotNull(message="The password should not be blank")
	//@Size(min=3,max=15)
	//private String password;
	//private String userName;
     private User user;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
   
	
}
