package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertTest {

  private SearchInsert solution;

  @Before
  public void setUp() throws Exception {
    solution = new SearchInsert();
  }

  @Test
  public void testSearchInsert() throws Exception {
    assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    assertEquals(0, solution.searchInsert(new int[]{1}, 1));
  }
}