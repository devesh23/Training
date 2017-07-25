package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class five extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		resp.setContentType("Text/html");
		PrintWriter pw = resp.getWriter();
		String UserName = req.getParameter("UserName");
		ServletContext sc = getServletContext();
		sc.setAttribute("Intent", UserName);
		pw.println("<h1><a href='six'>Click Here</a>");
	}
}
