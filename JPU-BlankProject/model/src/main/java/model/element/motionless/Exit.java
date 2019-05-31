package model.element.motionless;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ElementType;
import contract.IElement;
import contract.Permeability;
import model.element.LevelMap;

public class Exit implements IElement {

	private Permeability permeability = Permeability.SEMIBLOKING;
	private ElementType elementType = ElementType.PLAYER;
	
                private String imageName;
                
                private Image image;
                
                private int xExit;
                private int yExit;

                
                public Exit(final int x, final int y, LevelMap levelMap) {
                               this.xExit = x;
                               this.yExit = y;
                               this.loadImage();
                }


				@Override
				public Image getImage() {
					// TODO Auto-generated method stub
					return this.image;
				}


				@Override
				public void setImage(Image image) {
					// TODO Auto-generated method stub
					this.image = image;
				}


				@Override
				public void loadImage() {
					// TODO Auto-generated method stub
					try {
						image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("images/trapdoor.png"));
					}
					catch(IOException e) {
						e.printStackTrace();
					}
				}
				
				public void doNothing() {
					
				}


				@Override
				public String getImageName() {
					// TODO Auto-generated method stub
					return this.imageName;
				}


				@Override
				public void setImageName(String imageName) {
					// TODO Auto-generated method stub
					this.imageName = imageName;
				}


				@Override
				public boolean isImageLoaded() {
					// TODO Auto-generated method stub
					return false;
				}


				@Override
				public void setImageLoaded(boolean isImageLoaded) {
					// TODO Auto-generated method stub
					
				}


				@Override
				public int getX() {
					// TODO Auto-generated method stub
					return this.xExit;
				}


				@Override
				public void setX(int x) {
					// TODO Auto-generated method stub
					this.xExit = x;
				}


				@Override
				public int getY() {
					// TODO Auto-generated method stub
					return this.yExit;
				}


				@Override
				public void setY(int y) {
					// TODO Auto-generated method stub
					this.yExit = y;
				}


				@Override
				public boolean isExist() {
					// TODO Auto-generated method stub
					return false;
				}


				@Override
				public void moveUp() {
					// TODO Auto-generated method stub
					
				}


				@Override
				public void moveRight() {
					// TODO Auto-generated method stub
					
				}


				@Override
				public void moveLeft() {
					// TODO Auto-generated method stub
					
				}


				@Override
				public void moveDown() {
					// TODO Auto-generated method stub
					
				}


				@Override
				public Permeability getPermeability() {
					// TODO Auto-generated method stub
					return null;
				}


				public void setPermeability(Permeability permeability) {
					this.permeability = permeability;
				}


				public ElementType getElementType() {
					return elementType;
				}


				public void setElementType(ElementType elementType) {
					this.elementType = elementType;
				}


				@Override
				public void die() {
					// TODO Auto-generated method stub
					
				}

}

