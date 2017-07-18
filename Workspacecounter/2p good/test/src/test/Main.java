package test;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//starts game
import javax.swing.JPanel;
public class Main extends JFrame implements Pins {
/*score
	
	JFrame frame = new JFrame("Test");

	JPanel panel = new JPanel();
	JLabel label = new JLabel("test");

	panel.add(label);

	frame.add(panel);
	frame.setVisible(true);
	
*/
    public Main() {

        initUI();
    }


	private void initUI() {

        add(new Board());
        setTitle("Spayship");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}