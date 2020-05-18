import java.util.Scanner;

public class Command {

  enum Action {
    CREATE, MOVE, EXPAND, SHRINK, DELETE, DELETEALL, INTERSEC, DISPLAYBOARD, EXIT, NONE
  }

  public static void Start() {
    String acString = "0:CREATE 1:MOVE 2:EXPAND 3:SHRINK 4:DELETE\n 5:DELETEALL 6:INTERSEC 7:DISPLAYBOARD 8: EXIT\n";

    Action action = Action.NONE;

    while (action != Action.EXIT) {
      System.out.printf(acString);
      System.out.printf(">> ");
      Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();

      switch (action) {
        case CREATE:
          break;
        case MOVE:
          break;
        case EXPAND:
          break;
        case SHRINK:
          break;
        case DELETE:
          break;
        case DELETEALL:
          break;
        case INTERSEC:
          break;
        case DISPLAYBOARD:
          break;
        case EXIT:
          System.out.println("exit ..");
          break;
        default:
          break;
      }

      System.out.println(str);
      scanner.close();
    }
  }
}