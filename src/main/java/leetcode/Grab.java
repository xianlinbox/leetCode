package leetcode;

public class Grab {
  public int solution(String startTime, String endTime) {
    int totalStayHours = caculateStayHours(startTime, endTime);
    return caculateFeeBasedOnStayHours(totalStayHours);
  }

  private int caculateFeeBasedOnStayHours(int totalStayHours) {
    return 5 + (totalStayHours - 1) * 4;
  }

  private int caculateStayHours(String startTime, String endTime) {
    String[] startTimeSections = startTime.split(":");
    String[] endTimeSections = endTime.split(":");
    int startHour = Integer.parseInt(startTimeSections[0]);
    int startMinute = Integer.parseInt(startTimeSections[1]);
    int endHour = Integer.parseInt(endTimeSections[0]);
    int endMinute = Integer.parseInt(endTimeSections[1]);

    int totalStayMinutes = (endHour - startHour) * 60 + (endMinute - startMinute);

    return (int) Math.ceil(totalStayMinutes / 60.0);
  }
}
