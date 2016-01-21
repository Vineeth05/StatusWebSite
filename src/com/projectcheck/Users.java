package com.projectcheck;
import javax.jdo.annotations.*;
import javax.annotation.Generated;
@PersistenceCapable
public class Users {
@Persistent
private long adminId;
@PrimaryKey
@Persistent
private String adminEmail;
public void setAdminId(long adminId){
	this.adminId=adminId;	
}
public long getAdminId(){
	return this.adminId;
}
public void setAdminEmail(String adminEmail){
	this.adminEmail=adminEmail;
}
public String getAdminEmail(){
	return this.adminEmail;
}
}