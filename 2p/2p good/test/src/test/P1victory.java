package test;

import javax.swing.ImageIcon;

	public class P1victory extends Sprite implements Pins {
		
		private final int P1VICTORY_Y = 250;
		private final int P1VICTORY_X = 100;
		private final String p1victory = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\8bg.png";
	
		public P1victory() {
			initBg();
		}

		private void initBg() {
			ImageIcon ii = new ImageIcon(p1victory);

	        setImage(ii.getImage());
	        setX(P1VICTORY_X);
	        setY(P1VICTORY_Y);
			
		}
	}

	
