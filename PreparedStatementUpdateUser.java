package mavenjdbce8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdateUser {
public static void main(String[] args) throws Exception {
	Scanner scanner=new Scanner(System.in);
	System.out.println("please give a name");
	String name=scanner.next();
	System.out.println("please give a id");
	int id=scanner.nextInt();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("update user set name=? where id=?");
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, id);
	preparedStatement.execute();
	connection.close();
	System.out.println("data updated successfully");
	
}
}
