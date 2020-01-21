package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S3")
public class ServletThree extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1 = request.getParameter("name");
		String p2 = request.getParameter("surname");
		String p3 [] = request.getParameterValues("color");
		
		   
		    
		    for(String x : p3) {
		    	response.getWriter().append(" " + x);
		    }
		    
		 PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			String gender = request.getParameter("sex");
			pw.println(gender);   
		 
			response.getWriter().append("Welcome " + p1 + " " + p2 + ". The password is  " + request.getParameter("password") 
			+ ". Color is " + p3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
