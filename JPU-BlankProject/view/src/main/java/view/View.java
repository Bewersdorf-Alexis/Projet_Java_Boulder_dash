package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	//*****CONTROLLER*****\\
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_G:
				return ControllerOrder.English;
			case KeyEvent.VK_F:
				return ControllerOrder.Francais;
			case KeyEvent.VK_D:
				return ControllerOrder.Deutsch;
			case KeyEvent.VK_I:
				return ControllerOrder.Indonesia;
			default:
				return ControllerOrder.English;
		}
	}
	
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	//*****PRINT MESSAGE*****\\
	/* @see contract.IView#printMessage(java.lang.String)*/
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	//*****VISIBILITY*****\\
	/*@see java.lang.Runnable#run()*/
	public void run() {
		this.viewFrame.setVisible(true);
	}
}

