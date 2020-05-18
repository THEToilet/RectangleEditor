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
      int ac = scanner.nextInt();
      action = getActions(ac);

      switch (action) {
        case CREATE:
          System.out.println("Please Input x y width height");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          int width = scanner.nextInt();
          int height = scanner.nextInt();
          Rectangle rectangle = new Rectangle(x, y, width, height);
          Board.addRectangle(rectangle);
          System.out.println("SUCCSESS");
          break;
        case MOVE:
          break;
        case EXPAND:
          break;
        case SHRINK:
          break;
        case DELETE:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int num = scanner.nextInt();
          Board.deleteRectangle(num);
          System.out.println("SUCCSESS");
          break;
        case DELETEALL:
          break;
        case INTERSEC:
          break;
        case DISPLAYBOARD:
          break;
        case EXIT:
          System.out.println("exit ..");
          scanner.close();
          break;
        default:
          break;
      }
    }
  }

  private static Action getActions(int num) {
    Action tmp = Action.NONE;
    switch (num) {
      case 0:
        tmp = Action.CREATE;
        break;
      case 1:
        tmp = Action.DELETE;
        break;
      case 2:
        tmp = Action.DELETEALL;
        break;
      case 3:
        tmp = Action.DISPLAYBOARD;
        break;
      case 4:
        tmp = Action.DELETE;
        break;
      case 8:
        tmp = Action.EXIT;
        break;
    }

    return tmp;
  }
}