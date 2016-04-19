package leetcode;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * <p>
 * For example:
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 * <p>
 * https://leetcode.com/problems/single-number-iii/
 */
public class SingleNumberThree {
  public int[] singleNumber(int[] nums) {

    int diff = 0;
    for (int num : nums) {
      diff ^= num;
    }
    diff &= -diff;

    int[] result = new int[2];
    for (int num : nums) {
      if ((diff & num) == 0) {
        result[0] ^= num;
      } else {
        result[1] ^= num;
      }
    }
    return result;
  }
}
