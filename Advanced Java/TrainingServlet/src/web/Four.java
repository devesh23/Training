package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Four extends HttpServlet{
	
	String UserName = null;
	String PassWord = null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		
		resp.setContentType("Text/html");
		PrintWriter pw = resp.getWriter();
		UserName = req.getParameter("UserName");
		PassWord = req.getParameter("PassWord");
		
		Connection conn = Connect.createstatement();
		
		try {
			PreparedStatement pst =  conn.prepareStatement("insert into server values(?,?)");
			pst.setString(1, UserName);
			pst.setString(2, PassWord);
			pst.executeUpdate();
			pw.println("<h1> Yo Man </h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
