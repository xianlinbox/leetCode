package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Grab2Test {
  private Grab2 grab2;

  @Before
  public void setUp() throws Exception {
    grab2 = new Grab2();
  }

  @Test
  public void testSolution() throws Exception {
    int[] transportDays = {1, 2, 4, 5, 7, 29, 30};
    assertEquals(11, grab2.solution(transportDays));
    assertEquals(2, grab2.solution(new int[]{5}));
    assertEquals(6, grab2.solution(new int[]{5, 8, 9}));
    assertEquals(9, grab2.solution(new int[]{1, 4, 5, 6, 7, 8, 9}));
    assertEquals(9, grab2.solution(new int[]{1, 4, 5, 6, 7, 8, 9, 10}));
    assertEquals(18, grab2.solution(new int[]{1, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19}));
    assertEquals(25, grab2.solution(new int[]{1, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 23,24,25,26,27}));
    assertEquals(25, grab2.solution(new int[]{1, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 23,24,25,26,27,28,29,30}));
  }
}