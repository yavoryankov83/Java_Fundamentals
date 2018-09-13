import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    scanner.nextLine();

    String[] names = new String[n];

    for (int i = 0; i < names.length; i++) {
      names[i] = scanner.nextLine();
    }

    while (true) {
      String command = scanner.next();

      if ("end".equals(command)) {
        break;
      } else {
        int index = Integer.parseInt(command);

        if (index < 0 || index > n) {
          System.out.println("invalid index");
          continue;
        } else {
          System.out.println(names[index - 1]);
        }
      }
    }
  }
}
