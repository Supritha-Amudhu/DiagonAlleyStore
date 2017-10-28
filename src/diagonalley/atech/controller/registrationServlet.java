package diagonalley.atech.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diagonalley.atech.model.*;

/**
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Hiii");
	String name = (String)request.getParameter("name");
	String ship = (String)request.getParameter("shippingaddress");
	String bill = (String)request.getParameter("billingaddress");
	String email = (String)request.getParameter("email");
	String phone = (String)request.getParameter("phone");
	String password = (String)request.getParameter("password");
	String confirmpassword = (String)request.getParameter("confirmpassword");
	System.out.println("Name : " +name +"S addr : "+ ship + "Bill addr : " +bill + "Email : " +email + "Phone : "+phone + "Password : " +password + "Confirm : " +confirmpassword);
	
	registrationService reg = new registrationService();
	reg.registerUser(name, ship, bill, email, phone, password, confirmpassword);
	
	RequestDispatcher rd = request.getRequestDispatcher("diagonalley_login.jsp");
	rd.forward(request, response);
	}

}
