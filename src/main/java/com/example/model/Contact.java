package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="CONTACTINFO")
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer contactId;
	
	
	private String contactName;
	
	private String contactEmail;
	
	private Long contactNumber;
	
	
/*
	public Integer getContact_id() {
		return contact_id;
	}



	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}



	public String getContactName() {
		return contactName;
	}



	public void setContactName(String contactName) {
		this.contactName = contactName;
	}



	public String getContactEmail() {
		return contactEmail;
	}



	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}



	public long getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}



	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	*/

}
