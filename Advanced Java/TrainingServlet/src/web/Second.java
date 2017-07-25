package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("Text/html");
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("FirstName");
		String pass = req.getParameter("PassWord");
		pw.println("<h1>Welcome "+name);
		pw.println("<h1>Your Password is " + pass);
	}
}
