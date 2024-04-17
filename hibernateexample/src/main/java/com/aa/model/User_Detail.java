package com.aa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="usertable")
public class User_Detail {       //Pull request................                               
	@Id
	private int userId;
	private String userName;

	//@Version
	//private int version;
	
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
//.....................................................product
	public String getProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}
	