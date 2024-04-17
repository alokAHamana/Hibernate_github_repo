package com.aa.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userProduct")
public class Product {
	@Id
	private int productId;
	private String proName;
	private double price;

	public void setProductId(int productId)
	{
	    this.productId = productId;
	}
	public int getProductId()
	{
	    return productId;
	}

	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}

	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
	
	//......................
	
	public void productId(int i) {
		// TODO Auto-generated method stub
		
	}
	public void proName(String string) {
		// TODO Auto-generated method stub
		
	}

}
