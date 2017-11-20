package graphics1;

import javax.swing.JFrame;

public class Window5 {
	public static void main(String[] args) {
	JFrame win4 = new JFrame();
	win4.setSize(1500,1500);
	win4.setTitle("Title");
	win4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	MidptCircle t1= new MidptCircle();
	win4.add(t1);
	win4.setVisible(true);
	}

}
