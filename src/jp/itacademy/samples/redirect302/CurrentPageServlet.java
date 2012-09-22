package jp.itacademy.samples.redirect302;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrentPageServlet
 */
@WebServlet("/redirect302/current")
public class CurrentPageServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
	    res.setContentType("text/html; charset=utf-8");
	    PrintWriter out = res.getWriter();
	    out.println("<!DOCTYPE html>");
	    out.println("<meta charset='utf-8'");
	    out.println("<p>�ꎞ�x�ƒ�</p>");
	}
}