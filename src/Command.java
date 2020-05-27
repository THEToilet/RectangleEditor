import java.util.Scanner;

public class Command {

  public static void Start() {
    String acString = "CREATE MOVE EXPAND SHRINK DELETE\nDELETEALL INTERSEC DISPLAYBOARD EXIT\n";

    Action action = Action.NONE;

    while (action != Action.EXIT) {
      System.out.printf(acString);
      System.out.printf(">> ");
      Scanner scanner = new Scanner(System.in);
      String ac = scanner.nextLine();
      action = Action.valueOf(ac);

      switch (action) {
        case CREATE:
          System.out.println("Please Input x y width height");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          int width = scanner.nextInt();
          int height = scanner.nextInt();
          System.out.println("Please Input Color RED/BLUE/YELLOW/GRAY");
          String bc = scanner.next();
          Color c = new Color(bc);
          Rectangle rectangle = new Rectangle(x, y, width, height, c);
          if (Board.isItOverTheBoard(rectangle)) {
            System.out.println("NOT SUCCSESS");
          }
          Board.addRectangle(rectangle);
          System.out.println("SUCCSESS");
          break;
        case MOVE:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int n = scanner.nextInt();
          System.out.println("Please Input x y");
          int x0 = scanner.nextInt();
          int y0 = scanner.nextInt();
          Rectangle tmpr = Board.getRectangl(n);
          Board.getRectangl(n).move(x0, y0);
          if (Board.isItOverTheBoard(tmpr)) {
            Board.getRectangl(n).move(-1 * x0, -1 * y0);
          }
          break;
        case EXPAND:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int nu = scanner.nextInt();
          System.out.println("Please Input x y");
          float mx = scanner.nextFloat();
          float my = scanner.nextFloat();
          Rectangle tr = Board.getRectangl(nu);
          Board.getRectangl(nu).expand(mx, my);
          if (Board.isItOverTheBoard(tr)) {
            Board.getRectangl(nu).expand(1 / mx, 1 / my);
          }
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
          Board.deleteAllRectangle();
          break;
        case INTERSEC:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int rec1 = scanner.nextInt();
          int rec2 = scanner.nextInt();
          Utility.intersec(rec1, rec2);
          break;
        case DISPLAYBOARD:
          Board.showRectangles();
          break;
        case EXIT:
          System.out.println("exit ..");
          scanner.close();
          break;
        default:
          System.out.println("Command not found");
          break;
      }
    }
  }

}
