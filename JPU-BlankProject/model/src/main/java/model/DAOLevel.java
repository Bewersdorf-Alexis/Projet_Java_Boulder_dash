package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Level;
import model.element.mobile.Diamond;
import model.element.mobile.Enemy;
import model.element.mobile.Rock;
import model.element.motionless.Block;
import model.element.motionless.UnbreakableBlock;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOLevel extends DAOEntity<Level> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOLevel(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final Level entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final Level entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final Level entity) {
		// Not implemented
		return false;
	}

	@Override
	public Level find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
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
						switch(resultSet.getString("C"+x)) {
						case "B":
							level.constructLevel(x, y, new UnbreakableBlock(x, y, level));
							break;
						case "C":
							level.constructLevel(x, y, new Block(x, y, level));
							break;
						case "R":
							level.constructLevel(x, y, new Rock(x, y, level));
							break;
						case "E":
							level.constructLevel(x, y, new Enemy(x, y, level));
							break;
						case "S":
							level.constructLevel(x, y, new Exit(x, y, level));
							break;
						case "P":
							level.constructLevel(x, y, new Character(x, y, level));
							break;
						case "D":
							level.constructLevel(x, y, new Diamond(x, y, level));
							break;
						default :
							level.constructLevel(x, y, null);
						}
                                     
					}
                                     
				}
			}
			return level;
                        
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/


}
