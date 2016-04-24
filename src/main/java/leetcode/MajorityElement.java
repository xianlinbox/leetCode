package leetcode;

import java.util.HashMap;

public class MajorityElement {
  public int majorityElement(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int num : nums) {
      Integer count = map.get(num);
      map.put(num, count == null ? 1 : ++count);
    }

    for (int num : nums) {
      if (map.get(num) * 2 > nums.length) {
        return num;
      }
    }
    return -1;
  }
}
