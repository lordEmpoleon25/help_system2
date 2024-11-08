package backend;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//verificar essa conexao depois 
public class mysqlConnection {
	 public static Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3308/help_system",
	                    "root", "root");

	            return connection;
	        } catch (ClassNotFoundException | SQLException ex) {
	            Logger.getLogger(mysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;
	    }
	   
//	    public static void main(String[] args) {
//	        System.out.println(getConnection());
//	    }
	
}
