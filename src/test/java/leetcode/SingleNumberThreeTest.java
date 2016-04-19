package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SingleNumberThreeTest {
  @Test
  public void singleNumber() throws Exception {
    SingleNumberThree solution = new SingleNumberThree();


    System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 3})));

    System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 3, 3, -1})));
    System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    System.out.println(Arrays.toString(solution.singleNumber(new int[]{1, 2, 3, 3, 2, 5})));
  }

}