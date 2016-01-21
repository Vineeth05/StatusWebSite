package com.projectcheck;
import java.io.IOException;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
@SuppressWarnings("serial")
public class LoginExampleServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	 System.out.println("coming inside login servlet");
	 PersistenceManager pmf=PMF.get().getPersistenceManager();
	 try{
			System.out.println("trying to get object by id");
			Users users=(Users)pmf.getObjectById(Users.class,"vineeth.p870@gmail.com");
		}
		catch(JDOObjectNotFoundException e){	
			System.out.println("no user found so creating new user");
			Users users=new Users();
			users.setAdminEmail("vineeth.p870@gmail.com");
			users.setAdminId(54321);
			pmf.makePersistent(users);
		}
	  finally{
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		
		resp.setContentType("text/html");	
		
		Users users=pmf.getObjectById(Users.class,"vineeth.p870@gmail.com");
			if (user != null) {
				System.out.println(user.getUserId());
				System.out.println(user.getAuthDomain());
				
				resp.sendRedirect("admin.jsp");
			} else {
				resp.getWriter().println(
						"<html><head><link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'><link rel='stylesheet' type='text/css' href='login.css'></head>"
						+ "<div id='content' class='well'> <div class='logindesign well'><h3 class='log text-primary text-center'>WELCOME!</h3></div><div class='logindesign'><a href='"
							+ userService.createLoginURL(req.getRequestURI())
							+ "'><span class='btn btn-primary btn-block' style='background-color:green !important;'>LogIn</span> </a></div></div><html>");
	 }
	  }
	}
}
