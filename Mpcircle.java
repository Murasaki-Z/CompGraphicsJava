package graphics1;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Mpcircle extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		draw(500,500,50,g2);
		//draw(500,500,199,g2);
		//draw(500,500,198,g2);
		g2.setColor(Color.BLUE);
		draw(500,500,50,g2);
		
	}
	void draw(int xc,int yc,int r, Graphics2D g)
	{
		int x = r,y = 0;
		int p = 1 - r;
		int width = 1, height = 1;
		
		g.drawOval(x + xc, y + yc, width, height);
		
		if(r>0)
		{
			g.drawOval(x+xc, -y+yc, width, height);
			g.drawOval(y+yc,-x+xc, width, height);
			g.drawOval(-y+yc,x+xc,width,height);
		}
		
		while(x>y)
		{
			y++;
			
			if( p <= 0 ) 
				p = p + 2*y + 1;
			else
			{
				x--;
				p = p + 2*y - 2*x + 1;
			}
			
			if(x<y)
				break;
			
			g.drawOval(x + xc, y + yc, width, height);
			g.drawOval(-x + xc, y + yc, width, height);
			g.drawOval(x+xc, -y+yc, width, height);
			g.drawOval(-x+xc, -y+yc, width, height);
			
			if(x != y)
			{
				g.drawOval(y+yc, x+xc, width, height);
				g.drawOval(y+yc, -x+xc, width, height);
				g.drawOval(-y+yc, x+xc, width, height);
				g.drawOval(-y+yc, -x+xc, width, height);

				
			}
				
			
		}
		
		
	}

}
