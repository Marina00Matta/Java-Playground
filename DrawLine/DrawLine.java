import java.awt.event.*;
import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class DrawLine extends Applet    
{
      int x1;
      int y1;
      int x2;
      int y2;
     
    public void init(){  
         
        addMouseListener(new MyMouse());
        addMouseMotionListener(new MyMouse());       
       
   }
    
   public void paint(Graphics g){
    
       g.drawLine(x1,y1,x2,y2);
      
   }
    
   class MyMouse implements MouseListener, MouseMotionListener{

    public void mousePressed(MouseEvent e){
    x1=e.getX();
    y1=e.getY();
    repaint();
    }
    public void mouseReleased(MouseEvent e){
     x2=e.getX();
    y2=e.getY();
     repaint();
    }
    public void mouseClicked(MouseEvent e){
     x1=e.getX();
    y1=e.getY();
    repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
      x2=e.getX();
    y2=e.getY();
    repaint();
    }
    

   } 
  
       

}
