package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Sprite {

	private Image image;
	
	private String imageName;
	
	private boolean imageLoaded;
	
	public Sprite(final String imageName) {
		this.setImageName(imageName);
	}
	
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}

	public void setImage(Image image) {
		// TODO Auto-generated method stub
		this.image = image;
	}

	public void loadImage() throws IOException {
		// TODO Auto-generated method stub
		this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
	}

	public String getImageName() {
		// TODO Auto-generated method stub
		return this.imageName;
	}

	public void setImageName(String imageName) {
		// TODO Auto-generated method stub
		this.imageName = imageName;
	}

	public boolean isImageLoaded() {
		// TODO Auto-generated method stub
		return this.imageLoaded;
	}

	public void setImageLoaded(boolean isImageLoaded) {
		// TODO Auto-generated method stub
		this.imageLoaded = isImageLoaded;
	}

}
