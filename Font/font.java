import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Toolkit;
import java.awt.Font; 
public class font extends Applet{

 public void paint(Graphics g){
 
  String[] fontNames=Toolkit.getDefaultToolkit().getFontList();
 
   int y=20;
  for ( int i = 0; i < fontNames.length; i++ )
    
    {  
      g.setFont(new Font(fontNames[i],Font.PLAIN,20));
      g.drawString(fontNames[i], 10, y);
      y +=20;

    }
 }


}
