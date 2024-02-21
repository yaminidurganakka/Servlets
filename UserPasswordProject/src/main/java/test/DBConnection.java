package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con = null;

	private DBConnection() { // private constructor
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				 con = DriverManager.getConnection(Interface.dbUrl, Interface.uName, Interface.pWord);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getCon() { // take one method for returning the con
		return con;
	}
}
