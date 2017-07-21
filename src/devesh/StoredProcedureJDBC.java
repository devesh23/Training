package devesh;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedureJDBC {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","root");
			System.out.println("Connected");
			String s = "call addtwo(?,?,?)";
			CallableStatement cst = conn.prepareCall(s);
			cst.setInt(1, 22);
			cst.setInt(2, 32);
			cst.registerOutParameter(3, Types.INTEGER);
			cst.execute();
			int sm = cst.getInt(3);
			System.out.println("Sum is " + sm);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
