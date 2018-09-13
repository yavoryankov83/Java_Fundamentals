public class MaxSumBySize {
  public static void main(String[] args) {

    int[][] matrix = {
      {80, 4, 5, 6,},
      {8, 4, 2, 7,},
      {5, 8, 9, 20,},
      {8, 4, 20, 7,}
    };

    int sizeRows = 2;
    int sizeCols = 2;

    int maxSum = 0;

    for (int row = 0; row < matrix.length - sizeRows + 1; row++) {
      for (int col = 0; col < matrix[row].length - sizeCols + 1; col++) {
        int current = 0;

        for (int miniRow = row; miniRow < row + sizeRows; miniRow++) {
          for (int miniCol = col; miniCol < col + sizeCols; miniCol++) {
            current += matrix[miniRow][miniCol];
          }
        }

        maxSum = Math.max(maxSum, current);
      }
    }

    System.out.println(maxSum);
  }
}
