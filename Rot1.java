package graphics1;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rot1 extends JComponent{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x1 = 100, x2 = 200, y1 = 200, y2 = 250,xs,ys;
		int xpiv = 5, ypiv = 0;
		float theta = 90;
		
		theta = (float) (theta * Math.PI/180);
		
		g2.drawLine(x1, y1, x2, y2);
		
		g2.setColor(Color.BLUE);
		
		xs = x1 - xpiv;
		ys = y1 - ypiv;
		
		x1 = (int) (xpiv + ((xs * Math.cos(theta))- (ys * Math.sin(theta))));
		y1 = (int) (xpiv + ((xs * Math.sin(theta))+ (ys* Math.cos(theta))));
		
		g2.drawLine(x1, y1, x2, y2);

		
		
		
	}
}
