package mavenjdbce8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionConcept {
public static void main(String[] args) throws Exception {
//		1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8?user=root&password=root");
	
//	3.Create a Statement
	Statement statement=connection.createStatement();

//	4.Execute a query
	statement.execute("insert into User values(10,'poo','mysore')");
	
//	5.Close the connection
	connection.close();
	
	System.out.println("Data inserted successfully with different getConnection method");
	
}
}
