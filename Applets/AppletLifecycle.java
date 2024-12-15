//Applet Lifecycle 
import java.applet.Applet;
import java.awt.Graphics;
public class AppletLifecycle extends Applet{
    @Override public void init(){
        System.out.println("init() : Applet initialized...");
    }
     @Override public void start(){
        System.out.println("start() : Applet started...");
    }
     @Override public void paint(Graphics g){
        g.drawString("Hello, this is applet...", 10,30);
        System.out.println("Applet being drawn....");
    }
     @Override public void stop(){
        System.out.println("stop() : Applet stopping...");
    }
    @Overide public void destroy(){
        System.out.println("destory(): applet is being destoryed..");
    }
}
