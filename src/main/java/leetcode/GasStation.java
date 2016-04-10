package leetcode;

class GasStation {
  int canCompleteCircuit(int[] gas, int[] cost) {

    int current = 0;
    int start = gas.length;
    int total = 0;

    do {
      if (total + gas[current] - cost[current] >= 0) {
        total += (gas[current] - cost[current]);
        current++;
      } else {
        start--;
        total += (gas[start] - cost[start]);
      }
    } while (current != start);

    return total >= 0 ? start % gas.length : -1;
  }
}
