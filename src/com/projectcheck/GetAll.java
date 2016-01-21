package com.projectcheck;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import javax.jdo.Query;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter; 

@SuppressWarnings("serial")
public class GetAll extends HttpServlet { 
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		System.out.println("function coming inside get all method");
        PersistenceManager pmf=PMF.get().getPersistenceManager();
        ObjectWriter objectwriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json1="";
        String json2="";
        String json3="";
        String json4="";
        try{
        	System.out.println("coming inside try1");
        	Query query=pmf.newQuery(Fullclient.class);
        	List<Fullclient> fullclient=(List<Fullclient>) query.execute();
        	 json1=objectwriter.writeValueAsString(fullclient);
        	 System.out.println(json1); 
        }
        catch(JDOObjectNotFoundException e){
         json1="";
        }
        try{
        	System.out.println("coming inside try 2");
        	Query query=pmf.newQuery(DistributedSource.class);
        	List<DistributedSource> distributedsource=(List<DistributedSource>) query.execute();
        	 json3=objectwriter.writeValueAsString(distributedsource);
        	 System.out.println(json3);
        }
        catch(JDOObjectNotFoundException e){
         json3="";
        }
        try{
        	System.out.println("coming inside try 3");
        	Query query=pmf.newQuery(SwitchBoard.class);
        	List<SwitchBoard> switchboard=(List<SwitchBoard>) query.execute();
         json2=objectwriter.writeValueAsString(switchboard);
         System.out.println(json2);
        }
        catch(JDOObjectNotFoundException e){
        	 json2="";
        }
        try{
        	System.out.println("coming inside try 4");
        	Query query=pmf.newQuery(AnswerConnect.class);
        	List<AnswerConnect> answerconnect=(List<AnswerConnect>) query.execute();
        	 json4=objectwriter.writeValueAsString(answerconnect);
        	 System.out.println(json4);
        }
        catch(JDOObjectNotFoundException e){
        	 json4="";
        }
        finally{
        	String json="["+json1+","+json2+","+json3+","+json4+"]";
        	resp.getWriter().print(json);
        	pmf.close();
        	System.out.println("getall functionc closes here");
        }
	}
	} 