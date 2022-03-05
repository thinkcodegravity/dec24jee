package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.client.RestTemplate;
@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String weatherAPIKey="597c9484925c970747d8745335f30081";
		String city=req.getParameter("city");
		RestTemplate getTest=new RestTemplate(); // similar to soap stub program
		Object result=
				getTest.getForObject("https://api.openweathermap.org/data/2.5/weather?appid="+
						weatherAPIKey+"&q="+city+"&units=metric", 
				Object .class);
		res.getWriter().write(result.toString());
		res.getWriter().close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req,res);
	}

}
