package org.bit.conn;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseAccess {

	public int createDatabase() throws SQLException;

	public ResultSet query(String statement) throws SQLException; 
	
}
