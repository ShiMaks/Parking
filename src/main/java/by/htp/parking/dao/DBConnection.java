package by.htp.parking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection implements AutoCloseable {
	
	private Connection connect;
	
	public Connection getConnection() throws SQLException {

		// TODO property file
		String url = "jdbc:mysql://localhost:3306/parking_dt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			connect = DriverManager.getConnection(url, user, pass);
			
		} catch(ClassNotFoundException e) {
			throw new SQLException("Driver not loaded", e);
		} catch (InstantiationException  | IllegalAccessException e) {
			e.printStackTrace();
			// TODO logging
			// TODO throw something
		}
		return connect;
	}

	@Override
	public void close() throws Exception {
		connect.close();
		
	}
}
