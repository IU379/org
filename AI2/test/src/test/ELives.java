package test;

import javax.swing.ImageIcon;

	public class ELives extends Sprite implements Pins {
		
			//lives ui spawn and vars
			private final int EHART_Y = 10;
			private final int EHART_X = 760;
			public static int enemylives = 3;
		
			//lives sprite
			private final String E4lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\4.png";
			private final String E3lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\3.png";
			private final String E2lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\2.png";
			private final String E1lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\1.png";
			private final String E0lives = "C:\\Users\\IGMAdmin\\Desktop\\Workspace\\2p\\images\\0.png";

		public ELives() {
			initELives();
		}

		void initELives() {
			
			switch(enemylives) {
				
				case 3:
					
					ImageIcon ii = new ImageIcon(E4lives);
					setImage(ii.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 2:
					
					ImageIcon ii1 = new ImageIcon(E3lives);
					setImage(ii1.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 1:
					
					ImageIcon ii11 = new ImageIcon(E2lives);
					setImage(ii11.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
			        break;
			        
				case 0:
					
					ImageIcon ii111 = new ImageIcon(E1lives);
					setImage(ii111.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
					break;
				
			}
				if (enemylives <= -1) {
					ImageIcon ii1111 = new ImageIcon(E0lives);
					setImage(ii1111.getImage());
					setX(EHART_X);
			        setY(EHART_Y);
				}			
		}
}
