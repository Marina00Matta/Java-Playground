import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
public class draw extends Applet{

 public void paint(Graphics g){
int w = getSize().width;
int l = getSize().height;

 
 g.setColor(Color.yellow);
 g.fillOval(w / 2 + 35,l / 2 + 30,30,40);
 g.fillOval(100,140,15,20);
 g.fillOval(185,140,15,20);
 g.fillOval(100,100,100,20);
 g.setColor(Color.black); 
 g.drawOval(100,100,100,20);
 g.drawOval(135,130,30,40);
 g.drawOval(100,140,15,20);
 g.drawOval(185,140,15,20);

 g.drawLine(100,110,90,173);
 g.drawLine(200,110,210,170);
 g.drawArc(70,140,155,40,-35,-102);
 g.drawLine(145,180,135,220);
 g.drawLine(155,180,165,220);
 g.drawRect(110,220,80,10);
 }


}
