import javax.swing.*;
public class Button {
    public static void main(String args[]){
        JFrame f = new JFrame();
        JButton b = new JButton("Login");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
