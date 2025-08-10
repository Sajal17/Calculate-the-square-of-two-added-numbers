package com.sa;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@SuppressWarnings("serial")
//@WebServlet("/add")
public class AddServlet extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
    	int x=Integer.parseInt(req.getParameter("num1"));
    	int y=Integer.parseInt(req.getParameter("num2"));
    	int sum=x+y;
    	req.setAttribute("s",sum);
    	//res.sendRedirect("sq?sum="+s);
    	RequestDispatcher rd=req.getRequestDispatcher("/sq");
    	rd.forward(req,res);
    	
    }
}
