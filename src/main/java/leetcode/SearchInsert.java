package leetcode;

public class SearchInsert {
  public int searchInsert(int[] nums, int target) {
    if (target <= nums[0]) {
      return 0;
    } else {
      return findInsertPosition(nums, 0, nums.length, target);
    }
  }

  private int findInsertPosition(int[] nums, int start, int end, int target) {
    if (end - start <= 1) {
      return start + 1;
    } else {
      int middle = start + (int) Math.ceil((end - start) / 2);
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        return findInsertPosition(nums, middle, end, target);
      } else {
        return findInsertPosition(nums, start, middle, target);
      }
    }
  }
}
