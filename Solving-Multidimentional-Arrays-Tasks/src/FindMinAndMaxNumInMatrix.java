public class FindMinAndMaxNumInMatrix {
  public static void main(String[] args) {

    int[][] matrix = {
      {3, 4, 5, 6,},
      {8, 4, 2, 7,}
    };

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (matrix[row][col] < min) {
          min = matrix[row][col];
        }

        if (matrix[row][col] > max) {
          max = matrix[row][col];
        }
      }
    }

    System.out.println("MIN: " + min);
    System.out.println("MAX: " + max);
  }
}
