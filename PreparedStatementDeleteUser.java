package mavenjdbce8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDeleteUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbce8","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("delete from User where id=?");
	System.out.println("please give id");
	int id=new Scanner(System.in).nextInt();
	
	preparedStatement.setInt(1, id);
	preparedStatement.execute();
	connection.close();
	System.out.println("Data deleted successfully");
}
}
