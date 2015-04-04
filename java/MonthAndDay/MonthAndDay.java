package com.derik;

/**
 * Created by a-dstrattan on 3/26/2015.
 */
public class MonthAndDay {
    public static final int[] DAYS_IN_EACH_MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Constructor that creates a month and day
     * @param MonthAndDay takes two arguments month and day
     * @param MonthAndDay takes one argument totalDaysSinceJan1st which represents how many days have passed since Jan 1st
     */
    private final int month;
    private final int day;

    public MonthAndDay(int month, int day){
        this.month = month - 1;
        this.day = day - 1;

        if(month < 1 || month > 12){
            throw new IllegalArgumentException("That is not a valid month. Choose between 1 and 12");
        }
        if(day > DAYS_IN_EACH_MONTH[month - 1] || day < 1){
            throw new IllegalArgumentException("Not that many days in month " + month);
        }
    }

    public String toString(){
        return "Month: " + this.month + ", Day: " + this.day;
    }

    public MonthAndDay(int totalDaysSinceJan1st){
        int monthIterator = 0;
        int day = totalDaysSinceJan1st;

        for(int d : DAYS_IN_EACH_MONTH){
            if(day <= 27){
                break;
            }
            // account for when we get to December and receive a negative value for day. Reset back to original day then set back to original month
            if(monthIterator == 11 && day == 30){
                day = d - 1;
                break;
            }

            monthIterator++;
            day -= d;
        }
        this.day = day + 1;
        this.month = monthIterator + 1;
    }

    /**
     * A method to return a new MonthAndDay object
     * @param days the number of days since Jan1st
     * @return a new MonthAndDay constructor
     */
    public static MonthAndDay monthAndDayForDaysSinceJan1st(int days){
        return new MonthAndDay(days);
    }

    public int getMonth(){
        return month + 1;
    }

    public int getDay(){
        return day + 1;
    }

    /**
     * Compute the number of days that have passed since Jan 1st from a given day and month
     * @return number of days since Jan 1st
     */

    public int computeDayOfYear(){
        int numberOfDaysSinceJan1 = 0;
        numberOfDaysSinceJan1 += day;

        for (int i = 0; i < month; i++) {
            numberOfDaysSinceJan1 += DAYS_IN_EACH_MONTH[i];
        }
        return numberOfDaysSinceJan1;
    }

    /**
     * Compute the Month and Day after specifying a starting date and number of days to pass after the starting date
     * @param daysToAdd
     * @return MonthAndDay object that is daysAdded days in the future
     */
    public MonthAndDay computeMonthAndDayFromDaysAdded(int daysToAdd){
        int daysWithDaysAdded = computeDayOfYear() + daysToAdd;
        daysWithDaysAdded = daysWithDaysAdded % 365;
        return new MonthAndDay(daysWithDaysAdded);
    }
}
