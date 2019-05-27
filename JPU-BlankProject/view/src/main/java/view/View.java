package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


public final class View {

	
	public View() {
		ViewFrame view = new ViewFrame();

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 * @throws IOException 
	 * @throws HeadlessException 
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	//*****CONTROLLER*****\\
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_Z:
				return ControllerOrder.Up;
			case KeyEvent.VK_Q:
				return ControllerOrder.Left;
			case KeyEvent.VK_S:
				return ControllerOrder.Down;
			case KeyEvent.VK_D:
				return ControllerOrder.Right;
			default:
				return ControllerOrder.Default;
		}
	}

}

