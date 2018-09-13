import java.util.Scanner;

public class MaximalSequenceOfEquals {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] nums = new int[n];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    int max = 1;
    int currentMax = 1;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        currentMax++;
        if (currentMax > max) {
          max = currentMax;
        }
      } else {
        currentMax = 1;
      }
    }

    System.out.println(max);
  }
}
