package br.usjt.arws18.pipoca.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	public static Connection getConnection() throws IOException {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/pipocadb?"
					+ "user=legend&password=&useSSL=false");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
	}
	
}
