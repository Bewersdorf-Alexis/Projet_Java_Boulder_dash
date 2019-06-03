package model;

import java.io.IOException;
import java.sql.SQLException;
import contract.ILevelMap;
import contract.IModel;
import entity.Level;
import model.element.LevelMap;

/**
 * The Class Model.
 *
 * @author Carlu Florian
 */
public final class Model implements IModel {

	/** The level. */
	private Level level;
	
	/** The LevelMap. */
	private ILevelMap levelMap;


	/**
	 * Instantiates a new model.
	 * @throws IOException 
	 */
	public Model() {
		this.setLevel(new Level());
		this.loadLevel(5);
		
		this.setLevelMap(new LevelMap(this.level));
	}

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public Level getLevel() {
		return this.level;
	}

	/**
     * Sets the Level.
     *
     * @param level
     *            the new level
     */
	private void setLevel(final Level level) {
		this.level = level;

	}

	/**
     * Load level.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadLevel(final int id) {
		try {
			final DAOLevel daoLevel = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(daoLevel.find(id));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the levelMap.
	 * 
	 * @return levelMap
	 * 				the levelMap
	 */
	public ILevelMap getLevelMap() {
		return levelMap;
	}

	/**
	 * Sets the levelMap.
	 * 
	 * @param levelMap
	 * 				the levelMap
	 */
	public void setLevelMap(ILevelMap levelMap) {
		this.levelMap = levelMap;
	}
	
}
