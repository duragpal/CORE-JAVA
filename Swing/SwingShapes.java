import javax.swing.*;
import java.awt.*;

public class SwingShapes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 100); // x, y, width, height

        // Draw Square
        g.setColor(Color.GREEN);
        g.fillRect(250, 50, 100, 100); // x, y, side length

        // Draw Circle
        g.setColor(Color.BLUE);
        g.fillOval(150, 200, 100, 100); // x, y, width, height (circle has equal width and height)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Shapes Example");
        SwingShapes panel = new SwingShapes();

        frame.add(panel);
        frame.setSize(400, 400); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Make frame visible
    }
}
