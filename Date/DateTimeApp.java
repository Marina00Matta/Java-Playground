import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;

public class DateTimeApp extends Applet implements Runnable 
{
      Thread th;
      Date d;
    public void init(){
    
      th=new Thread(this);
      th.start();
      d=new Date();
   }
   public void paint (Graphics g){

       g.drawString(d.toString(),100,100);
   }
   public void run(){
     while(true)
     { 
       d=new Date();
       repaint();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
     }
   }

}
