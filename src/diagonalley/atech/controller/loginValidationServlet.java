package diagonalley.atech.controller;

import java.io.IOException;

import diagonalley.atech.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginValidationServlet
 */
@WebServlet("/loginValidationServlet")
public class loginValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = (String)request.getParameter("loginemail");
		String password = (String)request.getParameter("loginpassword");
		
		loginValidationService login = new loginValidationService();
		HttpSession session = request.getSession();
		String shoppername = login.validateUser(email, password);
		if(!shoppername.equals("fail"))
		{
			session.setAttribute("shoppername", shoppername);
			RequestDispatcher rd = request.getRequestDispatcher("diagonalley_HomePage.jsp");
			rd.forward(request, response);			
		}		
		else
		{
			session.setAttribute("shoppername", shoppername);
			RequestDispatcher rd = request.getRequestDispatcher("diagonalley_registration.jsp");
			rd.forward(request, response);
		}	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
