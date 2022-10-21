package com.toykream.service.domain;

import java.sql.Date;


public class User {
	
	private int userId;
	private String userEmail;
	private String password;
	private String userName;
	private int sizeId;
	private String phoneNum;
	private String profileImg;
	private String address;
	private int point;
	private Date regDate;
	
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getSizeId() {
		return sizeId;
	}
	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", password=" + password + ", userName="
				+ userName + ", sizeId=" + sizeId + ", phoneNum=" + phoneNum + ", profileImg=" + profileImg
				+ ", address=" + address + ", point=" + point + ", regDate=" + regDate + "]";
	}
	
	
	
}
