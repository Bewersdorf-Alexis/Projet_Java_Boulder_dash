package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Level;

/**
* The Class DAOLevel.
*
* @author Group 5
*/
class DAOLevel extends DAOEntity<Level> {

	/**
	 * Instantiates a new DAO Level.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	*           the SQL exception
	*/
	public DAOLevel(final Connection connection) throws SQLException {
		super(connection);
	}

                
	/**
	 * The find method
	 * 
	 * Gets characters on phpmyadmin and create a new level.
	 */
	@Override
    public Level find(final int id) {
                               
		Level level = new Level();
          
		try {
                 
			for(int x=0; x<40; x++) {
				for(int y=0; y<22; y++) {
                               
					final String sql = "{call LevelByID(?,?,?)}";
					final CallableStatement call = this.getConnection().prepareCall(sql);
					call.setInt(1, x);
					call.setInt(2, y);
					call.setInt(3, id);
					call.execute();
					final ResultSet resultSet = call.getResultSet();
					if (resultSet.first()) {
						level.constructLevel(x, y, resultSet.getString("C"+x));
                                     
					}
                                    
				}
			}
			return level;
                        
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
