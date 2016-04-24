package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowTest {
  @Test
  public void myPow() throws Exception {
    Pow pow = new Pow();

    assertEquals(3.4368447520767935, pow.myPow(1.00001, 123456), 0.0001);
    assertEquals(0.909, pow.myPow(1.1, -1), 0.0001);
    assertEquals(1, pow.myPow(1.1, 0), 0.001);
    assertEquals(1.21, pow.myPow(1.1, 2), 0.001);
    assertEquals(1.331, pow.myPow(1.1, 3), 0.0001);
  }

}