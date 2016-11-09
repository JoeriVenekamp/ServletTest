package nl.youngcapital.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 * Servlet implementation class Oefening
 */
@WebServlet("/")
public class Oefening extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int counter = 0;
	
	LocalDateTime myTime = LocalDateTime.now();
	
	String myTimeString = myTime.format(DateTimeFormatter.ISO_DATE_TIME);
	DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm");
	
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(
		"<!DOCTYPE html><html><head>"
		+ "<title>Test servlet</title>"
		+ "<head><body><h1>Dit is de testservlet!</h1><br>"
		+ "De tijd is: " + myTimeString + "<br>"
		+ "De pagina is " + ++counter + " keer bezocht."
		+ "</body></html>");
		
	}

}
