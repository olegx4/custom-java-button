import java.awt.*;

public class CustomButton {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private boolean isPressed = false;

    public CustomButton(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public void draw(Graphics g) {
        if (isPressed) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(x, y, width, height);
    }

    public boolean onButton(int x, int y) {
        return (this.x <= x && x <= (this.x + width))
            && (this.y <= y && y <= (this.y + height));
    }
}
