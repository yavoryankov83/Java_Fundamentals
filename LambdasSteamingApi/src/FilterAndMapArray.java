import java.util.Arrays;

public class FilterAndMapArray {
  /**
   * Main args.
   */
  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

    int[] filtered = Arrays.stream(numbers)
      .filter(n -> n % 2 == 0)
      .map(x -> x * 2)
      .toArray();

    Arrays.stream(filtered)
      .forEach(System.out::println);
  }
}
