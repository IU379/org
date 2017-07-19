package test;

	import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

	public class Enemy extends Sprite implements Pins {
		//enemy spawn location
		public final int ESTART_Y = 50;
		public final int ESTART_X = 270;
		
		//enemy sprite
		private final String enemyImg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\UFO.png";
		private final String enemyEx = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\enemyex.png";
		private int ewidth;
		
		public Enemy() {

        initEnemy();
    }
		//spawn enemy and set up hitbox
    void initEnemy() {   
        ImageIcon ii = new ImageIcon(enemyImg);
        ewidth = 28;
        setImage(ii.getImage());
    }
    public void enemyExplode() {
    	if (ELives.enemylives <= -1) {
    		ImageIcon ii = new ImageIcon(enemyEx);
    		setImage(ii.getImage());
    		setX(getX());
    		setY(getY());
    	} else {
    		ImageIcon ii = new ImageIcon(enemyImg);
            ewidth = 28;
            setImage(ii.getImage());
            setX(getX());
    		setY(getY());
    	}
    }
    //boundaries and movement
    public void act() {
        
        x += dx;
        
        if (x <= 2    ) {
            x = 2;
        }
        
        if (x >= BOARD_WIDTH - 2 * ewidth) {
            x = BOARD_WIDTH - 2 * ewidth;
        }
    }
    //key presses
    public void keyPressed(KeyEvent e) {
        
        int key = e.getKeyCode();
        if (Board.ingame) {
        	if (key == KeyEvent.VK_A) {
        
        		dx = -2;
        	}

        	if (key == KeyEvent.VK_D) {
        
        		dx = 2;
        	}
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
        
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
        
            dx = 0;
        }
    }
}


