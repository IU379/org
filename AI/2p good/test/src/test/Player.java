package test;

	import java.awt.event.KeyEvent;

	import javax.swing.ImageIcon;

	public class Player extends Sprite implements Pins {
		//start location of player
	    private final int START_Y = 650;
	    private final int START_X = 270;
	    //image
	    private final String playerImg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\ship.png";
	    
	    //hitbox
	    private int width;

	    public Player() {

	        initPlayer();
	    }
	    //set hitbox and start pos
	    private void initPlayer() {
	        
	        ImageIcon ii = new ImageIcon(playerImg);

	        width = 34;
	        setImage(ii.getImage());
	        setX(START_X);
	        setY(START_Y);
	    }
	    //movement and boundaries
	    public void act() {
	        
	        x += dx;
	        
	        if (x <= 2    ) {
	            x = 2;
	        }
	        
	        if (x >= BOARD_WIDTH - 2 * width) {
	            x = BOARD_WIDTH - 2 * width;
	        }
	    }
	    //movement keys
	    public void keyPressed(KeyEvent e) {
	        
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	        
	            dx = -2;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	        
	            dx = 2;
	        }
	    }

	    public void keyReleased(KeyEvent e) {
	        
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	        
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	        
	            dx = 0;
	        }
	    }
	}
