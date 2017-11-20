package graphics1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
//import javax.swing.JFrame;

public class DDA extends JComponent{
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Square
		draw(100,500,100,400,g2);
		draw(100,400,100,500,g2);
		draw(100,500,500,800,g2);
		draw(500,800,100,500,g2);
		
		
	}
	
	 void draw(int x1,int x2, int y1, int y2,Graphics2D g)
	{
		int width = 5, height = 5;
		int dx = 0, dy = 0, steps = 0, xin = 0, yin = 0, x = 0, y = 0,i = 0;
		
		dx = x2 - x1;
		dy = y2 - y1;
		
		if(Math.abs(dx) > Math.abs(dy))
			steps = Math.abs(dx);
		else 
			steps = Math.abs(dy);
		xin = dx / steps;
		yin = dy / steps;
		
		x = x1;
		y = y1; 
		
		g.setColor(Color.BLUE);
		g.drawOval(x, y, width, height);
		
		for(i = 0; i < steps; i++)
		{
			x = x + xin;
			y = y + yin;
			g.drawOval(x, y, width, height);
		}
		
			
		
	}
	
	

}
