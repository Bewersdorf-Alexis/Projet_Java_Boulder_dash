package controller;

import contract.ControllerOrder;
import contract.ElementType;
import contract.ICharacter;
import contract.IController;
import contract.IElement;
import contract.IMobile;
import contract.IModel;
import contract.IView;
import contract.Permeability;

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

		IElement player = this.getModel().getLevelMap().getPlayer();
		
		//boolean col = collision(controllerOrder, player);
		
			switch (controllerOrder) {
				case Up:
					//if(col == true) {
						player.moveUp();		
					//}

					

					break;
				case Down:
					player.moveDown();

					break;
				case Left:
					player.moveLeft();

					break;
				case Right:
					player.moveRight();

					break;
				default : 
					player.doNothing();
					break;
		
			}
	}
	
	public boolean collision (ControllerOrder controllerOrder, IElement element) {
		
		IElement player = element;
		
		IElement elementNext;

				
			switch(controllerOrder) {
			
				case Left:
					elementNext = this.model.getLevelMap().getElement(player.getX()-1, player.getY());
					break;
				case Right:
					elementNext = this.model.getLevelMap().getElement(player.getX()+1, player.getY());
					break;
				case Up:
					elementNext = this.model.getLevelMap().getElement(player.getX(), player.getY()+1);
					break;
				case Down:
					elementNext = this.model.getLevelMap().getElement(player.getX(), player.getY()-1);
					break;
			default:
				elementNext = null;
				break;
			
			}
			
			Permeability permeability = elementNext.getPermeability();
			ElementType elementType = elementNext.getElementType();
			

			if(elementNext == null) {
				return true;
			}
			else {
				switch(permeability) {
					case BLOCKING :
						if(elementType == ElementType.PLAYER && element.getElementType() == ElementType.ENEMY) {
							this.model.getLevelMap().getPlayer().die();
							System.exit(0);
						}
						else if(elementType == ElementType.ENEMY && element.getElementType() == ElementType.PLAYER) {
							this.model.getLevelMap().getPlayer().die();
							System.exit(0);
						}
						else if(elementType == ElementType.UNBREAKABLEBLOCK) {
						}
						return false;
						
					case PENETRABLE :
						if(elementType == ElementType.BLOCK) {
							return true;
						}
						this.model.getLevelMap().removeElement(elementNext.getX(), elementNext.getY());
						return true;
						
					case SEMIBLOKING :
						//if()
						
						break;
						
					case PUSHABLE :
						
						break;
				default:
					break;
				
				}
				
				
			}
			return false;
			
		
	}
	
}
