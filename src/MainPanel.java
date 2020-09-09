import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private final CustomButton button = new CustomButton(30, 30, 100, 100);

    public void paint(Graphics g) {
        super.paint(g);
        button.draw(g);
    }
}
