public class MaxSumOfCell2x2 {
  public static void main(String[] args) {

    int[][] matrix = {
      {3, 4, 5, 6,},
      {8, 4, 2, 7,},
      {5, 8, 9, 2,},
      {8, 4, 2, 7,}
    };

    int maxSum = 0;
    int maxRow = 0;
    int maxCol = 0;

    for (int row = 0; row < matrix.length - 1; row++) {
      for (int col = 0; col < matrix[row].length - 1; col++) {
        int currSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
        if (currSum > maxSum) {
          maxSum = currSum;
          maxRow = row;
          maxCol = col;
        }
      }
    }
    System.out.println(maxSum);
    System.out.printf("%d %d%n", matrix[maxRow][maxCol], matrix[maxRow][maxCol + 1]);
    System.out.printf("%d %d%n", matrix[maxRow + 1][maxCol], matrix[maxRow + 1][maxCol + 1]);
  }
}
