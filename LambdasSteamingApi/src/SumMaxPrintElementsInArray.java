import java.util.Arrays;

public class SumMaxPrintElementsInArray {
  /**
   * Main args.
   */
  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

    int sum = Arrays.stream(numbers)
      .sum();

    int max = Arrays.stream(numbers)
      .max()
      .getAsInt();

    System.out.println("sum: " + sum);
    System.out.println("max: " + max);

    Arrays.stream(numbers)
      .forEach(System.out::println);
  }
}
