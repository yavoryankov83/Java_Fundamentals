import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalSumOfKElements {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();

    int[] nums = new int[n];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt();
    }

    Arrays.sort(nums);
    int sum = 0;
    for (int i = nums.length - 1; i > nums.length - k - 1; i--) {
      sum += nums[i];
    }

    System.out.println(sum);
  }
}
