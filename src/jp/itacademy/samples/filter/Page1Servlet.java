package jp.itacademy.samples.filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1
 */
@WebServlet("/filter/memberOnly/page1")
public class Page1Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/filter/page1.jsp")
		    .forward(req, res);
	}
}