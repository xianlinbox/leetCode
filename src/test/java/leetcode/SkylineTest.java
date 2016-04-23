package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SkylineTest {
  @Test
  public void getSkyline() throws Exception {
    Skyline skyline = new Skyline();

    int[][] buildings = new int[][]{
      {2, 9, 10},
      {3, 6, 10},
      {3, 7, 15},
      {5, 12, 12},
      {15, 20, 10},
      {19, 24, 8}
    };


    List<int[]> result = skyline.getSkyline(buildings);

    for (int[] ints : result) {
      for (int anInt : ints) {
        System.out.print(anInt + ",");
      }

      System.out.println("****************");
    }
  }
}