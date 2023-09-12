package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://ip:port/login
// /checkUser
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		compareUseridPassword(req, res);	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		compareUseridPassword(req, res);
	}
	
	private void compareUseridPassword(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String userid=req.getParameter("uid");
		String pass=req.getParameter("pwd");
		if(userid.equals("john") && pass.equals("john123"))
		{
			/* text response
			res.getWriter().write("login success");
			res.getWriter().close();
			*/
			req.getRequestDispatcher("welcome.jsp").forward(req, res);
		}
		else 
		{
			/* binary reponse
			String message="login failed";
			byte[] binaryResponse=message.getBytes();
			res.getOutputStream().write(binaryResponse);
			res.getWriter().close();
			*/
			res.sendRedirect("https://accounts.google.com/signup/v2/createaccount?biz=false&cc=US&continue=https%3A%2F%2Fwww.google.com%2F&dsh=S1795304646%3A1694529628495602&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=AYZoVhe61-bWtOOukwMuGgJAjbpl6cr5zOqFryUj7XKtloO8gwKCtsF5qQJI7zexanY6HtEQKqXQtg&theme=glif");
		}
	}


}
/* sending binary response to customer
if(uid.equals("john") && pwd.equals("john1!")) {
	String result="binary response : successfull login";
	byte[] resBytes=result.getBytes();
	res.getOutputStream().write(resBytes);
	res.getOutputStream().flush();
	res.getOutputStream().close();
}
/* sending text response to customer
if(uid.equals("john") && pwd.equals("john1!")) {
	res.getWriter().write("successfull login"); // text message
	res.getWriter().flush();
	res.getWriter().close();	
}
*/
