import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class lamp extends Applet

 { 
    public void paint (Graphics g)
       


       {  Color c1 = new Color (255,255,153);

          g.setColor(c1);
          g.fillOval(160,155,40,50);
          g.fillOval(125,165,25,30);
          g.fillOval(210,170,25,30); 
          g.fillOval(125,125,125,25);
          g.setColor(Color.black); 
          g.drawOval(125,125,125,25); 
          g.drawOval(160,155,40,50);
          g.drawOval(125,165,25,30);
          g.drawOval(210,170,25,30);

          g.drawLine(125,135,110,195);
          g.drawLine(247,135,260,195);
          g.drawArc(110,175,150,40,180,180);
          g.drawLine(175,215,165,250);
          g.drawLine(185,215,195,250);
          g.drawRect(140,250,80,10);
 }

}
