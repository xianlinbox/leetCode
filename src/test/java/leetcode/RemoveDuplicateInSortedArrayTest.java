package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateInSortedArrayTest {
  @Test
  public void removeDuplicates() throws Exception {
    RemoveDuplicateInSortedArray solution = new RemoveDuplicateInSortedArray();

    assertEquals(0, solution.removeDuplicates(null));
    assertEquals(0, solution.removeDuplicates(new int[]{}));
    assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    assertEquals(2, solution.removeDuplicates(new int[]{1, 2, 2}));
    assertEquals(3, solution.removeDuplicates(new int[]{1, 1, 2, 2, 3}));
    assertEquals(3, solution.removeDuplicates(new int[]{1, 1, 2, 3, 3}));
  }
}