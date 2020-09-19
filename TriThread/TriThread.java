import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;

public class TriThread extends Applet implements Runnable
{
	Date d;					//for date and time
	private String display;			//for word
	private int x1,y1,flag;			//for word
	int x2 = 100;				//for Ball
	int y2 = 100;				//for Ball
	int xDirection = 1;			//for Ball
	int yDirection = 1;			//for Ball
	int width = 400;			//for Ball
	int height = 300;			//for Ball
	Thread t;

	public void init()
	{
		t = new Thread(this); 
		t.start();
		d = new Date();
		display = "Marc Medhat";
		x1 = 200;
		y1 = 200;
		flag = 1;
		setSize(width,height);
	}
	public void update()
	{
		x1 = x1 + 10 * flag;
		if (x1 > getWidth())
		{
			x1 = 0;
			flag = 0;
		}
		if (x1 < getWidth())
		{
			flag = 1;
		}	
	}
	public void run()
	{
		while(true)
		{
			d = new Date();
			repaint();
			update();
			x2 = x2 + xDirection;
			y2 = y2 + yDirection;
			if(x2 <= 0 || x2 + 40 >= getWidth())
			{
				xDirection *= -1;
			}
			if(y2 <= 0 || y2 + 40 >= getHeight())
			{
				yDirection *= -1;
			}
			try
			{
				Thread.sleep(50);			
			}						//for All
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}	
	}
	public void paint(Graphics g)
	{
		g.drawString(d.toString(),50,100);		//for date and time
		g.drawString(display,x1,y1);
		g.setColor(Color.red);				//for Ball
		g.fillOval(x2,y2,40,40);			//for Ball
	}
}
