package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioningTest {
  @Test
  public void partition() throws Exception {
    PalindromePartitioning solution = new PalindromePartitioning();

    assertEquals(new String[]{"aa", "b"}, solution.partition("aab").get(0));
    assertEquals(new String[]{"a", "a", "b"}, solution.partition("aab").get(1));


    assertEquals(new String[]{"acca"}, solution.partition("acca").get(0));
    assertEquals(new String[]{"a", "cc", "a"}, solution.partition("acca").get(1));
    assertEquals(new String[]{"a", "c", "c", "a"}, solution.partition("aab").get(1));
  }

}