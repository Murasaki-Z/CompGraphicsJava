package graphics1;

import javax.swing.JFrame;

public class Window4 {
	public static void main(String[] args) {
	JFrame win4 = new JFrame();
	win4.setSize(1500,1500);
	win4.setTitle("Transline");
	win4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	/*transpt t1 = new transpt();
	win4.add(t1);
	win4.setVisible(true);
	}*/
	
	transline t2 = new transline();
	win4.add(t2);
	win4.setVisible(true);
	}
}
