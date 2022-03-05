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
		String uid=req.getParameter("uid");
		String pwd=req.getParameter("pwd");
		if(uid.equals("john") && pwd.equals("john123"))
		{
			// additional notes being sent to next program
			req.setAttribute("loginSuccess", true);
			req.setAttribute("name", "");
			req.getRequestDispatcher("/success").forward(req, res);
		}
		else {
			res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S1275366503%3A1642101485586650&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		}
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req,res);
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
