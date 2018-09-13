import java.util.ArrayList;

public class ArrayListNumsByModulDevider {
  public static void main(String[] args) {

    int[] nums = {
      0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2,
    };

    int base = 3;

    ArrayList<Integer>[] groups = new ArrayList[base];

    for (int i = 0; i < nums.length; i++) {
      int reminder = nums[i] % base;

      if (groups[reminder] == null) {
        groups[reminder] = new ArrayList<>();
      }
      groups[reminder].add(nums[i]);
    }

    for (ArrayList<Integer> group : groups
    ) {
      for (int num : group
      ) {
        System.out.print(num + ", ");
      }
      System.out.println();
    }
  }
}
