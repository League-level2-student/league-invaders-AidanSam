import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer frameDraw;
	Font titleFont;
	Font startFont;
	Font ruleFont;

		    final int MENU = 0;
		    final int GAME = 1;
		    final int END = 2;
	    int currentState = MENU;
	    GamePanel(){
	        frameDraw = new Timer(1000/60,this);
	        frameDraw.start();
	    	titleFont = new Font("Arial", Font.PLAIN, 32);
	    	startFont = new Font("Arial", Font.PLAIN, 18);
	    	ruleFont = new Font("Arial", Font.PLAIN, 18);
	    }
		public void paintComponent(Graphics g){
			if(currentState == MENU){
			    drawMenuState(g);
			}else if(currentState == GAME){
			    drawGameState(g);
			}else if(currentState == END){
			    drawEndState(g);
			}
	
		}
		void updateMenuState() {  }
		void updateGameState() {  }
		void updateEndState()  {  }
		void drawMenuState(Graphics g) { 
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
			g.setFont(titleFont);
			g.setColor(Color.YELLOW);
			g.drawString("LEAGUE INVADERS", 100, 50);
			g.setFont(startFont);
			g.setColor(Color.YELLOW);
			g.drawString("Press ENTER to start", 150, 200);
			g.setFont(titleFont);
			g.setColor(Color.YELLOW);
			g.drawString("Press SPACE for instructions", 50, 400);
		}
		void drawGameState(Graphics g) {  }
		void drawEndState(Graphics g)  {  }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(currentState == MENU){
			    updateMenuState();
			}else if(currentState == GAME){
			    updateGameState();
			}else if(currentState == END){
			    updateEndState();
			}
			repaint();
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			    if (currentState == END) {
			        currentState = MENU;
			    } else {
			        currentState++;
			    }
			}   

		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
