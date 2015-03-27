package com.derik;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner dayOfSailing = new Scanner(System.in);
    boolean[] weeklySchedule = new boolean[7];

    for (int i = 0; i < weeklySchedule.length; i++) {
      System.out.print("For day " + (i + 1) + " will the cruise sail? Set as true or false.");
      boolean toSailOrNot = dayOfSailing.nextBoolean();
      weeklySchedule[i] = toSailOrNot;
    }

    CruiseSchedule cs = new CruiseSchedule(weeklySchedule);
    int returnDay1 = cs.computeReturnDayOfWeek(1,2);
    System.out.println(returnDay1);

    int returnDay2 = cs.computeReturnDayOfWeek(1,25);
    System.out.println(returnDay2);

    int returnDay3 = cs.computeReturnDayOfWeek(0,0);
    System.out.println(returnDay3);

    int returnDay4 = cs.computeReturnDayOfWeek(2,2);
    System.out.println(returnDay4);
  }
}
