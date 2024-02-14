package mavenjdbce8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterConcept {
public static void main(String[] args) throws Exception {
//	Load the Driver
	Driver driver=new Driver();
//	Register the Driver
	DriverManager.registerDriver(driver);
	
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
	
//	3.Create a Statement
	Statement statement=connection.createStatement();

//	4.Execute a query
	statement.execute("insert into User values(100,'poo','mysore')");
	
//	5.Close the connection
	connection.close();
	
	System.out.println("Data inserted successfully with loading and Registering the Driver explicitily");
	
	
	
}
}
