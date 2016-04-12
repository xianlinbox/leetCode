package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLettersTest {
  @Test
  public void removeDuplicateLetters() throws Exception {
    RemoveDuplicateLetters solution = new RemoveDuplicateLetters();

    assertEquals("abc",solution.removeDuplicateLetters("bcabc"));
    assertEquals("a",solution.removeDuplicateLetters("a"));
    assertEquals("a",solution.removeDuplicateLetters("aaaaa"));
    assertEquals("acdb",solution.removeDuplicateLetters("cbacdcbc"));
    assertEquals("abcd",solution.removeDuplicateLetters("acbacdcbc"));
    assertEquals("acdbe",solution.removeDuplicateLetters("cbacdcbe"));
  }

}