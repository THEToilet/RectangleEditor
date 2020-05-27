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

}
