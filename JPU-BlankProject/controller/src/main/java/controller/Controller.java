package controller;

import contract.ControllerOrder;
import contract.ElementType;
import contract.IController;
import contract.IElement;
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
	

	//private static final int speed = 5; //pour un cycle avec ennemi et gravité

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
		
		boolean col = this.getElementNext(player, controllerOrder);
			
			switch (controllerOrder) {
				case Up:
					if(col) {
					player.moveUp();
					}
								
					break;
				case Down:
					if(col) {
					player.moveDown();
					}

					break;
				case Left:
					if(col) {
					player.moveLeft();
					}

					break;
				case Right:
					if(col) {
					player.moveRight();
					}

					break;
				default : 
					player.doNothing();
					break;
		
		}

	}
	
	public boolean getElementNext(IElement element, ControllerOrder controllerOrder) {
		
		boolean res = true;
		
		IElement elementA = element;
		ElementType TelementA;
		IElement elementN = null;
		

			switch (controllerOrder) {
			case Up:
				elementN = this.model.getLevelMap().getElement(elementA.getX(), elementA.getY()-1);
				break;
			case Down:
				elementN = this.model.getLevelMap().getElement(elementA.getX(), elementA.getY()+1);
				break;
			case Left:
				elementN = this.model.getLevelMap().getElement(elementA.getX()-1, elementA.getY());
				break;
			case Right:
				elementN = this.model.getLevelMap().getElement(elementA.getX()+1, elementA.getY());
				break;
			case Default : 
				elementN = null;
				break;
			}
		
		res = collision(elementA, elementN, controllerOrder);
		return res;
		
		
	}
	
	public boolean collision(IElement elementA, IElement elementN, ControllerOrder controllerOrder) {
		
		ElementType TelementN = null; 
		ElementType TelementA = elementA.getElementType();
		
		if(elementN != null) {
			TelementN = elementN.getElementType();
		}
		else {
			TelementN = ElementType.DEFAULT;
		}
		
		
		boolean res = true;
		
		switch(TelementA) {
		case DIAMOND:
			switch(TelementN) {
			case ENEMY:
				res = true;
				for(int x = elementN.getX()-1; x<elementN.getX()+1; x++) {
					for(int y = elementN.getY()-1; y<elementN.getX()+1; y++) {
						this.model.getLevelMap().setElement(x, y, elementA);
					}
				}
				break;
			case PLAYER:
				res = true;
				this.model.getLevelMap().getPlayer().destroy();
				System.out.println("You Die");
				System.exit(0);
				break;
			case DEFAULT:
				res = true;
				break;
			default :
				res = false;
			}
			break;
		case ENEMY:
			switch(TelementN) {
			case PLAYER :
				res = true;
				this.model.getLevelMap().getPlayer().destroy();
				System.out.println("You Die");
				System.exit(0);
			break;
			case DEFAULT :
				res = true;
			break;
			default :
				res = false;
				break;
			}
		case PLAYER:
			switch(TelementN) {
			case BLOCK:
				res = true;
				break;
			case DIAMOND:
				res = true;
				this.model.getLevelMap().getPlayer().setScore(this.model.getLevelMap().getPlayer().getScore()+1);;
				break;
			case ENEMY:
				res = true;
				this.model.getLevelMap().getPlayer().destroy();
				System.out.println("You Die");
				System.exit(0);
				break;
			case EXIT:
				res = true;
				if(this.model.getLevelMap().getPlayer().getScore() >= 5) {
					System.out.println("You Win");
					System.exit(0);
				}
				else {
					res = false;
				}
				break;
			case ROCK:
				if(getElementNext(elementN, controllerOrder))
				{
					if(controllerOrder == ControllerOrder.Left) {
						elementN.moveLeft();
						res = true;
					}
					else if(controllerOrder == ControllerOrder.Right) {
						elementN.moveRight();
						res = true;
					}
				}
				else {
					res = false;
				}
				
				break;
			case UNBREAKABLEBLOCK:
				res = false;
				break;
			case DEFAULT :
				res = true;
				break;
			
			}
	
			break;
		case ROCK:
			if((TelementN == ElementType.DEFAULT || TelementN == ElementType.PLAYER) && (controllerOrder == ControllerOrder.Right || controllerOrder == ControllerOrder.Left)) {
				res = true;
			}
			else {
				res = false;
			}
			break;
		default:
			res = true;
			break;

		}
		
		return res;
	
	}
}
	
	

