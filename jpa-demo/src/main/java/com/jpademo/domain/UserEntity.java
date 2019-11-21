package com.jpademo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name = "USERS")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@SequenceGenerator(name = "USERS_ID_GENERATOR", sequenceName = "USER_ID_SEQ", allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_ID_GENERATOR")
	private String testCase;
	private String ctlgId;
	private String operNM;
	public String getTestCase() {
		return testCase;
	}
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}
	public String getCtlgId() {
		return ctlgId;
	}
	public void setCtlgId(String ctlgId) {
		this.ctlgId = ctlgId;
	}
	public String getOperNM() {
		return operNM;
	}
	public void setOperNM(String operNM) {
		this.operNM = operNM;
	}
	
	

	
	

	}