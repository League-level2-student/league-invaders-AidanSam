import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;

public class LeagueInvaders {
	
	public static void main(String[] args) {
new LeagueInvaders().setup();

	}
	
JFrame frame;

public static final int WIDTH = 500;
public static final int HEIGHT = 800;
LeagueInvaders(){
	frame = new JFrame();
	
}
void setup() {
	
    
	GamePanel panel = new GamePanel();
	frame.add(panel);
	frame.addKeyListener(panel);
	frame.setVisible(true);
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}



}
