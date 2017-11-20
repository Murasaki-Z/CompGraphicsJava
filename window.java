package graphics1;

import javax.swing.JFrame;
public class window {

	public static void main(String[] args) {
		
		JFrame window1 = new JFrame();
		window1.setTitle("title");
		window1.setSize(1500,1500);
		
		DDA d2 = new DDA();
		window1.setVisible(true);
		window1.add(d2);
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		DDAtriangle dt = new DDAtriangle();
		window1.setVisible(true);
		window1.add(dt);
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
