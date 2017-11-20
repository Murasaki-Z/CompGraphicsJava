package graphics1;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class DDAtriangle extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		draw(400,100,200,500,g2);
		draw(200,400,300,400,g2);
		draw(100,400,200,400,g2);
	}
	void draw(int x1, int x2, int y1, int y2, Graphics2D g)
	{
		int dx, dy, steps, x = x1, y = y1,xin,yin,width = 2,height = 2;
		
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		
		if(dx > dy)
			steps = Math.abs(dx);
		else
			steps = Math.abs(dy);
		
		xin = dx/steps;
		yin = dy/steps;
		
		g.drawOval(x, y, width, height);
		
		for(int i=0; i<=steps;i++)
		{
			x = x + xin;
			y = y + yin;
			
			g.drawOval(x, y, width, height);
		}
		
	}

}
