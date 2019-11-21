package com.jpademo.dto;

import java.sql.Timestamp;
import java.util.Date;

public class UserDTO {
	public UserDTO() {
	}

	private Integer id;
	private Timestamp currentLoginTs;
	private Date dateadded;
	private String email;
	private String firstName;
	private String jsonroles;
	private Timestamp lastLoginTs;
	private String lastname;
	private String phNumber;
	private String countryCode;
	private String preferredname;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getCurrentLoginTs() {
		return currentLoginTs;
	}
	public void setCurrentLoginTs(Timestamp currentLoginTs) {
		this.currentLoginTs = currentLoginTs;
	}
	public Date getDateadded() {
		return dateadded;
	}
	public void setDateadded(Date dateadded) {
		this.dateadded = dateadded;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getJsonroles() {
		return jsonroles;
	}
	public void setJsonroles(String jsonroles) {
		this.jsonroles = jsonroles;
	}
	public Timestamp getLastLoginTs() {
		return lastLoginTs;
	}
	public void setLastLoginTs(Timestamp lastLoginTs) {
		this.lastLoginTs = lastLoginTs;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPreferredname() {
		return preferredname;
	}
	public void setPreferredname(String preferredname) {
		this.preferredname = preferredname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
