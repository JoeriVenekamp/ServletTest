package nl.youngcapital.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstDynamicWebProject
 */
@WebServlet("/FirstDynamicWebProject")
public class FirstDynamicWebProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int counter = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter()
		
		.append("<!DOCTYPE html><html><head>" +
			"<title>mijn eerste servlet</title>" +
			"<head><body><h1>Moi eem!</h1><br>" +
			"Counter: " + ++counter + "</body></html>");
			
	}


}
