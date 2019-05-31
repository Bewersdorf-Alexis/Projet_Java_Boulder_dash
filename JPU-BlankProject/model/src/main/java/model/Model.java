package model;

import java.io.IOException;
import java.sql.SQLException;
import contract.ILevelMap;
import contract.IModel;
import entity.Level;
import model.element.LevelMap;
import model.element.mobile.Diamond;
import model.element.mobile.Player;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model implements IModel {

	/** The helloWorld. */
	private Level level;
	
	private ILevelMap levelMap;
	
	private Player player;
	
	private Diamond diamond;


	/**
	 * Instantiates a new model.
	 * @throws IOException 
	 */
	public Model() {
		//this.level = new Level();
		//this.player = new Player(this.xPlayer, this.yPlayer, level);
		//this.diamond = new Diamond(1, 1, level);
		this.setLevel(new Level());
		this.loadLevel(2);
		
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
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	private void setLevel(final Level level) {
		this.level = level;

	}

	/**
     * Load hello world.
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
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */

	public ILevelMap getLevelMap() {
		return levelMap;
	}

	public void setLevelMap(ILevelMap levelMap) {
		this.levelMap = levelMap;
	}
	
}
