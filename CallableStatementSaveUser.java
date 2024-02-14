package mavenjdbce8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementSaveUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
	CallableStatement callableStatement=connection.prepareCall("call saveUser(200,'punith','bang')");
	
	callableStatement.execute();
	connection.close();
	System.out.println("Data saved successfully with CS");
	
	
}
}
