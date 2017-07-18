package test;

	import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

	public class Enemy extends Sprite implements Pins {
		//enemy spawn location
		private final int ESTART_Y = 50;
		private final int ESTART_X = 270;
		
		//enemy sprite
		private final String enemyImg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\UFO.png";
		private int ewidth;
		
		public Enemy() {

        initEnemy();
    }
		//spawn enemy and set up hitbox
    private void initEnemy() {
        
        ImageIcon ii = new ImageIcon(enemyImg);
        ewidth = 28;
        setImage(ii.getImage());
        setX(ESTART_X);
        setY(ESTART_Y);
    }
    //boundaries and movement
    public void act() {
        double rand = Math.random();
        if (rand >= 0.5) {
        	x += -10;
        	try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        if (rand < 0.5) {
        	x -= -10;
        	try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        //x += (Math.random() * 4) -2;
        
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

        if (key == KeyEvent.VK_A) {
        
            dx = -2;
        }

        if (key == KeyEvent.VK_D) {
        
            dx = 2;
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


