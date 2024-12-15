import java.applet.Applet;
import java.awt.Graphics;
 

public class Rectangle extends Applet 
{
    
    @Override
    public void paint(Graphics g) 
    {   //Rectangle
        g.setColor(Color.RED);
        g.drawRect(50,50,150,100);
        g.fillRect(50,50,150,100);
        //Square
        g.setColor(Color.RED);
        g.drawRect(50,150,150,150);
        g.fillRect(50,150,150,150);
        //Cirlce
        g.setColor(Color.RED);
        g.drawOval(50,250,100,100);
        g.fillOval(50,250,100,100);
    }
     
}
