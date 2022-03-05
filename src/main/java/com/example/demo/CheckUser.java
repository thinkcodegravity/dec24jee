package com.example.demo;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/checkUser")
public class CheckUser extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uid=req.getParameter("userid");
		try {
			Connection conn=DatabaseConnection.getDBConnection();
			// handling return type
			// method call - need help from other program
			boolean result=UsersTable.doesUserExist(uid, conn);
			if(result==true)
				res.getWriter().write("unavailable");
			else
				res.getWriter().write("available");
		} catch (Exception e) {
			e.printStackTrace();
		}
		res.getWriter().flush();
		res.getWriter().close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
