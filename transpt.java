package graphics1;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class transpt extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		int x = 250,y=250, width = 2, height = 5;
		int tx = 50, ty = 50;
		
		g2.drawOval(x, y, width, height);
		
		x = x + tx;
		y = y + ty;
		
		g2.drawOval(x,y,width, height);
		
	}

}
