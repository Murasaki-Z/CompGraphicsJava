package graphics1;

import javax.swing.JFrame;

public class Window3 {
	public static void main(String[] args)
	{
		
	
	JFrame win3 = new JFrame();
	
	win3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	win3.setTitle("Hello");
	win3.setSize(1500,1500);
	
	
	Bresencircle b1 = new Bresencircle();
	win3.add(b1);
	win3.setVisible(true);
	
	

}
}