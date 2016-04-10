package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GasStationTest {

  private GasStation gasStation;

  @Before
  public void setUp() throws Exception {
    gasStation = new GasStation();
  }

  @Test
  public void testCanCompleteCircuit() throws Exception {
//    assertEquals(-1, gasStation.canCompleteCircuit(new int[]{1, 1, 1}, new int[]{1,2,1}));
    assertEquals(0, gasStation.canCompleteCircuit(new int[]{1, 1}, new int[]{1, 1}));
  }
}