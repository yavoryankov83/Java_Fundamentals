import java.util.Scanner;

public class AllocateArray {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = scanner.nextInt() * 5;
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i] + " ");
    }
  }
}
