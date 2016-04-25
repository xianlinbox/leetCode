package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NimGameTest {
  @Test
  public void canWinNim() throws Exception {
    NimGame solution = new NimGame();

    assertFalse(solution.canWinNim(4));
    assertTrue(solution.canWinNim(5));
  }
}