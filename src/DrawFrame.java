import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawFrame extends Frame {
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
    g.drawRect(int x, int y, int width, int height)
  }
}