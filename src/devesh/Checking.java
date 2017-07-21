package devesh;
import java.sql.*;
import java.util.Scanner;
public class Checking {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","root");
			System.out.println("Connected");
			
			// normal Statement which has to be compiled everytime when it is executed by db
			//Statement stmt = null;
			//stmt = conn.createStatement();
			
			Scanner s = new Scanner(System.in);
			//String s = sql.nextLine();
			
			// SQL statement for prepared statement
			String sql = "insert into emp(id,name) values(?,?)";
			
			// preparedStatement which has to be compiled only one time by db
			PreparedStatement ps = conn.prepareStatement(sql);
			
			int id;
			String name;
			
			for(int i = 0; i < 2;i++){
				 id = s.nextInt();
				 name = s.next();
				 ps.setInt(1, id);
				 ps.setString(2, name);
				 ps.executeUpdate();
				 System.out.println("Inserted");
			}
			
			sql = "Select * from emp";
			ps = conn.prepareStatement(sql);
	
			ResultSet resultSet = ps.executeQuery(sql);
			System.out.println(resultSet);
			
			ResultSetMetaData res = resultSet.getMetaData();
			
			// Get Column names
			for(int i=1;i<=res.getColumnCount();i++){
				System.out.print(res.getColumnName(i)+"\t \t");
			}
			
			System.out.println();
			// Display Column values
			while(resultSet.next()){
				for(int i=1;i<=res.getColumnCount();i++){
					System.out.print(resultSet.getString(i)+"\t \t");
				}
				System.out.println();
			}
			
			// Close the connection
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
