public class Color {
  enum Colors {
    RED, BLUE, YELLOW, GRAY, CYAN, WHITE
  };

  private Colors color;

  public Color(String c) {
    this.color = Colors.valueOf(c);
  }
}
