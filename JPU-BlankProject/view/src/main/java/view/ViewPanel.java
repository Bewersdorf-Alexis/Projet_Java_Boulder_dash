package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class ViewPanel extends JPanel{
	
	//*****VARIABLES*****\\
	
			//----IMAGES----\\
		//Stock les images de fond
		private ImageIcon icoFond;
		private Image imgFond;
		
		//----VALEURS----\\
		//Valeurs de l'axe x du fond
		private int xFond;
		
		//Valeurs de l'axe y du fond
		private int yFond;
		

		//*****CONSTRUCTEUR*****\\
		public ViewPanel() {
			//Herite de la classe JPanel 
			super();
			this.xFond = 0;
			this.yFond = 0;
			
			//Obtenir l'iamge du fond
			icoFond = new ImageIcon(getClass().getResource("/Image/menu_large.jpg"));
			this.imgFond = this.icoFond.getImage();
		}
	
		//*****DRAW*****\\
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			Graphics g2 = (Graphics2D)g;
			g2.drawImage(this.imgFond, xFond, yFond, null);
		}

		//*****SET*****\\
		public void setxFond(int xFond) {
			this.xFond = xFond;
			
		}

		public void setyFond(int yFond) {
			this.yFond = yFond;
			
		}

}
