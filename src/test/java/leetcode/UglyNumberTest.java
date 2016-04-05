package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberTest {
  private UglyNumber uglyNumber;

  @Before
  public void setUp() {
    uglyNumber = new UglyNumber();
  }

  @Test
  public void first_ugly_number() {
    assertEquals(uglyNumber.nthUglyNumber(1), 1);
  }

  @Test
  public void second_ugly_number() {
    assertEquals(uglyNumber.nthUglyNumber(2), 2);
  }

  @Test
  public void fifth_ugly_number() {
    assertEquals(uglyNumber.nthUglyNumber(5), 5);
  }

  @Test
  public void tenth_ugly_number() {
    assertEquals(uglyNumber.nthUglyNumber(10), 12);
  }
}