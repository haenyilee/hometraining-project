package com.sist.dao;

import java.util.Date;

/*
 * ID         NOT NULL VARCHAR2(300) 
PWD        NOT NULL VARCHAR2(200) 
NAME       NOT NULL VARCHAR2(200) 
EMAIL               VARCHAR2(300) 
GENDER     NOT NULL VARCHAR2(200) 
BIRTHDAY            DATE          
PHONE      NOT NULL VARCHAR2(300) 
ADDRESS    NOT NULL VARCHAR2(500) 
ADMIN      NOT NULL VARCHAR2(200) 
HIT                 NUMBER        
HOME_LEVEL          VARCHAR2(300) 
 */
public class Home_userVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String gender;
	private Date birthday;
	private String phone;
	private String address;
	private String admin;
	private int hit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getHome_level() {
		return home_level;
	}
	public void setHome_level(String home_level) {
		this.home_level = home_level;
	}
	private String home_level;
	

}
