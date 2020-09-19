import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class ball extends Applet implements Runnable 
{

	int x,y;       
	int incx,incy; //increament coordinates
	
	public void paint (Graphics g)
	 {
	   g.setColor(Color.red);
	   g.fillOval(x,y,30,30); //drawing a ball
         }	
       
	public void init()
	{
 	  x=20;
	  y=20;
	  incx=1;
	  incy=1;
	}
	public void start()
	{
         Thread thr = new Thread(this);
	 thr.start();	
	}
 	public void run()
        {
	  while(true)
		{ 
		  repaint();
			try
			{ Thread.sleep(5);}


    			 catch(Exception e)
			
			 {e.printStackTrace();}
			

			if(x+30>getWidth())
			incx=-1;
			if(x<10)
			incx=1;
			if(y+30>getHeight())
			incy=-1;
			if(y<10)
			incy=1;
			
			
		  x=x+incx*1; //how much gap we want to leave in the ball movement 
		  y=y+incy*1;
		}	
   	}

	
}

