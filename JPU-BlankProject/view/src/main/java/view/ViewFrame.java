package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")


class ViewFrame extends JFrame implements KeyListener {

	public static ViewPanel pan;
	//*****FRAME******\\
	public ViewFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.addKeyListener(this);
		this.setContentPane(pan);
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		JOptionPane.showMessageDialog(null, "Pour vous déplacer utiliser les touches Z, Q, S, D");
	}

	//*****KEY*****\\
	@Override
	public void keyTyped(KeyEvent e) {


	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
