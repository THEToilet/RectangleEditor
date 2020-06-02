import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class DrawFrame extends Frame {
  private ArrayList<Rectangle> rectangles;

  DrawFrame(String title) {
    this.setTitle(title);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    this.setLocation(300, 100);
    this.setSize(500, 400);
    this.setBackground(Color.white);
  }

  public void paint(Graphics g) {
    rectangles = Board.getRectangles();
    for (int i = 0; i < rectangles.size(); i++) {
      Rectangle rectangle = rectangles.get(i);
      g.setColor(changeColor(rectangle.color.color));
      g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
  }

  private java.awt.Color changeColor(Colors c) {
    switch (c) {
      case BLUE:
        return Color.BLUE;
      case RED:
        return Color.RED;
      case YELLOW:
        return Color.YELLOW;
      case GRAY:
        return Color.GRAY;
      case GREEN:
        return Color.GREEN;
      case ORANGE:
        return Color.ORANGE;
      case MAGENTA:
        return Color.MAGENTA;
      default:
        return Color.CYAN;
    }

  }
}