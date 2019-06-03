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
 * @author Group 5
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

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getLevel()
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

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#loadLevel()
	 */
	public void loadLevel(final int id) {
		try {
			final DAOLevel daoLevel = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(daoLevel.find(id));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getLevelMap()
	 */
	public ILevelMap getLevelMap() {
		return levelMap;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#setLevelMap()
	 */
	public void setLevelMap(ILevelMap levelMap) {
		this.levelMap = levelMap;
	}
	
}
