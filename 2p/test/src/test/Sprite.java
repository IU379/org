package test;

import java.awt.Image;
//sprite calls
public class Sprite {
	//sprite variables
    private boolean visible;
    private Image image;
    protected int x;
    protected int y;
    protected boolean dying;
    protected int dx;

    public Sprite() {
    
        visible = true;
    }
    //remove sprite
    public void die() {
    
        visible = false;
    }
    //visibility
    public boolean isVisible() {
    
        return visible;
    }
    //set visible
    protected void setVisible(boolean visible) {
    
        this.visible = visible;
    }
    //set sprite image
    public void setImage(Image image) {
    
        this.image = image;
    }
    //get sprite image
    public Image getImage() {
    
        return image;
    }
    //set position
    public void setX(int x) {
    
        this.x = x;
    }

    public void setY(int y) {
    
        this.y = y;
    }
    //get position
    public int getY() {
    
        return y;
    }

    public int getX() {
    
        return x;
    }
    //death
    public void setDying(boolean dying) {
    
        this.dying = dying;
    }

    public boolean isDying() {
    
        return this.dying;
    }
}