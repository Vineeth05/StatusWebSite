package com.projectcheck;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

import javax.jdo.PersistenceManager;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class FullClientSet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm=PMF.get().getPersistenceManager();
		ObjectMapper objectMapper = new ObjectMapper();
     String json=req.getParameter("message");
		System.out.print("function comes");
		System.out.print(json);
		Fullclient str = objectMapper.readValue(json, Fullclient.class);
		System.out.println("value setted");
            System.out.println(str.getButtonValue());
            System.out.println(str.getProblemdetails());
            String sendMail=str.getSendMail();
            System.out.println("THE VALUE OF SENDMAIL IS"+sendMail); 
            String sendid="no-reply@current21-1197@appsoptmail.com";
            String receive="vineeth.purushoth@a-cti.com";
            Properties props = new Properties();
            Session session = Session.getDefaultInstance(props, null);
            String msgBody="a report have been issued";
            if(sendMail.equals("Send")){
            	try {
                	System.out.println("coming inside try sending mail block");
                    Message msg = new MimeMessage(session);
                    msg.setFrom(new InternetAddress("no-reply@current21-1197.appspotmail.com","admin vineeth"));
                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress("vineeth.purushoth@a-cti.com", "vineeth"));
                    System.out.println("setted the sender and receiver id's");
                    msg.setSubject("Feedback");
                    msg.setText(msgBody);
                    System.out.println("about to send mail id");
                    Transport.send(msg);
                    System.out.println("mail is sent successfully"); 
                } catch (Exception e){
                	System.out.println("coming inside catch block of sending mail id ");
                    
                }
            }
	
		try{
			System.out.println("coming here");
			pm.makePersistent(str);
		}
		finally{
			System.out.println("made persistent");
			resp.setContentType("application/json");
			pm.close();
		}
	}
}
