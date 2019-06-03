package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

/**
 * The Class ViewPanel.
 *
 * @author Group 5
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	private Image icoFond;
	private Image imgFond;
	//private static final Sprite CharacterDescendsStop          		= new Sprite("/Sprite_Character/JoueurDescendArret.png");

	
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
		viewFrame.getModel().getLevelMap().getObservable().addObserver(this);
		
		try {
			icoFond = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/Background.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		this.imgFond = this.icoFond;
		
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
		graphics.drawImage(imgFond, 0, 0, null);
		
		Graphics2D g = (Graphics2D)graphics;
		g.scale(2,  2);
		g.translate(-this.model.getLevelMap().getPlayer().getX()*16+5*16, -this.getViewFrame().getModel().getLevelMap().getPlayer().getY()*16+5*16);
		
		
		for(int x=0; x<40; x++) {
			for(int y=0; y<22; y++) {
				
				IElement el = this.model.getLevelMap().getElement(x, y);

				if(el instanceof IElement) {
					graphics.drawImage(el.getImage(), el.getX()*16, el.getY()*16, null);
				}
			}
		}
		
		g.setColor(Color.WHITE);
		g.drawString("Score : " +String.valueOf(this.model.getLevelMap().getPlayer().getScore()), this.model.getLevelMap().getPlayer().getX()*16-80, this.getViewFrame().getModel().getLevelMap().getPlayer().getY()*16-64);

		this.repaint();
	}
	
}
