package controller;

import java.util.Random;

import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.ElementType;
import contract.IController;
import contract.IElement;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 * 
 * @author Group 5
 */
public final class Controller implements IController {

	/** The view. */
	private IView	view;

	/** The model. */
	private IModel	model;
	
	/** The order */
	private ControllerOrder stackOrder;
	
	/** A attribute gravity */
	private int gravity = 0;


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
		//this.model.loadLevel(1);
	}

	/**
     * The method control.
     * 
     * Print a message on start.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Use the directional arrows to move around.");
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
	
	/**
	 * Gets the model.
	 * 
	 * @return model
	 */
	private IModel getModel() {
		return this.model;
	}

	/**
	 * The play method.
	 * 
	 * controls the movement of all entities.
	 * 
	 */
	public void play() {

		while(this.getModel().getLevelMap().getPlayer().isExist()){

			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		IElement player = this.getModel().getLevelMap().getPlayer();
		
		boolean col = this.getElementNext(player, this.getStackOrder());
			
			switch (this.getStackOrder()) {
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
			this.clearStackOrder();
			

			for(int x=0; x<40; x++) {
				for(int y=0; y<22; y++) {			
					IElement e1 = this.getModel().getLevelMap().getElement(x, y);
					boolean cole1 = false;
					if(e1 != null && e1.getElementType() == ElementType.ENEMY) {
						Random r = new Random();
						int valeur = 1 + r.nextInt(5 - 1);
						switch(valeur) {
						case 1:
							cole1 = this.getElementNext(e1, ControllerOrder.Up);
							if(cole1) {
								e1.moveUp();
							}
							break;
						case 2:	
							cole1 = this.getElementNext(e1, ControllerOrder.Down);
							if(cole1) {
								e1.moveDown();
							}
							break;
						case 3:
							cole1 = this.getElementNext(e1, ControllerOrder.Right);
							if(cole1) {
								e1.moveRight();
							}
							break;
						case 4:
							cole1 = this.getElementNext(e1, ControllerOrder.Left);
							if(cole1) {
								e1.moveLeft();
							}
							break;
						default:
							e1.doNothing();
							break;
						}
					}
					
					else if(e1 != null && (e1.getElementType() == ElementType.ROCK || e1.getElementType() == ElementType.DIAMOND)) {
						if(this.getStackOrder() != ControllerOrder.Default) break;
						try {
							Thread.sleep(9);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
						
						cole1 = this.getElementNext(e1, ControllerOrder.Down);
						
						if(cole1) {
							
							e1.moveDown();
							
						}

					}
					
				}

			}
		}
	}
	
	/**
	 * Gets the order.
	 * 
	 * @return stackOrder
	 */
	public ControllerOrder getStackOrder() {

		return stackOrder;
	}

	/**
	 * Sets the stackOrder.
	 * 
	 * @param stackOrder
	 */
	public void setStackOrder(ControllerOrder stackOrder) {

		this.stackOrder = stackOrder;
	}
	
	/**
	 * Reset the stackOrder.
	 * 
	 */
    private void clearStackOrder() {

        this.stackOrder = ControllerOrder.Default;
    }
	
    /**
     * Gets the controller.
     * 
     * @return controller
     */
    public IController getOrderPeformer() {
        return this;
    }

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform()
	 */
    @Override
    public final void orderPerform(final ControllerOrder userOrder) {

        this.setStackOrder(userOrder);
    }
	
	/**
	 * Gets the next element.
	 * 
	 * @param element
	 * @param controllerOrder
	 * @return boolean
	 */
	public boolean getElementNext(IElement element, ControllerOrder controllerOrder) {
		
		boolean res = true;
		
		IElement elementA = element;
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
	
	/**
	 * checks for collisions.
	 * 
	 * @param elementA
	 * @param elementN
	 * @param controllerOrder
	 * @return boolean
	 */
	public boolean collision(IElement elementA, IElement elementN, ControllerOrder controllerOrder) {
		
		ElementType TelementN = null; 
		ElementType TelementA = elementA.getElementType();
		
		if(elementN != null) {
			TelementN = elementN.getElementType();
		}
		else {
			TelementN = ElementType.DEFAULT;
		}
		
		
		boolean res = false;
		
		switch(TelementA) {
		case ROCK :
		case DIAMOND :
			switch(TelementN) {
			case ENEMY:
				res = true;
				this.model.getLevelMap().popDiamond(elementN.getX(), elementN.getY());

				break;
			case PLAYER:
				if(gravity >= 2) {
					res = true;
					this.model.getLevelMap().getPlayer().setExist(false);;
					JOptionPane.showMessageDialog(null, "You die !");
					System.exit(0);
				}

				break;
			case DIAMOND:
				this.gravity = 0;
			case ROCK:
				this.gravity = 0;
			case UNBREAKABLEBLOCK:
				this.gravity = 0;
				break;
			case DEFAULT:
				this.gravity++;
				res = true;
				break;
			default :
				this.gravity = 0;
				res = false;
				break;
			}
			break;
		case ENEMY:				
			switch(TelementN) {
			case PLAYER :
				res = true;
				this.model.getLevelMap().getPlayer().setExist(false);;
				JOptionPane.showMessageDialog(null, "You die !");
				System.exit(0);
			break;
			case DEFAULT :
				res = true;
			break;
			default :
				res = false;
				break;
			}
			break;
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
				this.model.getLevelMap().getPlayer().setExist(false);;
				System.out.println("You Die");
				System.exit(0);
				break;
			case EXIT:
				res = true;
				if(this.model.getLevelMap().getPlayer().getScore() >= 5) {
					JOptionPane.showMessageDialog(null, "You win !");
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
			default:
				res = false;
				break;
			}
			break;
		default:
			res = true;
			break;

		}
		return res;
	
	}
}
