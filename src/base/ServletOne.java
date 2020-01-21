package base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class ServletOne extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int[] arrayNum = {1,2,3,4,5};

		PrintWriter out = response.getWriter();
		for (int i = 0; i < arrayNum.length; i++) {
			out.println(arrayNum[i]);
			switch(i) {
			case 0:
				out.println("");
			}
		}

		response.getWriter().println("<h1>Ciao da Milano, Babbz here let'see!!!!!!</h1>");
		response.getWriter().println("<h2>List of Names: </h2>");
		response.getWriter().println("<ul><li>Babbz</li>");
		response.getWriter().println("<li>Rehal</li>");
		response.getWriter().println("<li>Pablo</li>");
		response.getWriter().println("<li>Mauro</li></ul>");
		out.println("<body style='background-color:aqua;'>");

	}

}

/*<form action="login">
Male:<input type="radio" name="sex" value="Male"> <br>
Female:<input type="radio" name="sex" value="Female"> <br>
<input type="submit" value="Enter">
</form>
PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String gender = request.getParameter("sex");
		pw.println(gender);
*/