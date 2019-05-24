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
		return this.image;
	}
	
	private void setImage(final Image image) {
		this.image = image;
	}
	
	public void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
	}
	
	public String getImageName() {
		return this.imageName;
	}
	
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}
	
	public boolean isImageLoaded() {
		return this.imageLoaded;
	}
	
	public void setImageLoaded(final boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}
	
}
