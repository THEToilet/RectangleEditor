import java.util.ArrayList;

public class Board {
  public static ArrayList<Rectangle> rectangles = new ArrayList<>(10);

  public static void addRectangle(Rectangle rectangle) {
    rectangles.add(rectangle);
  }

  public static void showRectangles() {
    for (int i = 0; i < rectangles.size(); i++) {
      String rectangleString = (rectangles.get(i)).show();
      System.out.printf("%d : %s\n", i, rectangleString);
    }
  }

  public static void deleteRectangle(int num) {
    rectangles.remove(num);
  }

  public static void deleteAllRectangle() {
    for (int i = 0; i < rectangles.size(); i++) {
      rectangles.remove(i);
    }
  }

  public static Rectangle getRectangl(int num) {
    return rectangles.get(num);
  }

  public static ArrayList<Rectangle> getRectangles(int num) {
    return rectangles;
  }

  public static Boolean hasSameRectangles(Rectangle r) {
    boolean ok = false;
    for (int i = 0; i < rectangles.size(); i++) {
      Rectangle tmpr = rectangles.get(i);
      if (tmpr.x == r.x && tmpr.y == r.y && tmpr.width == r.width && tmpr.height == r.height) {
        ok = true;
      }
    }
    return ok;
  }

  public static Boolean isItOverTheBoard(Rectangle r) {
    boolean ans = false;
    if (r.x < 0 && r.x + r.width > 500 && r.y < 0 && r.y + r.height > 400) {
      ans = true;
    }
    return ans;
  }
}
