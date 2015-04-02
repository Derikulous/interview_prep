package com.derik;

public class Main {
    public static void main(String[] args) {
        MonthAndDay mad = new MonthAndDay(0, 0);
        MonthAndDay mad2 = new MonthAndDay(0, 0);
        MonthAndDay mad3 = new MonthAndDay(0, 31);
        MonthAndDay mad4 = new MonthAndDay(1, 1);
        MonthAndDay mad5 = new MonthAndDay(11, 0);

        mad.computeMonthAndDayFromDaysAdded(350);
        mad2.computeMonthAndDayFromDaysAdded(150);
        mad3.computeMonthAndDayFromDaysAdded(700);
        mad4.computeMonthAndDayFromDaysAdded(750);
        mad5.computeMonthAndDayFromDaysAdded(20);

    }
}
