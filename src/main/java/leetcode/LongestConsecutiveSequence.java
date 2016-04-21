package leetcode;

import java.util.HashMap;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 * <p>
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    HashMap<Integer, Boolean> visitedMap = new HashMap<Integer, Boolean>();

    for (int num : nums) {
      visitedMap.put(num, false);
    }

    int longestSequence = 1;

    for (int i = 0; i < nums.length; i++) {
      if (visitedMap.get(nums[i])) {
        continue;
      }

      int currentIndexMax = caculateCurrentIndexLongestSequence(nums, visitedMap, i);

      if (currentIndexMax > longestSequence) {
        longestSequence = currentIndexMax;
      }
    }

    return longestSequence;
  }

  private int caculateCurrentIndexLongestSequence(int[] nums, HashMap<Integer, Boolean> visitedMap, int i) {
    int currentIndexMax = 1;
    int ascend = nums[i];
    while (visitedMap.get(++ascend) != null) {
      visitedMap.put(ascend, true);
      currentIndexMax++;
    }

    int descend = nums[i];
    while (visitedMap.get(--descend) != null) {
      visitedMap.put(descend, true);
      currentIndexMax++;
    }
    return currentIndexMax;
  }
}
