package graphics1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Bresenham extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(new Color(0,0,255));
		//g2.drawLine(400, 100, 200, 500);
		
		draw(100,200,201,501,g2);
		draw(100,200,202,502,g2);
		draw(100,200,202,502,g2);
		draw(100,200,203,503,g2);
		draw(100,200,204,504,g2);
		draw(100,200,200,500,g2);
		
		
	}
	void draw(int x1,int x2,int y1,int y2,Graphics2D g) {
		int x = x1, y = y1;
		int m = 0, sloerr = 0, dx = 0, dy = 0;
		int width = 1, height = 1;
		
		dx = x2 - x1;
		dy = y2 - y1;
		
		//g.setColor(Color.GREEN);
		m = 2 * dy;
		sloerr = m - dx;
		
		for(x=x1;x<x2;x++)
		{
			
			g.drawOval(x, y, width, height);
			
			sloerr = sloerr + m;
			
			if(sloerr >= 0)
			{
				y++;
				sloerr = sloerr - (2*dx);
				
			}
		}
		
		
	}
	

}
