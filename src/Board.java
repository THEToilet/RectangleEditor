import java.util.ArrayList;

public class Board {
  public static ArrayList<Rectangle> rectangles = new ArrayList<>();

  public static void addRectangle(Rectangle rectangle) {
    rectangles.add(rectangle);
  }

  public void showRectangles() {
    for (int i = 0; i < rectangles.size(); i++) {
      String rectangleString = (rectangles.get(i)).show();
      System.out.printf("%d : %s", i, rectangleString);
    }
  }

}