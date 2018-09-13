import java.util.ArrayList;
import java.util.List;

public class FindPrimes {
  /**
   * Main args.
   */
  public static void main(String[] args) {

    int[] nums = {3, 4, 5, 6, 78, 6, 5, 4,};

    ArrayList<Integer> resultPrimes = isPrime(nums);

    for (int num : resultPrimes
    ) {
      System.out.printf("%d ", num);
    }
  }

  /**
   * Method to return prime numbers.
   */
  public static ArrayList<Integer> isPrime(int[] numbers) {

    ArrayList<Integer> primes = new ArrayList<>();

    for (int num = 0; num < numbers.length; num++) {
      int maxDevider = (int) Math.sqrt(numbers[num]);
      boolean isPrime = true;
      for (int devider = 2; devider <= maxDevider; devider++) {
        if (numbers[num] % devider == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(numbers[num]);
      }
    }
    return primes;
  }
}
