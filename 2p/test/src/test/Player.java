package test;

	import java.awt.event.KeyEvent;

	import javax.swing.ImageIcon;

	public class Player extends Sprite implements Pins {
		//start location of player
	    public final int START_Y = 650;
	    public final int START_X = 320;
	    //image
	    private final String playerImg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\ship.png";
	    private final String playerEx = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\shipex.png";
	    
	    //hitbox
	    private int width;

	    public Player() {

	        initPlayer();
	    }
	    //set hitbox and start pos
	    void initPlayer() {
	        
	        ImageIcon ii = new ImageIcon(playerImg);
	        width = 34;
	        setImage(ii.getImage());
	        setX(START_X);
	        setY(START_Y);
	    }
	    public void playerExplode() {
	    	if (PLives.playerlives <= -1) {
	    		ImageIcon ii = new ImageIcon(playerEx);
	    		setImage(ii.getImage());
	    		setX(getX());
	    		setY(getY());
	    	} else {
	    		ImageIcon ii = new ImageIcon(playerImg);
		        width = 34;
		        setImage(ii.getImage());
		        setX(getX());
	    		setY(getY());
	    	}
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
	        	if (Board.ingame){
	        	if (key == KeyEvent.VK_LEFT) {
	        
	            	dx = -2;
	        	}

	        	if (key == KeyEvent.VK_RIGHT) {
	        
	            	dx = 2;
	        	}
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
