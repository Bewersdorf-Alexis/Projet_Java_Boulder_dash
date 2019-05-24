package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
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
			case KeyEvent.VK_Z:
				return ControllerOrder.UP;
			case KeyEvent.VK_Q:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_S:
				return ControllerOrder.DOWN;
			case KeyEvent.VK_D:
				return ControllerOrder.RIGHT;
			default :
				return ControllerOrder.DEFAULT;
		}
	}
	
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}


	//*****VISIBILITY*****\\
	/*@see java.lang.Runnable#run()*/
	public void run() {
		this.viewFrame.setVisible(true);
	}

	//*****DIALOG*****\\
	@Override
	public void printMessage() {
		JOptionPane.showMessageDialog(null, "Pour vous déplacer utiliser les touches Z, Q, S, D");
		
	}
}

