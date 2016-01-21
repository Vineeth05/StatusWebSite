package com.projectcheck;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;
import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.Query;
import com.google.appengine.api.datastore.Cursor;
import  com.google.appengine.api.datastore.Cursor;
import javax.jdo.PersistenceManager;
@SuppressWarnings("serial")
public class GetAnswerConnect extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		   String button=req.getParameter("id");
		System.out.println("Funtion Comes inside fetch servlet of AnswerConnect");
		resp.setContentType("text/json");
		PrintWriter out=resp.getWriter();
		PersistenceManager pmf=PMF.get().getPersistenceManager();
		/*Query q = pmf.newQuery(Fullclient.class);
		q.setFilter("ID==clickedId");
		q.declareParameters("String clickedId");*/
    System.out.println("data value is setted");
    try{
    	AnswerConnect results =(AnswerConnect)pmf.getObjectById(AnswerConnect.class,button);
		System.out.println(results);
		 System.out.println("query successfull");
		  ObjectWriter objectwriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
		  String json = objectwriter.writeValueAsString(results);
    System.out.println(json);
      out.print(json);
    }
  catch(JDOObjectNotFoundException e){
			
		}
    finally{
           pmf.close();
		  out.flush();
		  System.out.println("AnswerConnect function closes here");
    }	
	}
}
