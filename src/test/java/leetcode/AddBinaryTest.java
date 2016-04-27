package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
  @Test
  public void addBinary() throws Exception {
    AddBinary solution = new AddBinary();

    assertEquals("100", solution.addBinary("11","1"));
  }
}