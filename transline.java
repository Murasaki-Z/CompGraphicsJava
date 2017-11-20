package graphics1;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class transline extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int tx = 0, ty = 0;
		
		//draw Square, no translation
		draw(750,500,350,350,g2,tx,ty);
		draw(750,750,350,550,g2,tx,ty);
		draw(500,750,550,550,g2,tx,ty);
		draw(500,500,350,550,g2,tx,ty);
		
		
		tx = 2; 
		ty = 2;
		g2.setColor(Color.BLUE);
//translated square
		draw(750,500,350,350,g2,tx,ty);
		draw(750,750,350,550,g2,tx,ty);
		draw(500,750,550,550,g2,tx,ty);
		draw(500,500,350,550,g2,tx,ty);
		
		
		
		
		
		
	}
	void draw(int x1,int x2, int y1, int y2, Graphics2D g, int tx,int ty)
	{
		//DDA Algo
		int dx = x2 - x1, dy = y2 - y1,x = x1+tx, y = y1+ty;
		int width = 1, height = 2;
		int i = 0, steps = 0;
		int xin, yin;
		
		if(Math.abs(dx)>Math.abs(dy))
			steps = Math.abs(dx);
		else
			steps = Math.abs(dy);
		
		xin = dx/  steps;
		yin = dy/ steps;
		
		g.drawOval(x, y, width, height);
		
		for( i = 0 ; i <= steps ; i++ )
		{
			x = x + (int)xin;
			y = y + (int)yin;
			
			g.drawOval(x, y, width, height);
		}
		
		
		
		
		
	}

}
