package graphics1;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.util.Scanner;

public class translation extends JComponent{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		int n = 4, i = 0;
		int tx = 3, ty = 3;
		
		int[] cox = new int[] {50,100,100,50};
		int[] coy = new int[] {50,50,100,100};
		
		for(i=0;i<(n-1);i++)
		{
			
			g2.drawLine(cox[i],cox[i+1],coy[i],coy[i+1]);
		}
		g2.drawLine(cox[n-1],cox[0],coy[n-1],coy[0]);
		
		for(i=0;i<n;i++)
		{
			cox[i] *= tx;
			coy[i] *= ty;
		}

		for(i=0;i<(n-1);i++)
		{
			
			draw(cox[i],cox[i+1],coy[i],coy[i+1],g2);
		}
		draw(cox[n-1],cox[0],coy[n-1],coy[0],g2);
		
		
	}
	void draw(int x1,int x2,int y1,int y2,Graphics2D g)
	{
		int temp = 0, dx = 0, dy = 0, steps = 0, xin = 0, yin = 0, x = x1, y = y1, p = 0, count = 0;
		int width = 1, height = 5;
		
		x1 = x1 + 50;
		y1 = 700 - y1;
		x2 = 50 + x2;
		y2 = 700 - y2;
		
		if(x2 > x1)
		{//Swap x1 x2 and y1 y2
			temp = x1;
			x1 = x2;
			x2 = temp;
			
			temp = y1;
			y1 = y2; 
			y2 = temp;
			
		}
		//Bresenham
		
		if(Math.abs(dx)>Math.abs(dy))
		{
		count = Math.abs(dx);	
		dx = x2 - x1; 
		dy = y2 - y1; 
		
		p = 2 * Math.abs(dx) - Math.abs(dy);
		
		g.drawOval(x, y, width, height);
		
		while(count>0)
		{
			x++;
			
		}
		
		
		}
		
		
		/*dx = (x2 - x1);
				if(dx==0)
					dx += 1;
		dy = (y2 - y1);
				if(dy == 0)
					dy +=1;
				
		
		if(Math.abs(dx)>Math.abs(dy))
			steps = dx;
		else
			steps = dy;
		
		xin = dx/steps;
		yin = dy/steps;
		
		x = x1;
		y = y1;
		
		g.drawOval(x, y, width, height);
		
		for(temp = 0; temp <= steps ; temp++)
		{
			x = x + xin;
			y = y + yin;
			
			g.drawOval(x, y, width, height);
		}
		*/
		
	}
	
	

}
