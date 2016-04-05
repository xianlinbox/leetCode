package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIndMinInRotatedSortArrayTest {
  private FIndMinInRotatedSortArray func;

  @Before
  public void setUp() {
    func = new FIndMinInRotatedSortArray();
  }

  @Test
  public void should_return_0_when_array_sorted() throws Exception {
    assertEquals(0, func.findMin(new int[]{0, 1, 2}));
  }

  @Test
  public void should_return_0_when_array_rotated() throws Exception {
    assertEquals(0, func.findMin(new int[]{2, 0, 1}));
  }

  @Test
  public void should_return_0_when_array_rotated_3() throws Exception {
    assertEquals(0, func.findMin(new int[]{1, 2, 0}));
  }

  @Test
  public void should_return_0_when_array_rotated_2() throws Exception {
    assertEquals(0, func.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
  }
}