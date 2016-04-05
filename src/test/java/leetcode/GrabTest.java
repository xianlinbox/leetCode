package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrabTest {
  private Grab grab;

  @Before
  public void setUp() throws Exception {
    grab = new Grab();
  }

  @Test
  public void testFirst() throws Exception {
    assertEquals(17,grab.solution("10:00","13:21"));
    assertEquals(9,grab.solution("09:42","11:42"));
    assertEquals(9,grab.solution("09:42","11:00"));
    assertEquals(5,grab.solution("09:42","10:30"));
  }

  @Test
  public void testSecond() throws Exception {

  }
}