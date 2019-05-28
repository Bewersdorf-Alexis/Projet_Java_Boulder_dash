package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.ICharacter;
import contract.IElement;
import contract.IMobile;
import contract.IModel;
import entity.Level;
import model.element.mobile.Diamond;
import model.element.mobile.Player;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	private Level level;
	
	private Player player;
	
	private int xPlayer;
	private int yPlayer;
	
	private Diamond diamond;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.level = new Level();
		this.player = new Player(this.xPlayer, this.yPlayer, level);
		this.diamond = new Diamond(1, 1, level);
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
		this.setChanged();
		this.notifyObservers();
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
	public Observable getObservable() {
		return this;
	}
	
	public ICharacter getCharacter() {
		return this.player;
	}

	@Override
	public IMobile getMobile() {
		// TODO Auto-generated method stub
		return this.diamond;
	}
	
	
	
}
