import java.awt.event.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class JavaMov extends Applet   
{
      int x;
      int y;
      String str;
     
    public void init(){  
        x=getWidth()/2;
        y=getHeight()/2;
        str="JAVA"; 
        addKeyListener(new MyKey());
       
       
   }
   
   public void paint(Graphics g){
    
       g.drawString(str,x,y);
      
   }
    
   class MyKey implements KeyListener{

    public void keyPressed(KeyEvent e){

 
     if (e.getKeyCode()==39)
    {
       if(x+40<getWidth())
        x+=10;         //Right arrow key code
       
    }

    else if (e.getKeyCode()==37)
    {     if(x>10)
          x-=10;      //Left arrow key code
         
    }
    
     else if (e.getKeyCode()==38)
    {       if(y>10) 
           y-=10;     //up arrow key code
           
    }

    else if (e.getKeyCode()==40)
    {         if(y<getHeight())
              y+=10;  //down arrow key code
              
    }

    repaint();
   

    }
    public void keyReleased(KeyEvent e){ }
    public void keyTyped(KeyEvent e){}


   } 
  
    

}
