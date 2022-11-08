package gate.net;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accno=request.getParameter("accno");
		String accname=request.getParameter("accname");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("accno", accno);
		hs.setAttribute("accname", accname);
		
		PrintWriter out=response.getWriter();
		out.print("<html><head></head>");
		out.print("<body>");
		out.print("<form method='post' action='"+response.encodeUrl("./second")+"'>");
		out.print("Account Type<input type='text' name='acctype'>");
		out.print("Account Branch<input type='text' name='accbranch'>");
		out.print("<input type='submit' value='next'>");
		
		
		
		out.print("</form>");
		out.print("</body></html>");
	}

}
