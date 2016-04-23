package leetcode;

import java.util.*;

/**
 * The geometric information of each building is represented by a triplet of integers [Li, Ri, Hi],
 * where Li and Ri are the x coordinates of the left and right edge of the ith building, respectively,
 * and Hi is its y. It is guaranteed that 0 ≤ Li, Ri ≤ INT_MAX, 0 < Hi ≤ INT_MAX, and Ri - Li > 0.
 * You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at y 0.
 * For instance, the dimensions of all buildings in Figure A are recorded as: [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
 * The output is a list of "key points" (red dots in Figure B) in the format of [ [x1,y1], [x2, y2], [x3, y3], ... ]
 * that uniquely defines a skyline. A key point is the left endpoint of a horizontal line segment. Note that the last key point,
 * where the rightmost building ends, is merely used to mark the termination of the skyline, and always has zero y.
 * Also, the ground in between any two adjacent buildings should be considered part of the skyline contour.
 *
 * For instance, the skyline in Figure B should be represented as:[ [2 10], [3 15], [7 12], [12 0], [15 10], [20 8], [24, 0] ].
 *
 * Notes:
 * The number of buildings in any input list is guaranteed to be in the range [0, 10000].
 * The input list is already sorted in ascending order by the left x position Li.
 * The output list must be sorted by the x position.
 * There must be no consecutive horizontal lines of equal y in the output skyline.
 * For instance, [...[2 3], [4 5], [7 5], [11 5], [12 7]...] is not acceptable;
 * the three lines of y 5 should be merged into one in the final output as such: [...[2 3], [4 5], [12 7], ...]
 *
 * https://leetcode.com/problems/the-skyline-problem/
 */
public class Skyline {
  public List<int[]> getSkyline(int[][] buildings) {
    List<int[]> result = new ArrayList<int[]>();
    if (buildings == null || buildings.length == 0) {
      return result;
    }

    //存储每栋建筑的顶点,以正负值来区分左右顶点
    List<Point> buildingTopPoints = new ArrayList<Point>();
    for (int[] building : buildings) {
      buildingTopPoints.add(new Point(building[0], -building[2]));
      buildingTopPoints.add(new Point(building[1], building[2]));
    }

    //根据下标从左到右排序,相同下标, 高度低的排前面
    Collections.sort(buildingTopPoints, new Comparator<Point>() {
      @Override
      public int compare(Point h1, Point h2) {
        return h1.x != h2.x ? h1.x - h2.x : h1.y - h2.y;
      }
    });

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(20000, Collections.reverseOrder());
    pq.offer(0);
    int prev = 0;
    for (Point point : buildingTopPoints) {
      if (point.y < 0) {
        pq.offer(-point.y);
      } else {
        pq.remove(point.y);
      }

      int cur = pq.peek();
      if (cur != prev) {
        result.add(new int[]{point.x, cur});
        prev = cur;
      }
    }
    return result;
  }

  class Point {
    int x;
    int y;
    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

}
