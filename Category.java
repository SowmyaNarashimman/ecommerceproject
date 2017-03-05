package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category {
	
	@Id
	private String categoryid;
	
	@Column
	private String categoryname;
	
	@Column
	private String categorydescription;
	
	
	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategorydescription() {
		return categorydescription;
	}

	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}

	

}
