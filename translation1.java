package graphics1;

import java.awt.*;
import javax.swing.*;

class Gcanvas extends JPanel {

int x,y,x1,x2,y1,y2,p,temp,count,count1,dx,dy,scalex,scaley;
int cox[],coy[];

public void drawline(int cox1,int coy1,int cox2,int coy2,Graphics g){
	//g.drawLine(50,50,700,50);
	//g.drawLine(50,50,50,700);
	//g.drawLine(700,50,700,700);
	//g.drawLine(50,700,700,700);
	
	x1=cox1;
	y1=coy1;
	x2=cox2;
	y2=coy2;
	
	x1=x1+50;
	y1=700-y1;
	x2=50+x2;
	y2=700-y2;
	
	if(x1>x2)
	{
		temp=x1;
		x1=x2;
		x2=temp;
		temp=y1;
		y1=y2;
		y2=temp;
	}
	
	dx=x2-x1;
	dy=y2-y1;
	
	if(Math.abs(dx)>Math.abs(dy))
	{
	count=Math.abs(dx);
	p=2*Math.abs(dy)-Math.abs(dx);
	x=x1;
	y=y1;
	
	g.drawLine(x,y,x,y);
	while(count>0)
	{
			x++;
			if(p<0)
			{
				p=p+2*Math.abs(dy);
			}
			else
			{
				if((y1-y2)>=0)
					y--;
				else
					y++;
				p=p+2*Math.abs(dy)-2*Math.abs(dx);
			}
			g.drawLine(x,y,x,y);
			count--;
	}
	}
	else
	{
	count=Math.abs(dy);
	p=2*Math.abs(dx)-Math.abs(dy);
	x=x1;
	y=y1;
	
	g.drawLine(x,y,x,y);
	while(count>0)
	{
			if((y1-y2)>=0)
					y--;
				else
					y++;
			if(p<0)
			{
				p=p+2*Math.abs(dx);
			}
			else
			{
				x++;
				p=p+2*Math.abs(dx)-2*Math.abs(dy);
			}
			g.drawLine(x,y,x,y);
			count--;
	}
	}
}
	public void paintComponent(Graphics g)
	{
		int number=4;
		//Array Declaration also can do like int[] coy = new int[]{50,100,100,50};
		cox=new int[number];//x = 50,100,100,50
		coy=new int[number];//y = 50,50,100,100
		//COX - Cordinate of x array, coy - similar for y
		cox[0]=50;		cox[1]=100; 		cox[2]=100; 		cox[3]=50;



		coy[0]=50;
		coy[1]=50;
		coy[2]=100;
		coy[3]=100;
		
		for(count1=0;count1<number-1/*Size - 1*/;count1++)
		{
			drawline(cox[count1],coy[count1],cox[count1+1],coy[count1+1],g);//dL(x1,y1,x2,y2)
		}
		drawline(cox[number-1],coy[number-1],cox[0],coy[0],g); //dL(cox[3],coy[3],cox[0],cox[0];
		
		//tx and ty
		scalex=3;
		scaley=3;
		
		for(count1=0;count1<number;count1++)
		{
			cox[count1]*=scalex;
			coy[count1]*=scaley;
		}
		//
		
		for(count1=0;count1<number-1;count1++)
		{
			drawline(cox[count1],coy[count1],cox[count1+1],coy[count1+1],g);
		}
		drawline(cox[number-1],coy[number-1],cox[0],coy[0],g);
	}
	


}
class translation1 extends JFrame
{

	translation1()
	{
		setTitle("Anand");
		//setLocation(new java.awt.Point(0, 30));
		add(new Gcanvas());
		setSize(750,750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String arg[])
{
try
{
	translation1 a=new translation1();
	a.setVisible(true);
}
catch (Exception e) {
e.printStackTrace();
}
}

}