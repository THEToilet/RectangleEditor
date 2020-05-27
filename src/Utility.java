import java.lang.Math;

public class Utility {
  public static void intersec(int rec1, int rec2) {
    Rectangle r1 = Board.getRectangl(rec1);
    Rectangle r2 = Board.getRectangl(rec2);
    int sx = Math.max(r1.x + r1.width / 2, r2.x + r2.width / 2);
    int sy = Math.max(r1.y + r1.height / 2, r2.y + r2.height / 2);
    int ex = Math.min(r1.x + r1.width / 2 + r1.width, r2.x + r2.width / 2 + r2.width);
    int ey = Math.min(r1.y + r1.height / 2 + r1.height, r2.y + r2.height / 2 + r2.height);

    int w = ex - sx;
    int h = ey - sy;
    if (w > 0 && h > 0) {
      Rectangle rectangle = new Rectangle(sx - w / 2, sy - h / 2, w, h, new Color(combineColors(r1.color, r2.color)));
      Board.deleteRectangle(rec1);
      Board.deleteRectangle(rec2 - 1);
      Board.addRectangle(rectangle);
      System.out.println("It worked.");
    } else {
      System.out.println("They don't overlap.");
    }
  }

  public static Colors combineColors(Color c1, Color c2) {
    if (c1.color.equals(c2.color)) {
      return Colors.GRAY;
    } else if ((c1.color == Colors.YELLOW && c2.color == Colors.BLUE)
        || (c1.color == Colors.BLUE && c2.color == Colors.YELLOW)) {
      return Colors.GREEN;
    } else if ((c1.color == Colors.YELLOW && c2.color == Colors.RED)
        || (c1.color == Colors.RED && c2.color == Colors.YELLOW)) {
      return Colors.ORANGE;
    } else if ((c1.color == Colors.RED && c2.color == Colors.BLUE)
        || (c1.color == Colors.BLUE && c2.color == Colors.RED)) {
      return Colors.MAGENTA;
    } else {
      return Colors.CYAN;
    }
  }
}