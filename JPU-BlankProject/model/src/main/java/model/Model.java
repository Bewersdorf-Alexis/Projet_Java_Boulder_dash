package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.ICharacter;
import contract.IModel;
import entity.Level;
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
	private int dx;
	private int dy;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.level = new Level();
		this.player = new Player(this.xPlayer, this.yPlayer);
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
	public void loadLevel(final String code) {
		try {
			final DAOLevel daoLevel = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(daoLevel.find(code));
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
	
	public void move(int xPlayer, int yPlayer) {
		this.xPlayer = xPlayer;
		this.yPlayer = yPlayer;
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {}
	}

	public int getDx() {
		return this.dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return this.dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}
	
	
	
}
