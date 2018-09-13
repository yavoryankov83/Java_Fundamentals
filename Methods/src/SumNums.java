import java.util.Scanner;

public class SumNums {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double num_1 = scanner.nextDouble();
    double num_2 = scanner.nextDouble();

    double result = sumNums(num_1, num_2);

    System.out.println(result);
  }

  public static double sumNums(double a, double b) {
    return a + b;
  }
}
