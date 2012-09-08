package jp.itacademy.sample.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowParamentersServlet
 */
@WebServlet("/uranai")
public class UranaiServlet extends HttpServlet {
	
  protected void doGet(HttpServletRequest req,
		  HttpServletResponse res)
		  throws ServletException, IOException {
	
	req.setCharacterEncoding("utf-8");
	res.setContentType("text/html; charset=utf-8");
	PrintWriter out = res.getWriter();
	out.println("<!DOCTYPE html>");
	out.println("<meta charset=\"utf-8\">");
	out.println("<title>show parameters</title>");
	out.println("<ul>");
	out.println("<li>ÇæÇ¢Ç´ÇøÅ[=" + req.getParameter("ÇæÇ¢Ç´ÇøÅ[") + "</li>");
  }
	
  protected void doPost(HttpServletRequest req,
		  HttpServletResponse res)
		  throws ServletException, IOException {
    doGet(req, res);		
  }
}