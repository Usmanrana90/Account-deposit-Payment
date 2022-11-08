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
 * Servlet implementation class DepositServlet
 */
@WebServlet("/deposit")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String ammount=request.getParameter("ammount");
		String name=request.getParameter("name");
		
		HttpSession hs=request.getSession();
		
		String accno=(String) hs.getAttribute("accno");
		String accname=(String) hs.getAttribute("accname");
		String acctype=(String) hs.getAttribute("acctype");
		String accbranch=(String) hs.getAttribute("accbranch");
		
		PrintWriter out=response.getWriter();
		out.print(ammount+name+accno+accname+acctype+accbranch);
	
		
	
	}

}
