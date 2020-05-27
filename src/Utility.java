public class Utility {
  public static void intersec(int rec1, int rec2) {
    Rectangle r1 = Board.getRectangl(rec1);
    Rectangle r2 = Board.getRectangl(rec2);
    Rectangle rectangle = new Rectangle(x, y, width, height);
    Board.addRectangle(rectangle);
  }

  public boolean isOverlapping(Rectangle other) {
    if (this.topRight.getY() < other.bottomLeft.getY()
      || this.bottomLeft.getY() > other.topRight.getY()) {
        return false;
    }
    if (this.topRight.getX() < other.bottomLeft.getX()
      || this.bottomLeft.getX() > other.topRight.getX()) {
        return false;
    }
    return true;
}
}