import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Image;
public class img extends Applet{

 public void paint(Graphics g){
 
  Image img=getImage(getDocumentBase(),"minions.jpg");
  //g.drawImage(img,100,100,this); //for normal size of image 
    g.drawImage(img,0,0,getWidth(),getHeight(),this);  //for autofill applet with image 
 }


}
