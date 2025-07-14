import javax.swing.*;
import java.awt.*;

public class Turtle extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 12, 12);    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Drawer");
        Turtle panel = new Turtle();
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}