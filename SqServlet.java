package com.sa;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@SuppressWarnings("serial")
//@WebServlet("/sq")
public class SqServlet extends HttpServlet 
{
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	   int j=(int)req.getAttribute("s");
	   j=j*j;
	   PrintWriter out=res.getWriter();
	    out.println("Result is :"+j);
   }
}
