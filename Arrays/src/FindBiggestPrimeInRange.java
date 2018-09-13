import java.util.Scanner;

public class FindBiggestPrimeInRange {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    boolean isPrime = false;
    int primeNumber = n;

    while (!isPrime) {
      boolean isCurrentPrime = true;
      for (int devider = 2; devider <= Math.sqrt(primeNumber); devider++) {
        if (primeNumber % devider == 0) {
          isCurrentPrime = false;
          break;
        }
      }
      if (isCurrentPrime) {
        isPrime = isCurrentPrime;
      } else {
        primeNumber--;
      }
    }
    System.out.println(primeNumber);
  }
}
