import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MainPanel extends JPanel {

    private final List<CustomButton> buttons = List.of(
        new CustomButton(30, 30, 100, 100),
        new CustomButton(170, 70, 50, 60));

    public void paint(Graphics g) {
        this.addMouseListener(new MouseCatcher());
        super.paint(g);
        for (CustomButton button : buttons) {
            button.draw(g);
        }
    }

    private class MouseCatcher extends MouseAdapter {
        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
            for (CustomButton button : buttons) {
                button.setPressed(false);
                repaint();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            super.mouseClicked(e);
            for (CustomButton button : buttons) {
                if (button.onButton(e.getX(), e.getY())) {
                    button.setPressed(true);
                }
                repaint();
            }
        }
    }
}
