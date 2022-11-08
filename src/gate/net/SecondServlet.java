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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acctype=request.getParameter("acctype");
		String accbranch=request.getParameter("accbranch");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("acctype", acctype);
		hs.setAttribute("accbranch", accbranch);
		
		PrintWriter out=response.getWriter();
		out.print("<html><head></head>");
		out.print("<body>");
		out.print("<form method='post' action='"+response.encodeUrl("./deposit")+"'>");
		out.print("Ammount<input type='text' name='ammount'>");
		out.print("Name<input type='text' name='name'>");
		out.print("<input type='submit' value='Deposit'>");
		
		
		
		out.print("</form>");
		out.print("</body></html>");
		
	}

}
