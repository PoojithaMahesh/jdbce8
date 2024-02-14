package mavenjdbce8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteQueryConcept {
public static void main(String[] args) throws Exception {
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
//	
////	3.Create a Statement
//	Statement statement=connection.createStatement();
//
////	4.Execute a query
//	statement.executeQuery("insert into User values(1000,'poo','mysore')");
//	
////	5.Close the connection
////	connection.close();
//	
//	System.out.println("Data inserted successfully with dependencies");
//	RESULT=EXCEPTION
	
	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
//	Statement statement=connection.createStatement();
//	statement.executeQuery("delete from User where id=10");
//	connection.close();
//	System.out.println("data deleted successfully");
//	RESULT=EXCEPTION
	
	
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
	Statement statement=connection.createStatement();
	statement.executeQuery("update user set name='poojitha' where id=10");
	connection.close();
	System.out.println("data updated successfully");

	
	
	
	
	
	
	
}
}
