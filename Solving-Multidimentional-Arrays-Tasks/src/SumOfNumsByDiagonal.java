public class SumOfNumsByDiagonal {
  public static void main(String[] args) {

    int[][] matrix = {
      {3, 4, 5, 6,},
      {8, 4, 2, 7,},
      {5, 8, 9, 2,},
      {8, 4, 2, 7,}
    };

    //sum under the main diagonal including
    int sum = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col <= row; col++) {
        sum += matrix[row][col];
      }
    }

    System.out.println("SUM: " + sum);

    //sum under the main diagonal excluding
    int sum1 = 0;

    for (int row = 1; row < matrix.length; row++) {
      for (int col = 0; col < row; col++) {
        sum1 += matrix[row][col];
      }
    }

    System.out.println("SUM1: " + sum1);

    //sum over the main diagonal including
    int sum2 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = row; col < matrix[row].length; col++) {
        sum2 += matrix[row][col];
      }
    }

    System.out.println("SUM2: " + sum2);

    //sum over the main diagonal excluding
    int sum3 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = row + 1; col < matrix[row].length; col++) {
        sum3 += matrix[row][col];
      }
    }

    System.out.println("SUM3: " + sum3);

    //sum under the second diagonal excluding
    int sum4 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = matrix.length - row; col < matrix.length; col++) {
        sum4 += matrix[row][col];
      }
    }

    System.out.println("SUM4: " + sum4);

    //sum under the second diagonal including
    int sum5 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = matrix.length - 1 - row; col < matrix.length; col++) {
        sum5 += matrix[row][col];
      }
    }

    System.out.println("SUM5: " + sum5);

    //sum over the second diagonal including
    int sum6 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length - row; col++) {
        sum6 += matrix[row][col];
      }
    }

    System.out.println("SUM6: " + sum6);

    //sum over the second diagonal excluding
    int sum7 = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length - row - 1; col++) {
        sum7 += matrix[row][col];
      }
    }

    System.out.println("SUM7: " + sum7);
  }
}
