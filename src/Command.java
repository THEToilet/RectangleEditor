import java.util.Scanner;

public class Command {

  enum Action {
    NONE, CREATE, MOVE, EXPAND, SHRINK, DELETE, DELETEALL, INTERSEC, DISPLAYBOARD, EXIT
  }

  public static void Start() {
    Action action = Action.NONE;
    while (action != Action.EXIT) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
      scanner.close();
    }
  }
}