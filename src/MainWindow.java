import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JFrame frame;
    private final MainPanel panel;

    public MainWindow(MainPanel panel) {
        this.panel = panel;
        createFrame();
        initComponents();
    }

    private void initComponents() {
        final Container container = frame.getContentPane();
        panel.setBackground(Color.BLACK);
        container.add(panel);
    }

    private void createFrame() {
        frame = new JFrame("Button without button");
        frame.setBackground(Color.BLACK);
        frame.setSize(1960, 1080);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }
}
