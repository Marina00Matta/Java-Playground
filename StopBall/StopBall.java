import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class StopBall extends Applet implements Runnable { 
    private String display; 
    private int x, y,flag, flag1,flag2; 
    Thread t; 
    Button start,pause;
  
    // initializing 
    // called when the applet is 
    // started. 
    public void init() 
    { 
        
        flag=0;
        x =200; 
        y = 100; 
        flag1 = 1; 
        flag2 =1;
        // creating thread 
        t = new Thread(this); 
  
        // start thread 
        //t.start(); 
        
        start = new Button("Start");
        start.addActionListener(new MyButtonListener());
        add(start);
        pause = new Button("Pause");
        pause.addActionListener(new MyButtonListener1());
        add(pause);
    } 
  

    public void update() 
    { 
  
       
     
       x=x+10*flag1;
       y=y+10*flag2;      
     
        if (x+15>getWidth()) {
           
           flag1=-1;
           
        }
             
        if (x<1) 
          {
            flag1 = 1;
           
          }
        if (y+15>getHeight()) {
           
           flag2=-1;
           
        }
             
        if (y<1) 
          {
            flag2 = 1;
           
          }
           
  }
    // run 
    public void run() 
    { 
  
        while (true) { 
  
            // Repainting the screen 
            // calls the paint function 

            repaint(); 
  
            update(); 
            try
            {
              Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        } 
    } 
  
    // drawString 
    public void paint(Graphics g) 
    { 
        g.fillOval(x,y,15,15); 
    } 

    class MyButtonListener implements ActionListener{

    public void actionPerformed(ActionEvent ev){
     if(flag==0)
     {t.start();
      flag=1;}
     else  {t.resume();} 
     repaint();
    }


   } 
  
   class MyButtonListener1 implements ActionListener{

    public void actionPerformed(ActionEvent ev){
 
     
     t.suspend();
     repaint();
    }


   } 
} 
