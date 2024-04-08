package com.aa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transaction;

@Entity
@Table(name="user_table")
public class User_Detail {          // featuressssssssssssssssss

	@Id
	private int userId;

	private String userName;

	public User_Detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Detail(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Transaction beginTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}
	