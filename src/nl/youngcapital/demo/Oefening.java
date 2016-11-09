package nl.youngcapital.demo;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;


/**
 * Servlet implementation class Oefening
 */
@WebServlet("/url/*")
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
		
		
		
		response.getWriter().append(
				"<!DOCTYPE html><html><head>"
				+ "<title>Test servlet</title>"
				+ "<head><body><h1>Dit is de testservlet!</h1><br>"
				+ "De tijd is: " + myTimeString + "<br>"
				+ "De pagina is " + ++counter + " keer bezocht.<br>"
				+ "<ul>");
				
		Enumeration<String> headerNames = request.getHeaderNames();
		
		while (headerNames.hasMoreElements()){
		
			String header = headerNames.nextElement();
			
			response.getWriter().append("<li>" + header + "</li>");
			
		}
		
		response.getWriter().append("</body></html>");
		
	
		
		
	}

}
