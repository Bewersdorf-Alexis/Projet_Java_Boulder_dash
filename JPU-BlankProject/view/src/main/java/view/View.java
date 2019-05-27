package view;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


public final class View {

	
	public View() {
		ViewFrame view = new ViewFrame();
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

}

