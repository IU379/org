package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Board extends JPanel implements Runnable, Pins {

	//variables
    private Dimension d;
    private Player player;
    private EShot eshot;
    private Shot shot;
    private Enemy enemy;

    private boolean ingame = true;

    private Thread animator;

    public Board() {

        initBoard();
    }
    //sets dimensions, shoot keys, and dubble buffer
    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        d = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
        setBackground(Color.black);

        gameInit();
        setDoubleBuffered(true);
    }
    
    @Override
    public void addNotify() {

        super.addNotify();
        gameInit();
    }
    //get other files involved
    public void gameInit() {

    	enemy = new Enemy();
        player = new Player();
        shot = new Shot();
        eshot = new EShot();
        //put ingame
        if (animator == null || !ingame) {

            animator = new Thread(this);
            animator.start();
        }
    }
    //makes player here
    public void drawPlayer(Graphics g) {

        if (player.isVisible()) {
            
            g.drawImage(player.getImage(), player.getX(), player.getY(), this);
        }

        if (player.isDying()) {

            player.die();
            ingame = false;
        }
    }
    //makes enemy here
    public void drawEnemy(Graphics g) {
    	if (enemy.isVisible()) {
    		g.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), this);
    	}
    	
    	if (enemy.isDying()) {
    		enemy.die();
    	}
    }
    //draws player bullet
    public void drawShot(Graphics g) {

        if (shot.isVisible()) {
            
            g.drawImage(shot.getImage(), shot.getX(), shot.getY(), this);
        }
    }
    //draws enemy bullet
    public void drawEShot(Graphics g) {

        if (eshot.isVisible()) {
            
            g.drawImage(eshot.getImage(), eshot.getX(), eshot.getY(), this);
        }
    }

    @Override
    //makes bg
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(0, 0, d.width, d.height);
        g.setColor(Color.black);

        if (ingame) {

            g.drawLine(0, GROUND, BOARD_WIDTH, GROUND);
            drawPlayer(g);
            drawShot(g);
            drawEnemy(g);
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void gameOver() {

        Graphics g = this.getGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        g.setColor(new Color(0, 32, 48));
        g.fillRect(50, BOARD_WIDTH / 2 - 30, BOARD_WIDTH - 100, 50);
        g.setColor(Color.black);
        g.drawRect(50, BOARD_WIDTH / 2 - 30, BOARD_WIDTH - 100, 50);
    }
    // player's animation cycle
    public void animationCycle() {

        // player
        player.act();
        
        //System.err.println("world pandemics");
        
        // shot
        if (shot.isVisible()) {

            //int shotX = shot.getX();
            //int shotY = shot.getY();

            int y = shot.getY();
            y -= 4;

            if (y < 0) {
                shot.die();
            } else {
                shot.setY(y);
            }
        }     
    }
   
    public void enemyanimationcycle() {
    	
    	//enemy
        enemy.act();
        
        // it broke
        //enemy shot
        if (eshot.isVisible()) {

        	//int eshotX = eshot.getX();
        	//int eshotY = eshot.getY();

        	int y2 = eshot.getY();
        	y2 += 4;

        	if (y2 > 800) {
        		eshot.die();
        	} else {
                eshot.setY(y2);
        	}
        }
    }
    @Override
    //main run method
    public void run() {

        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();
        
        while (ingame) {
        	
        	//clear screen and repaint
            repaint();
            animationCycle();
            enemyanimationcycle();

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }
            //?
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            
            beforeTime = System.currentTimeMillis();
        }

        gameOver();
    }
    //shooting keys
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {

            player.keyReleased(e);
            enemy.keyReleased(e);
        }

        @Override
        //generate bullets
        public void keyPressed(KeyEvent e) {

            player.keyPressed(e);
            enemy.keyPressed(e);

            int x = player.getX();
            int y = player.getY();
            
            int x2 = enemy.getX();
            int y2 = enemy.getY();

            int key = e.getKeyCode();
            //player
            if (key == KeyEvent.VK_NUMPAD0 || key == KeyEvent.VK_INSERT) {
                if (ingame) {
                    if (!shot.isVisible()) {
                        shot = new Shot(x, y);
                    }
                }
            }
            //enemy
            if (key == KeyEvent.VK_SPACE) {
                if (ingame) {
                    if (!eshot.isVisible()) {
                        eshot = new EShot(x2, y2);
                    }
                }
            }
        }
    }
}