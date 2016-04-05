package leetcode;

public class Grab2 {
  public int solution(int[] transportDays) {
    int[] minimalCost = new int[transportDays.length + 1];
    minimalCost[0] = 0;

    for (int i = 0; i < transportDays.length; i++) {
      int count = i + 1;

      if (i < 3) {
        minimalCost[count] = count * 2;
      } else if (i >= 21) {
        minimalCost[count] = 25;
      } else {
        int earliestCoveredDayIndex = earliestCoveredIndex(transportDays, i);
        int minimalCostBeforeEarliestCoveredDay = earliestCoveredDayIndex < 0 ? 2 : minimalCost[earliestCoveredDayIndex];

        if ((minimalCost[count - 1] + 2) > minimalCostBeforeEarliestCoveredDay + 7) {
          minimalCost[count] = minimalCostBeforeEarliestCoveredDay + 7;
        } else {
          minimalCost[count] = minimalCost[count - 1] + 2;
        }
      }
    }

    return minimalCost[transportDays.length];
  }

  private int earliestCoveredIndex(int[] transportDays, int currentIndex) {
    for (int i = 0; i < currentIndex; i++) {
      if (transportDays[currentIndex] - transportDays[i] < 7) {
        return i;
      }
    }
    return -1;
  }
}
