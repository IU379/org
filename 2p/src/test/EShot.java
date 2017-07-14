package test;


import javax.swing.ImageIcon;

public class EShot extends Sprite {
	//enemy bullet sprite
    private final String eshotImg = "C:\\Users\\IGMAdmin\\Desktop\\game\\game\\images\\ebullet.png";
    //spawn distance away from enemy
    private final int eH_SPACE = 0;
    private final int eV_SPACE = 1;

    public EShot() {
    }

    public EShot(int x2, int y2) {

        initShot(x2, y2);
    }
    //spawn enemy bullet
    private void initShot(int x2, int y2) {

        ImageIcon ii = new ImageIcon(eshotImg);
        setImage(ii.getImage());
        
        setX(x2 - eH_SPACE);
        setY(y2 + eV_SPACE);
    }
}