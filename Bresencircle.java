package graphics1;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Bresencircle extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		draw(500,500,300,g2);
		
	}
	void drawCircle(int xc,int yc,int x,int y,Graphics2D g)
	{
		int width = 1, height = 2;
		g.drawOval(xc+x, yc+y, width, height);
		g.drawOval(xc-x, yc-y, width, height);
		g.drawOval(xc+x, yc-y, width, height);
		g.drawOval(xc-x, yc+y, width, height);
		
		g.drawOval(xc+y, yc-x, width, height);
		g.drawOval(xc-y, yc+x, width, height);
		g.drawOval(xc+y, yc+x, width, height);
		g.drawOval(xc-y, yc-x, width, height);

	}
	void draw(int xc,int yc, int r, Graphics2D g)
	{
		int x = 0, y = r, d = 0;
		//int width = 2, height = 2;
		
		
		d = 3 - 2*r;
		
		
		while(y >= x)
		{
			drawCircle(xc,yc,x,y,g);
			x++;
			
			if(d>0)
			{
				y--;
				d += 4*(x-y) + 10;
			}
			else
				d = d + 4 * x + 6;
			drawCircle(xc,yc,x,y,g);
		}
		
	}

}
