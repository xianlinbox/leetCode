package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {
  @Test
  public void longestConsecutive() throws Exception {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 1, 100, 2}));
    assertEquals(2, solution.longestConsecutive(new int[]{100, 4, 200, 1, 2}));
    assertEquals(3, solution.longestConsecutive(new int[]{100, 4, 200, 101, 102, 1, 2}));
  }
}