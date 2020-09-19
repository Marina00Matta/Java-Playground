import java.applet.Applet;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Font; 
 

public class font2 extends Applet{
 
	public void paint(Graphics g){
	GraphicsEnvironment GE = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		

		String fontNames[] = GE.getAvailableFontFamilyNames();
		
		int y = 20;
		for(int i=0; i < fontNames.length; i++){
			
                        g.setFont(new Font(fontNames[i],Font.PLAIN,20));
			g.drawString(fontNames[i], 10, y);
			y += 20;
		}
	}
}
