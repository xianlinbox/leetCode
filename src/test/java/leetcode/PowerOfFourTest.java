package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

  @Test
  public void isPowerOfFour() throws Exception {
    PowerOfFour solution = new PowerOfFour();

    assertTrue(solution.isPowerOfFour(4));
    assertFalse(solution.isPowerOfFour(5));
  }
}