public class JaggedArrayNumsByModulDevider {
  public static void main(String[] args) {

    int[] nums = {0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2,};

    int base = 3;

    int[] counts = new int[base];

    for (int num : nums
    ) {
      int reminder = num % base;
      counts[reminder]++;

    }

    int[][] groups = new int[base][];
    int[] indices = new int[base];

    for (int i = 0; i < groups.length; i++) {
      int length = counts[i];
      groups[i] = new int[length];
    }

    for (int num : nums
    ) {
      int reminder = num % base;
      int index = indices[reminder];
      groups[reminder][index] = num;
      index++;
      indices[reminder] = index;
    }
    for (int[] group : groups
    ) {
      for (int num : group
      ) {
        System.out.print(num + ", ");
      }
      System.out.println();
    }
  }
}
