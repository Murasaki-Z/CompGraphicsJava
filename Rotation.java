package graphics1;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rotation extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		draw(500,500,600,400,g2,false);
		
		
		draw(500,500,600,400,g2,true);
		
	}
	void draw(int x1,int x2, int y1, int y2, Graphics2D g,Boolean flag) {
		int dx = 0, dy = 0, steps = 0, i = 0, xin = 0, yin = 0, xr=0, yr=0;
		int width = 2, height = 28;
		float theta = 10;
		
		theta = theta*(float) (Math.PI/180);
		
		if(flag)
		
		{
			xr =  ((int)(x1*Math.cos(theta) - (y1*Math.sin(theta))));
			x1 = xr;
			y1 = yr;
			g.setColor(Color.BLUE);
			int x = x1, y = y1;
			
			dx = x2 - x1;
			dy = y2 - y1;
			
			if(Math.abs(dx)>Math.abs(dy))
				steps = Math.abs(dx);
			else
				steps = Math.abs(dy);
			
			xin = dx/ steps;
			yin = dy/ steps;
			
		    g.drawOval(x, y, width, height);
			for(i=0;i<=steps;i++)
			{
				
				x = x + xin;
				y = y + yin;
				
				g.drawOval(x, y, width, height);
				
			}
			
			
		}
		
		
		else {
		int x = x1, y = y1;
		
		dx = x2 - x1;
		dy = y2 - y1;
		
		if(Math.abs(dx)>Math.abs(dy))
			steps = Math.abs(dx);
		else
			steps = Math.abs(dy);
		
		xin = dx/ steps;
		yin = dy/ steps;
		
	    g.drawOval(x, y, width, height);
		for(i=0;i<=steps;i++)
		{
			
			x = x + xin;
			y = y + yin;
			
			g.drawOval(x, y, width, height);
			
		}
		
		}
	}

}
