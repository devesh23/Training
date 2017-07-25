package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Third extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		resp.setContentType("Text/html");
		PrintWriter pw = resp.getWriter();
		String[] para = req.getParameterValues("K");
		pw.println("<h1>Welcome "+para[0]);
		pw.println("<h1>Your Password is " + para[1]);
	}
}
