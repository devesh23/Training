package devesh;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class ScrollResultSetCheck {
	public static void main(String[] args) {
		
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver is loaded");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","root");
		System.out.println("Connected");
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String s = "select ID,NAME from emp";
		
		
		st.addBatch("insert into emp(id,name) values(18,'ja')");
		st.addBatch("insert into emp(id,name) values(19,'jy')");
		st.addBatch("insert into emp(id,name) values(20,'ay')");
		st.executeBatch();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}