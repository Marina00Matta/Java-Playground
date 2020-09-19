import java.applet.Applet;
import java.awt.Graphics;


public class HelloApplet extends Applet{



public void paint(Graphics g)
{
 String myName = getParameter("name");
 
g.drawString("Hello Java "+ myName, 20, 20);


}

}
