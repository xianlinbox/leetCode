package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateInSortedArrayTwoTest {
  @Test
  public void removeDuplicates() throws Exception {
    RemoveDuplicateInSortedArrayTwo solution = new RemoveDuplicateInSortedArrayTwo();

    assertEquals(0, solution.removeDuplicates(new int[]{}));
    assertEquals(1, solution.removeDuplicates(new int[]{1}));
    assertEquals(2, solution.removeDuplicates(new int[]{1, 2}));
    assertEquals(5, solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicates(new int[]{1, 1, 2, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicates(new int[]{1, 2, 2, 2, 3, 3, 3}));
  }

  @Test
  public void removeDuplicatesTwo() throws Exception {
    RemoveDuplicateInSortedArrayTwo solution = new RemoveDuplicateInSortedArrayTwo();

    assertEquals(0, solution.removeDuplicatesTwo(new int[]{}));
    assertEquals(1, solution.removeDuplicatesTwo(new int[]{1}));
    assertEquals(2, solution.removeDuplicatesTwo(new int[]{1, 2}));
    assertEquals(5, solution.removeDuplicatesTwo(new int[]{1, 1, 1, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicatesTwo(new int[]{1, 1, 1, 1, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicatesTwo(new int[]{1, 1, 2, 2, 2, 3}));
    assertEquals(5, solution.removeDuplicatesTwo(new int[]{1, 2, 2, 2, 3, 3, 3}));
  }

}