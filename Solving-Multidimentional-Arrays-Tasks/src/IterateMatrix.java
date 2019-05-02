package matrix_iteration;

public class IterateMatrix {

  public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    //print by rows
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
      }

      System.out.println();
    }

    System.out.println("-------------------------------------");

    //print by cols
    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        System.out.print(matrix[row][col] + " ");
      }

      System.out.println();
    }

    System.out.println("-------------------------------------");

    //print by left-right/up-down diagonal
    for (int row = 0; row < matrix.length; row++) {
      for (int col = row; col < row + 1; col++) {
        System.out.print(matrix[row][col] + " ");
      }

      System.out.println();
    }

    System.out.println("-------------------------------------");

    //print by left-right/up-down diagonal - second way
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(matrix[i][i] + " ");
    }

    System.out.println();

    System.out.println("-------------------------------------");

    //print by right-left/down-up diagonal
    for (int row = 0; row < matrix.length; row++) {
      for (int col = matrix[row].length - row - 1; col <= matrix[row].length - 1 - row; col++) {
        System.out.print(matrix[row][col] + " ");
      }

      System.out.println();
    }

    System.out.println("-------------------------------------");

    //print by right-left/down-up diagonal - second way
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(matrix[i][matrix.length - i - 1] + " ");
    }

    System.out.println();

    System.out.println("-------------------------------------");

  }
}
