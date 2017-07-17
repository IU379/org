package test;

import javax.swing.ImageIcon;

	public class PLives extends Sprite implements Pins {
		
			//lives ui spawn and vars
			private final int EHART_Y = 730;
			private final int EHART_X = 4;
			public static int playerlives = 3;
		
			//lives sprite
			private final String P3lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\3hart.png";
			private final String P2lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\2hart.png";
			private final String P1lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\1hart.png";
			private final String P0lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\nopehart.png";

		public PLives() {
			initELives();
		}

		private void initELives() {
			
			switch(playerlives) {
				
				case 3:
					
					ImageIcon ii = new ImageIcon(P3lives);
					setImage(ii.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 2:
					
					ImageIcon ii1 = new ImageIcon(P2lives);
					setImage(ii1.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 1:
					
					ImageIcon ii11 = new ImageIcon(P1lives);
					setImage(ii11.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 0:
					
					ImageIcon ii111 = new ImageIcon(P0lives);
					setImage(ii111.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
					break;
					
				case -1:
					
					Board.P2win();
					ImageIcon ii1111 = new ImageIcon(P0lives);
					setImage(ii1111.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
					break;
			}
			
		}
}
