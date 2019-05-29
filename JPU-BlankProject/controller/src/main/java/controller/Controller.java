package controller;

import contract.ControllerOrder;
import contract.ICharacter;
import contract.IController;
import contract.IElement;
import contract.IMobile;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;
	

	private static final int speed = 5;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.model.loadLevel(1);
	}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}
	
	private IModel getModel() {
		return this.model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
	 * @throws InterruptedException 
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {

			switch (controllerOrder) {
				case Up:
					this.getModel().getLevelMap().getPlayer().moveUp();
					//this.model.getCharacter().moveUp();
					break;
				case Down:
					this.getModel().getLevelMap().getPlayer().moveDown();
					//this.model.getCharacter().moveDown();
					break;
				case Left:
					this.getModel().getLevelMap().getPlayer().moveLeft();
					//this.model.getCharacter().moveLeft();
					break;
				case Right:
					this.getModel().getLevelMap().getPlayer().moveRight();
					//this.model.getCharacter().moveRight();
					break;
				default : 
					this.getModel().getLevelMap().getPlayer().doNothing();
					break;
		
			}
	}

}
