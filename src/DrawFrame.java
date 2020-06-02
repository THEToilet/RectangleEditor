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
    g.setColor(Color.red);
    g.fillRect(0, 0, 100, 100);
    for (int i = 0; i < rectangles.size(); i++) {
      Rectangle rectangle = rectangles.get(i);
      System.out.println(rectangle.show());
      g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
  }

  public void run() {
    while (true) {
      repaint();
    }
  }
}