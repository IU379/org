package test;


import javax.swing.ImageIcon;

public class Shot extends Sprite {
	//img location
    private final String shotImg = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\bullet.png";
    //spawn distance from player
    private final int H_SPACE = 0;
    private final int V_SPACE = 1;

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }
    //spawn bullet
    private void initShot(int x, int y) {

        ImageIcon ii = new ImageIcon(shotImg);
        setImage(ii.getImage());
        
        setX(x - H_SPACE);
        setY(y + V_SPACE);
    }
}