package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import contract.ICharacter;
import contract.IModel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	private ImageIcon icoFond;
	private Image imgFond;
	
	
	
	private Image icoPlayer1;
	private Image imgPlayer1;
	
	private ICharacter player;
	
	private IModel model;
	
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 * @throws IOException 
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		
		icoFond = new ImageIcon(getClass().getResource("/images/Background.png"));
		this.imgFond = this.icoFond.getImage();
		
		try {
			icoPlayer1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/JoueurDescendArret.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		this.imgPlayer1 = this.icoPlayer1;
		
		this.player = this.viewFrame.getModel().getCharacter();
		this.model = this.viewFrame.getModel();
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getLevel().getMessage(), 10, 20);
		graphics.drawImage(imgFond, 0, 0, null);
		
		graphics.drawImage(imgPlayer1, this.player.getX(), this.player.getY(), null);
		
		this.repaint();
	}
	
	
}
