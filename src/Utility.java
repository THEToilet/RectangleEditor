import java.lang.Math;

public class Utility {
  public static void intersec(int rec1, int rec2) {
    Rectangle r1 = Board.getRectangl(rec1);
    Rectangle r2 = Board.getRectangl(rec2);
    if (isOverlapping(r1, r2)) {
      Rectangle rectangle = new Rectangle(Math.max(r1.x, r2.x), Math.min(r1.y, r2.y), Math.abs(Math.max(r1.x, r2.x)),
          Math.abs(Math.max(r1.x, r2.x)), new Color(combineColors(r1.color, r2.color)));
      System.out.println("Yes");
      Board.deleteRectangle(rec1);
      Board.deleteRectangle(rec2 - 1);
      Board.addRectangle(rectangle);
    }
    System.out.println("Oh");
  }

  public static boolean isOverlapping(Rectangle rec1, Rectangle rec2) {
    if (rec1.y < rec2.y - rec2.height || rec1.y - rec1.height > rec2.y) {
      return false;
    }
    if (rec1.x + rec1.width < rec2.x || rec1.x > rec2.x + rec2.width) {
      return false;
    }
    return true;
  }

  public static Colors combineColors(Color c1, Color c2) {
    if (c1.color.equals(c2.color)) {
      return Colors.GRAY;
    } else if ((c1.color == Colors.YELLOW && c1.color == Colors.BLUE)
        || (c1.color == Colors.BLUE && c1.color == Colors.YELLOW)) {
      return Colors.GREEN;
    } else if ((c1.color == Colors.YELLOW && c1.color == Colors.RED)
        || (c1.color == Colors.RED && c1.color == Colors.YELLOW)) {
      return Colors.ORANGE;
    } else if ((c1.color == Colors.RED && c1.color == Colors.BLUE)
        || (c1.color == Colors.BLUE && c1.color == Colors.RED)) {
      return Colors.MAGENTA;
    } else {
      return Colors.CYAN;
    }
  }
}