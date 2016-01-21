package com.projectcheck;
import javax.jdo.annotations.*;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"issueAdd",
	"issueTime",
	"buttonId",
	"url"})
public class EditType {
	@JsonProperty("issueAdd")
	private String issueAdd;
	@JsonProperty("buttonId")
	private String buttonId;
	@JsonProperty("url")
	private String product;
	
	@JsonProperty("issueTime")
	private String issueTime;
	
	@JsonProperty("issueTime")
	public void setIssueTime(String issueTime){
		this.issueTime=issueTime;
	}
	@JsonProperty("issueTime")
	public String getIssueTime(){
		return this.issueTime;
	}
	
	@JsonProperty("issueAdd")
	public void setIssueAdd(String issueAdd){
		this.issueAdd=issueAdd;
	}
@JsonProperty("issueAdd")
public String getIssueAdd(){
	return this.issueAdd;
}
@JsonProperty("buttonId")
public void setButtonId(String buttonId){
	this.buttonId=buttonId;
}
@JsonProperty("buttonId")
public String getButtonId(){
	return this.buttonId;
}
@JsonProperty("url")
public void setProduct(String product){
	this.product=product;
}
@JsonProperty("url")
public String getProduct(){
	return this.product;
}
}
