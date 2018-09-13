import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int rows = Integer.parseInt(scanner.nextLine());
    int cols = Integer.parseInt(scanner.nextLine());

    int[][] nums = {
      {2, 3, 4, 5,},
      {5, 3, 6, 7,}
    };

    int[][] matrix = new int[rows][cols];

    //reading matrix from console
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = Integer.parseInt(scanner.nextLine());
      }
    }

    //printing matrix
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();
    //print first row, then second row
    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[row].length; col++) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();

    //print second row, then first row
    for (int row = nums.length - 1; row >= 0; row--) {
      for (int col = 0; col < nums[row].length; col++) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();

    //print second row in reversed order, then first row in reversed order
    for (int row = nums.length - 1; row >= 0; row--) {
      for (int col = nums[row].length - 1; col >= 0; col--) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();

    //print cols first one by one
    for (int col = 0; col < nums[0].length; col++) {
      for (int row = 0; row < nums.length; row++) {
        System.out.print(nums[row][col] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
