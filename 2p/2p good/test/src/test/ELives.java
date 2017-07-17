package test;

import javax.swing.ImageIcon;

	public class ELives extends Sprite implements Pins {
		
			//lives ui spawn and vars
			private final int EHART_Y = 10;
			private final int EHART_X = 760;
			public int elives = 3;
		
			//lives sprite
			private final String E3lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\3hart.png";
			private final String E2lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\2hart.png";
			private final String E1lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\1hart.png";
			private final String E0lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p good\\images\\nopehart.png";

		public ELives() {
			initELives();
		}

		private void initELives() {
			
			switch(elives) {
				
				case 3:
					
					ImageIcon ii = new ImageIcon(E3lives);
					setImage(ii.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 2:
					
					ImageIcon ii1 = new ImageIcon(E2lives);
					setImage(ii1.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 1:
					
					ImageIcon ii11 = new ImageIcon(E1lives);
					setImage(ii11.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 0:
					
					ImageIcon ii111 = new ImageIcon(E0lives);
					setImage(ii111.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
					break;
			}
			
		}
}
