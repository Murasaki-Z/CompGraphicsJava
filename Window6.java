package graphics1;

import javax.swing.JFrame;

public class Window6 {
	public static void main(String[] args)
	{
		JFrame win6 = new JFrame();
		win6.setTitle("Rotation");
		win6.setSize(1500,1500);
		win6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Rot1 r1 = new Rot1();
		win6.add(r1);
		
		/*transline t1 = new transline();
		win6.add(r1);
		
		Bresencircle b1 = new Bresencircle();
		win6.add(b1);*/
		win6.setVisible(true);

		
	}

}
