package EIEV3.src;

public enum Colors {
  RED, BLUE, YELLOW, GRAY, CYAN, WHITE, GREEN, ORANGE, MAGENTA {
    @Override
    public String toString() {
      return name().toLowerCase();
    }
  };

  @Override
  public String toString() {
    return this.name().toUpperCase();
  }

}