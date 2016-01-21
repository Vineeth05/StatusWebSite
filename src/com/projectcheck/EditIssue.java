package com.projectcheck;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class EditIssue extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pmf=PMF.get().getPersistenceManager();
		ObjectMapper objectmapper=new ObjectMapper();
		ObjectWriter objectwriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
		resp.setContentType("application/json");
		System.out.println("coming inside edit issuse method");
		String getJson=req.getParameter("message");
		System.out.println(getJson);		
		EditType edittype=objectmapper.readValue(getJson, EditType.class);
		String product=edittype.getProduct();
		String buttonId=edittype.getButtonId();
		String issueAdd=edittype.getIssueAdd();
		String issueTime=edittype.getIssueTime();
	    // fullclient set
		if(product.equals("fullclient")){
			try{
				System.out.println("coming inside try block trying to get object by id");
			Fullclient fullclientUpdate=pmf.getObjectById(Fullclient.class,buttonId);
			System.out.println("gotted fullclinet object is"+fullclientUpdate);
			fullclientUpdate.getIssueUpdated().add(issueAdd);
			fullclientUpdate.getIssueUpdateTime().add(issueTime);
			String json=objectwriter.writeValueAsString(fullclientUpdate);
			System.out.println(json);
			resp.getWriter().print(json);
			}
			catch(JDOObjectNotFoundException e){
			}
			finally{
				pmf.close();
			}
		} 
		// answerconnect set
		else if(product.equals("answerconnect")){
			try{
				System.out.println("coming inside try block trying to get object by id");
			AnswerConnect answerconnectUpdate=pmf.getObjectById(AnswerConnect.class,buttonId);
		
			answerconnectUpdate.getIssueUpdated().add(issueAdd);
			answerconnectUpdate.getIssueUpdateTime().add(issueTime);
			String json=objectwriter.writeValueAsString(answerconnectUpdate);
			System.out.println(json);
			resp.getWriter().print(json);
			}
			catch(JDOObjectNotFoundException e){
			}
			finally{
				pmf.close();
			}
		}
		//distributedsource set
		else if(product.equals("distributedsource")){
			try{
				System.out.println("coming inside try block trying to get object by id");
			DistributedSource distributedsourceUpdate=pmf.getObjectById(DistributedSource.class,buttonId);
			System.out.println("gotted fullclinet object is"+distributedsourceUpdate);
			distributedsourceUpdate.getIssueUpdated().add(issueAdd);
			distributedsourceUpdate.getIssueUpdateTime().add(issueTime);
			String json=objectwriter.writeValueAsString(distributedsourceUpdate);
			System.out.println(json);
			resp.getWriter().print(json);
			}
			catch(JDOObjectNotFoundException e){
			}
			finally{
				pmf.close();
			}
		}
		
		else if(product.equals("switchboard")){
			try{
				System.out.println("coming inside try block trying to get object by id");
			SwitchBoard switchboardUpdate=pmf.getObjectById(SwitchBoard.class,buttonId);
			System.out.println("gotted fullclinet object is"+switchboardUpdate);
			switchboardUpdate.getIssueUpdated().add(issueAdd);
			switchboardUpdate.getIssueUpdateTime().add(issueTime);
			String json=objectwriter.writeValueAsString(switchboardUpdate);
			System.out.println(json);
			resp.getWriter().print(json);
			}
			catch(JDOObjectNotFoundException e){
			}
			finally{
				pmf.close();
			}
		}
	} 
}
