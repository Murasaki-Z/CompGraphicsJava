package graphics1;

import javax.swing.JFrame;

public class window2 {
	public static void main(String[] args) {

		JFrame win2 = new JFrame();
		win2.setTitle("Hello");
		win2.setSize(1500,1500);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		Mpcircle m1 = new Mpcircle();
		win2.add(m1);
		win2.setVisible(true);
	}

}
