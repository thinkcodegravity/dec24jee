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
	
	private void compareUseridPassword(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userid=req.getParameter("uid");
		String pass=req.getParameter("pwd");
		if(userid.equals("john") && pass.equals("john123"))
		{
			res.getWriter().write("login success");
			res.getWriter().close();
		}
		else 
		{
			res.getWriter().write("login failed");
			res.getWriter().close();
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
