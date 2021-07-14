package com.ekart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	
	private List<UserAddress> userAddress;
	
	public List<UserAddress> getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(List<UserAddress> userAddress) {
		this.userAddress = userAddress;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
	
}
