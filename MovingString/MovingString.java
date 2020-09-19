import java.awt.*; 
import java.applet.*; 
  
public class MovingString extends Applet implements Runnable { 
    private String display; 
    private int x, y, incx ,count; 
    Thread th; 
  
    // initializing 
    // called when the applet is 
    // started. 
    public void init() 
    { 
        display = "Hello Everyone..";
        
        x =200; 
        y = 100; 
        incx = 1; 
  
        // creating thread 
        th = new Thread(this); 
  
        // start thread 
        th.start(); 
    } 
   
    public void update() 
    { 
  
       
     
      if (x>getWidth()) {
         incx=1;
 	 x=count-x; 
        }
             
        if (x< getWidth()) 
          {
            incx = 1; }
         x+=10*incx; 
           
  }
    // run 
    public void run() 
    { 
  
        while (true) { 
  
            // Repainting the screen 
            // calls the paint function 
            repaint(); 
  
            update(); 
            try { 
  
                // creating a pause of 1 second 
                // so that the movement is recognizable 
                Thread.sleep(500); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    } 
  
    // drawString 
    public void paint(Graphics g) 
    { 
         
        Font font = new Font( display, Font.PLAIN, 16 );
        FontMetrics fm = g.getFontMetrics( font );
         count=fm.stringWidth( display );

      
        g.drawString(display,x,y); 
    } 
} 
