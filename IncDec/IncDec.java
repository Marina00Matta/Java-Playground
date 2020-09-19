import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class IncDec extends Applet 
{
      int x=0;
      Button inc,dec;
    public void init(){
    
      inc = new Button("Increment");
      inc.addActionListener(new MyButtonListener());
      add(inc);
      dec = new Button("Decrement");
      dec.addActionListener(new MyButtonListener1());
      add(dec);
       
   }
   public void paint(Graphics g){

       g.drawString("click count is :"+x,50,100);
   }
    
   class MyButtonListener implements ActionListener{

    public void actionPerformed(ActionEvent ev){
 
     x++;
     repaint();
    }


   } 
  
   class MyButtonListener1 implements ActionListener{

    public void actionPerformed(ActionEvent ev){
 
     x--;
     repaint();
    }


   } 

}
