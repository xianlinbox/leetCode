package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {
  @Test
  public void majorityElement() throws Exception {
    MajorityElement solution = new MajorityElement();

    assertEquals(2, solution.majorityElement(new int[]{2}));
    assertEquals(2, solution.majorityElement(new int[]{2, 3, 2}));
    assertEquals(3, solution.majorityElement(new int[]{3, 3, 2}));
  }

}