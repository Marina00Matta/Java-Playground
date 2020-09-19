import java.awt.event.*;
import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class OvalDrag extends Applet    
{
      int x;
      int y;
      
     
    public void init(){  
        x=getWidth()/2;
        y=getHeight()/2; 
        addMouseListener(new MyMouse());
        addMouseMotionListener(new MyMouse());       
       
   }
    
   public void paint(Graphics g){
    
       g.fillOval(x,y,20,20);
      
   }
    
   class MyMouse implements MouseListener, MouseMotionListener{

    public void mousePressed(MouseEvent e){
    x=e.getX()-10;
    y=e.getY()-10;
    repaint();
    }
    public void mouseReleased(MouseEvent e){
     x=e.getX()-10;
    y=e.getY()-10;
     repaint();
    }
    public void mouseClicked(MouseEvent e){
     x=e.getX()-10;
    y=e.getY()-10;
    repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
      x=e.getX()-10;
    y=e.getY()-10;
    repaint();
    }
    

   } 
  
       

}
