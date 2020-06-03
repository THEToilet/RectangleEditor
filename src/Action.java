package EIEV3.src;

public enum Action {
  CREATE, MOVE, EXPAND, SHRINK, DELETE, DELETEALL, INTERSEC, DISPLAYBOARD, EXIT, NONE {
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
