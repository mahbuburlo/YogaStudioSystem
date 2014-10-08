package org.ys.commons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Waiver {
	@Id @GeneratedValue
	private long id;
	
	private Course course;
	private Customer customer;
	private boolean status=false;
	
	public Waiver() {
		// TODO Auto-generated constructor stub
	}
	
	public Waiver( Course course, Customer customer) {
		super();
		Faculty  advisor = customer.getAdvisor();
		advisor.addWaiverRequest(this);
		this.course = course;
		this.customer = customer;
		
	}


	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}
	
	

}
