package jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcexample1 {

	public static void main(String[] args) throws SQLException {
		//This file is edited
		//2nd time edited
		//
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		String URL="jdbc:mysql://localhost:3306/?user=root";
		
				
		Connection conn=DriverManager.getConnection(URL, "root"," password");
		
		Statement stmt=conn.createStatement();

		String query="select * from book";
		ResultSet rset=stmt.executeQuery(query);
		
		while(rset.next())
		{
			int id=rset.getInt(1);
			String name=rset.getString(2);
			System.out.println(id+","+name);
		}
		
		
		
		rset.close();
		stmt.close();
		
		conn.close();
}
	
}
