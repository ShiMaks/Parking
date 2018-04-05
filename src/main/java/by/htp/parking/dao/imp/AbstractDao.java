package by.htp.parking.dao.imp;

import by.htp.parking.dao.DBConnection;

abstract class AbstractDao {
	
	DBConnection connect;
	
	{
		connect = new DBConnection();
	}

}
