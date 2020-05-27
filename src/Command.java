import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;

public class Command {

  public static void Start() {
    String acString = "CREATE MOVE EXPAND SHRINK DELETE\nDELETEALL INTERSEC DISPLAYBOARD EXIT\n";

    Action action = Action.NONE;

    while (action != Action.EXIT) {
      System.out.printf(acString);
      System.out.printf(">> ");
      Scanner scanner = new Scanner(System.in);
      String ac = scanner.nextLine();
      try {
        action = Action.valueOf(ac);
      } catch (IllegalArgumentException exception) {
        System.out.println("Commnad not found");
        continue;
      }

      switch (action) {
        case CREATE:
          int x, y, width, height;
          String bc;
          System.out.println("Please Input x y width height");
          try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            width = scanner.nextInt();
            height = scanner.nextInt();
            System.out.println("Please Input Color RED/BLUE/YELLOW/GRAY");
            bc = scanner.next();
          } catch (InputMismatchException exception) {
            System.out.println("Please try again");
            continue;
          }
          Colors c;
          try {
            c = Colors.valueOf(bc);
          } catch (IllegalArgumentException exception) {
            System.out.println("Commnad not found");
            continue;
          }
          Rectangle rectangle = new Rectangle(x, y, width, height, new Color(c));
          if (Board.isItOverTheBoard(rectangle)) {
            System.out.println("NOT SUCCSESS");
          }
          Board.addRectangle(rectangle);
          System.out.println("SUCCSESS");
          break;
        case MOVE:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int n, x0, y0;
          try {

            n = scanner.nextInt();
            System.out.println("Please Input x y");
            x0 = scanner.nextInt();
            y0 = scanner.nextInt();
          } catch (InputMismatchException exception) {
            System.out.println("Please try again");
            continue;
          }
          Rectangle tmpr = Board.getRectangl(n);
          Board.getRectangl(n).move(x0, y0);
          if (Board.isItOverTheBoard(tmpr)) {
            Board.getRectangl(n).move(-1 * x0, -1 * y0);
          }
          break;
        case EXPAND:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int nu;
          float mx, my;
          try {
            nu = scanner.nextInt();
            System.out.println("Please Input x y");
            mx = scanner.nextFloat();
            my = scanner.nextFloat();
          } catch (InputMismatchException exception) {
            System.out.println("Please try again");
            continue;
          }
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
          int num;
          try {
            num = scanner.nextInt();
          } catch (InputMismatchException exception) {
            System.out.println("Please try again");
            continue;
          }
          Board.deleteRectangle(num);
          System.out.println("SUCCSESS");
          break;
        case DELETEALL:
          Board.deleteAllRectangle();
          break;
        case INTERSEC:
          Board.showRectangles();
          System.out.println("Please Input Num");
          int rec1, rec2;
          try {
            rec1 = scanner.nextInt();
            rec2 = scanner.nextInt();
          } catch (InputMismatchException exception) {
            System.out.println("Please try again");
            continue;
          }
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
