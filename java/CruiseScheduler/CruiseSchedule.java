package com.derik;

import java.util.Scanner;

/**
* Only the finest cruises allowed this side of the Mississippi.
*/
public class CruiseSchedule {
  /**
   * Constructor that creates a CruiseSchedule for a given working schedule.
   * @param weeklySchedule an array with 7 elements representing if the ship will sale on
   *                       a given day. For instance if weeklySchedule[0] is true, then
   *                       the ship will sail on mondays.
   */
  private boolean[] schedule;

  public CruiseSchedule(boolean[] weeklySchedule) {
    this.schedule = weeklySchedule;
  }

  /**
   * Compute return day of week for this schedule given a departure date and duration
   * @param departureDayOfWeek the day of week, from 0-6, where 0 is monday and 6 is sunday.
   * @param tripDuration how many days of sailing it takes to make a round trip.
   * @return day of week where 0 is monday, 6 is sunday).
   */
  public int computeReturnDayOfWeek(int departureDayOfWeek, int tripDuration){
    boolean[] weeklySchedule = this.schedule;
    int sailingDayCount = 0;
    int scheduleIdx = departureDayOfWeek;

    while(sailingDayCount < tripDuration){
      scheduleIdx = scheduleIdx + 1; //increment on every iteration

      if(scheduleIdx == weeklySchedule.length){
        scheduleIdx = 0; // If scheduleIdx overflows, reset back to zero so iteration continues
      }

      if(weeklySchedule[scheduleIdx]){
        sailingDayCount++;
      }
    }
    return scheduleIdx;
  }
}
