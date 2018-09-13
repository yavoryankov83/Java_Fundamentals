public class SumNumsInMatrix {
  public static void main(String[] args) {

    int[][] matrix = {
      {3, 4, 5, 6,},
      {8, 4, 2, 7,}
    };

    int sum = 0;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        sum += matrix[row][col];
      }
    }

    System.out.println("SUM: " + sum);
  }
}
