package leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * <p>
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],Your function should return length = 5,
 * with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicateInSortedArrayTwo {
  public int removeDuplicates(int[] nums) {
    if (nums == null) {
      return 0;
    }

    if (nums.length <= 2) {
      return nums.length;
    }

    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(nums[0]);
    result.add(nums[1]);

    for (int i = 2; i < nums.length; i++) {
      int resultSize = result.size();
      if (result.get(resultSize - 2) != nums[i] || result.get(resultSize - 1) != nums[i]) {
        result.add(nums[i]);
      }
    }

    for (int i = 0; i < result.size(); i++) {
      nums[i] = result.get(i);
    }


    return result.size();
  }

  public int removeDuplicatesTwo(int[] nums) {
    if (nums == null) {
      return 0;
    }

    if (nums.length <= 2) {
      return nums.length;
    }

    int pos = 0;
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[pos]) {
        count++;
        if (count == 2) {
          pos++;
          nums[pos] = nums[i];
        }
      } else {
        count = 1;
        pos++;
        nums[pos] = nums[i];
      }
    }
    return pos + 1;
  }


}
