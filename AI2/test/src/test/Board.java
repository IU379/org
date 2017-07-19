package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;



import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements Runnable, Pins {

	//variables
    private Dimension d;
    private static Player player;
    private EShot eshot;
    private Shot shot;
    private static Enemy enemy;
    private ELives elives;
    private PLives plives;
    private Bg bg;
    private P2victory p2victory;
    private P1victory p1victory;
    private static boolean rundrawcycle = true;
    static boolean ingame = false;
    //public static String openmsg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\AI2\\StartAI.vbs";
    restart r = new restart(); 

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
        elives = new ELives();
        plives = new PLives();
        bg = new Bg();
        p1victory = new P1victory();
        p2victory = new P2victory();
        //put ingame
        if (animator == null || !ingame) {

            animator = new Thread(this);
            animator.start();
        }
    }
    //makes bg
    public void drawBg(Graphics g) {  
             g.drawImage(bg.getImage(), bg.getX(), bg.getY(), this);  
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
    //draws enemy lives ui
    public void drawELives(Graphics g) {

        if (elives.isVisible()) {
            
            g.drawImage(elives.getImage(), elives.getX(), elives.getY(), this);
        }
    }
    //draws enemy lives ui
    public void drawPLives(Graphics g) {

        if (plives.isVisible()) {
            
            g.drawImage(plives.getImage(), plives.getX(), plives.getY(), this);
        }
    }
    public void drawP2victory(Graphics g) {
    	if (p2victory.isVisible()) {
    		
    		g.drawImage(p2victory.getImage(), p2victory.getX(), p2victory.getY(), this);
    	}
    }
    public void drawP1victory(Graphics g) {
    	if (p1victory.isVisible()) {
    		
    		g.drawImage(p1victory.getImage(), p1victory.getX(), p1victory.getY(), this);
    	}
    }
    @Override
    //makes bg
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int delay = (int)(Math.random() * 100000);
        ActionListener iDoNothing = new ActionListener(){
        	public void actionPerformed(ActionEvent evt){
        		enemy.act();
        	}
        };
        Timer t = new Timer(delay, iDoNothing);
        t.start();
        
        
        g.setColor(Color.black);
        g.fillRect(0, 0, d.width, d.height);

        if (rundrawcycle) {
        	//draws players and bullets
        	elives.initELives();
            plives.initPLives();
            enemy.enemyExplode();
            player.playerExplode();
            g.drawLine(0, GROUND, BOARD_WIDTH, GROUND);
            drawBg(g);
            drawEShot(g);
            drawPlayer(g);
            drawELives(g);
            drawPLives(g);
            drawShot(g);
            drawEnemy(g);

            if (!ingame) {
            	addKeyListener(r);
            }
            
            if (PLives.playerlives <= -1) {
            	drawP2victory(g);
            	ingame = false;
            	addKeyListener(r);
            	
            }
            if (ELives.enemylives <= -1) {
            	drawP1victory(g);
            	ingame = false;
            	addKeyListener(r);
            }
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    
	// player's animation cycle
    public void animationCycle() {

        // player
        player.act();
        
        //System.err.println("world pandemics");
        
        // shot
        if (shot.isVisible()) {

            int shotX = shot.getX();
            int shotY = shot.getY();
            int y = shot.getY();
            y -= 4;

            if (y < 0) {
                shot.die();
            } else {
                shot.setY(y);
            }

				int enemyX = enemy.getX();
                int enemyY = enemy.getY();

                if (enemy.isVisible() && shot.isVisible()) {
                    if (shotX >= (enemyX) && shotX <= (enemyX + ENEMY_WIDTH) && shotY >= (enemyY) && shotY <= (enemyY + ENEMY_HEIGHT) || shotX + 64 >= (enemyX) && shotX + 64 <= (enemyX + ENEMY_WIDTH) && shotY >= (enemyY) && shotY <= (enemyY + ENEMY_HEIGHT) || shotX + 32 >= (enemyX) && shotX + 32 <= (enemyX + ENEMY_WIDTH) && shotY >= (enemyY) && shotY <= (enemyY + ENEMY_HEIGHT)) {
                        shot.die();
                        elives.enemylives -=1;
                    }
                }
        }
    }
   
    public void enemyanimationcycle() {
    	
    	//enemy
        enemy.act();
        if (ingame) {
        	int x2 = enemy.getX();
        	int y2 = enemy.getY();
    		if (!eshot.isVisible()) {
    				eshot = new EShot(x2, y2);
    				}
    		}
        // it broke
        //enemy shot
        if (eshot.isVisible()) {

        	int eshotX = eshot.getX();
        	int eshotY = eshot.getY();

        	int y2 = eshot.getY();
        	y2 += 4;

        	if (y2 > 800) {
        		eshot.die();
        	} else {
                eshot.setY(y2);
        	}
        	
        	int playerX = player.getX();
            int playerY = player.getY();

            if (enemy.isVisible() && eshot.isVisible()) {
                if (eshotX >= (playerX) && eshotX <= (playerX + PLAYER_WIDTH) && eshotY >= (playerY) && eshotY <= (playerY + PLAYER_HEIGHT) || eshotX + 48 >= (playerX) && eshotX + 48 <= (playerX + PLAYER_WIDTH) && eshotY >= (playerY) && eshotY <= (playerY + PLAYER_HEIGHT)) {
                    eshot.die();
                    plives.playerlives -=1;
                }
            }
        }
    }
    @Override
    //main run method
    public void run() {
        long beforeTime, timeDiff, sleep;
        File file = new File("C:\\Users\\IGMAdmin\\Desktop\\Workspace\\AI2\\StartAI.vbs");
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()){
			try {
				desktop.open(file);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }

        beforeTime = System.currentTimeMillis();
        
        while (rundrawcycle) {
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
    }
	
    //shooting keys
    private class TAdapter extends KeyAdapter {
    	
    
        @Override
        public void keyReleased(KeyEvent e) {

            player.keyReleased(e);
        }

        @Override
        //generate bullets
        public void keyPressed(KeyEvent e) {

            player.keyPressed(e);

            int x = player.getX();
            int y = player.getY();
            


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

            
            	
        }
        
    	
    }
    private class restart extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            //player
            if (key == KeyEvent.VK_R) {
            		ingame = true;
            		plives.playerlives = 3;
            		elives.enemylives = 3;
            		removeKeyListener(r);
            		player.setX(player.START_X);
            		player.setY(player.START_Y);
            		enemy.setX(enemy.ESTART_X);
            		enemy.setY(enemy.ESTART_Y);
            		
            }
        }
	}
}