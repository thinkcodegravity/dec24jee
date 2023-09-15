package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add2Cart")
// http://localhost/add2Cart?productName=Iphone
public class CartServlet extends HttpServlet {

	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		if(session.getAttribute("cart") == null )
			session.setAttribute("cart", new ArrayList<String> ());
	
		// access the arraylist from session 
		ArrayList<String> products=(ArrayList<String> )session.getAttribute("cart");
		// access product name from request
		String prd=req.getParameter("productName");
		// add product name into session's arraylist
		products.add(prd);
		res.getWriter().write(products.toString());
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
/*
HttpSession session=req.getSession();
		if(session.getAttribute("cart") == null )
			session.setAttribute("cart", new ArrayList<String> ());
		
		session.setAttribute("login", true);
		session.setAttribute("age", 10);
		session.setAttribute("weight", 12.12);
		//session.invalidate(); // on logout.. delete all info stored in session for the customer
		
		ArrayList<String> products=(ArrayList<String> )session.getAttribute("cart");
		
*/