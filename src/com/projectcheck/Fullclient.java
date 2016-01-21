package com.projectcheck;
import java.util.ArrayList;

import javax.jdo.annotations.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@PersistenceCapable
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "starttime",
    "endtime",
    "date",
    "problemdetails",
    "buttonValue",
    "sendMail"
})
public class Fullclient {
	@Persistent
    @JsonProperty("starttime") 
    private String starttime;
    @Persistent
    @JsonProperty("endtime")
    private String endtime;
    @Persistent
    @JsonProperty("date")
    private String date;
    @Persistent
    @JsonProperty("problemdetails")
    private String problemdetails;
    @PrimaryKey
    @Persistent
    @JsonProperty("buttonValue")
    private String buttonValue;
    @Persistent
    private ArrayList<String> issueUpdated=new ArrayList<String>();
    @Persistent
    private ArrayList<String> issueUpdateTime=new ArrayList<String>();
    @JsonProperty("sendMail")
    private String sendMail;
    
    public void setIssueUpdatedTime(ArrayList<String> issueUpdateTime){
    	this.issueUpdateTime=issueUpdateTime;
    }
    public ArrayList<String> getIssueUpdateTime(){
    	return this.issueUpdateTime;
    }
    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }
    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    @JsonProperty("endtime")
    public String getEndtime() {
        return endtime;
    }
    @JsonProperty("endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("problemdetails")
    public String getProblemdetails() {
        return problemdetails;
    }
    @JsonProperty("problemdetails")
    public void setProblemdetails(String problemdetails) {
        this.problemdetails = problemdetails;
    }
    @JsonProperty("buttonValue")
    public String getButtonValue() {
        return buttonValue;
    }
    @JsonProperty("buttonValue")
    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;
    }
    public ArrayList<String> getIssueUpdated(){
    	return this.issueUpdated;
    }
    public void setIssueUpdated(ArrayList<String> issueUpdated){
    	this.issueUpdated=issueUpdated;
    }
    
    @JsonProperty("sendMail")
    public void setSendMail(String sendMail){
    	this.sendMail=sendMail;
    }
    @JsonProperty("sendMail")
    public String getSendMail(){
    	return this.sendMail;
    }
}
@PersistenceCapable
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "starttime",
    "endtime",
    "date",
    "problemdetails",
    "buttonValue",
    "sendMail"
})
class DistributedSource {
	@Persistent
    @JsonProperty("starttime")
    private String starttime;
    @Persistent
    @JsonProperty("endtime")
    private String endtime;
    @Persistent
    @JsonProperty("date")
    private String date;
    @Persistent
    @JsonProperty("problemdetails")
    private String problemdetails;
    @PrimaryKey
    @Persistent
    @JsonProperty("buttonValue")
    private String buttonValue;
    @Persistent
    private ArrayList<String> issueUpdated=new ArrayList<String>();
    @JsonProperty("sendMail")
    private String sendMail;
    @Persistent
	private ArrayList<String> issueUpdateTime=new ArrayList<String>();
    public void setIssueUpdatedTime(ArrayList<String> issueUpdateTime){
    	this.issueUpdateTime=issueUpdateTime;
    }
    public ArrayList<String> getIssueUpdateTime(){
    	return this.issueUpdateTime;
    }
    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }
    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    @JsonProperty("endtime")
    public String getEndtime() {
        return endtime;
    }
    @JsonProperty("endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("problemdetails")
    public String getProblemdetails() {
        return problemdetails;
    }
    @JsonProperty("problemdetails")
    public void setProblemdetails(String problemdetails) {
        this.problemdetails = problemdetails;
    }
    @JsonProperty("buttonValue")
    public String getButtonValue() {
        return buttonValue;
    }
    @JsonProperty("buttonValue")
    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;     
    }
    public ArrayList<String> getIssueUpdated(){
    	return this.issueUpdated;
    }
    public void setIssueUpdated(ArrayList<String> issueUpdated){
    	this.issueUpdated=issueUpdated;
    }
    @JsonProperty("sendMail")
    public void setSendMail(String sendMail){
    	this.sendMail=sendMail;
    }
    @JsonProperty("sendMail")
    public String getSendMail(){
    	return this.sendMail;
    }
}
@PersistenceCapable
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "starttime",
    "endtime",
    "date",
    "problemdetails",
    "buttonValue"
})
class AnswerConnect {
	@Persistent
    @JsonProperty("starttime")
    private String starttime;
    @Persistent
    @JsonProperty("endtime")
    private String endtime;
    @Persistent
    @JsonProperty("date")
    private String date;
    @Persistent
    @JsonProperty("problemdetails")
    private String problemdetails;
    @PrimaryKey
    @Persistent
    @JsonProperty("buttonValue")
    private String buttonValue;
    @Persistent
    private ArrayList<String> issueUpdated=new ArrayList<String>();
    @JsonProperty("sendMail")
    private String sendMail;
    @Persistent
	private ArrayList<String> issueUpdateTime=new ArrayList<String>();
    public void setIssueUpdatedTime(ArrayList<String> issueUpdateTime){
    	this.issueUpdateTime=issueUpdateTime;
    }
    public ArrayList<String> getIssueUpdateTime(){
    	return this.issueUpdateTime;
    }
    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }
    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    @JsonProperty("endtime")
    public String getEndtime() {
        return endtime;
    }
    @JsonProperty("endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("problemdetails")
    public String getProblemdetails() {
        return problemdetails;
    }
    @JsonProperty("problemdetails")
    public void setProblemdetails(String problemdetails) {
        this.problemdetails = problemdetails;
    }
    @JsonProperty("buttonValue")
    public String getButtonValue() {
        return buttonValue;
    }
    @JsonProperty("buttonValue")
    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;
    }
    public ArrayList<String> getIssueUpdated(){
    	return this.issueUpdated;
    }
    public void setIssueUpdated(ArrayList<String> issueUpdated){
    	this.issueUpdated=issueUpdated;
    }
    @JsonProperty("sendMail")
    public void setSendMail(String sendMail){
    	this.sendMail=sendMail;
    }
    @JsonProperty("sendMail")
    public String getSendMail(){
    	return this.sendMail;
    }
    
}

@PersistenceCapable
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "starttime",
    "endtime",
    "date",
    "problemdetails",
    "buttonValue"
})
class SwitchBoard {
	@Persistent
    @JsonProperty("starttime")
    private String starttime;
    @Persistent
    @JsonProperty("endtime")
    private String endtime;
    @Persistent
    @JsonProperty("date")
    private String date;
    @Persistent
    @JsonProperty("problemdetails")
    private String problemdetails;
    @PrimaryKey
    @Persistent
    @JsonProperty("buttonValue")
    private String buttonValue;
    @Persistent
    private ArrayList<String> issueUpdated=new ArrayList<String>();
    @JsonProperty("sendMail")
    private String sendMail;
    @Persistent
	private ArrayList<String> issueUpdateTime=new ArrayList<String>();
    public void setIssueUpdatedTime(ArrayList<String> issueUpdateTime){
    	this.issueUpdateTime=issueUpdateTime;
    }
    public ArrayList<String> getIssueUpdateTime(){
    	return this.issueUpdateTime;
    }
    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }
    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    @JsonProperty("endtime")
    public String getEndtime() {
        return endtime;
    }
    @JsonProperty("endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
    @JsonProperty("problemdetails")
    public String getProblemdetails() {
        return problemdetails;
    }
    @JsonProperty("problemdetails")
    public void setProblemdetails(String problemdetails) {
        this.problemdetails = problemdetails;
    }
    @JsonProperty("buttonValue")
    public String getButtonValue() {
        return buttonValue;
    }
    @JsonProperty("buttonValue")
    public void setButtonValue(String buttonValue) {
        this.buttonValue = buttonValue;
    }
    public ArrayList<String> getIssueUpdated(){
    	return this.issueUpdated;
    }
    public void setIssueUpdated(ArrayList<String> issueUpdated){
    	this.issueUpdated=issueUpdated;
    }
    @JsonProperty("sendMail")
    public void setSendMail(String sendMail){
    	this.sendMail=sendMail;
    }
    @JsonProperty("sendMail")
    public String getSendMail(){
    	return this.sendMail;
    }
}
