package org.ys.commons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Product {
	@Id @GeneratedValue
	private long id;
	
	private String name;
	private String description;
	private byte[] picture;
	private double price;
	@ManyToOne
	private Category category;

	public Product() {
		
	}
	
	public Product(String name, double price, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		
		category.internalAddProduct(this);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
