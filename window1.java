package graphics1;

import javax.swing.JFrame;

public class window1 {

	public static void main(String[] args) {

		JFrame win1 = new JFrame();
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setSize(1500, 2000);
		win1.setTitle("Hello World");
		
		
		Bresenham b1 = new Bresenham();
		win1.add(b1);
		win1.setVisible(true);
	}

}
