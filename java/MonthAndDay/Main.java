package com.derik;

public class Main {
    public static void main(String[] args) {
        MonthAndDay mad = new MonthAndDay(1, 1);
        MonthAndDay mad2 = new MonthAndDay(1, 1);
        MonthAndDay mad4 = new MonthAndDay(1, 1);
        MonthAndDay mad7 = new MonthAndDay(1, 1);
        MonthAndDay mad3 = new MonthAndDay(1, 31);
        MonthAndDay mad5 = new MonthAndDay(12, 1);
        MonthAndDay mad6 = new MonthAndDay(12, 1);

        System.out.println(mad.computeMonthAndDayFromDaysAdded(364).toString());
        System.out.println(mad2.computeMonthAndDayFromDaysAdded(31).toString());
        System.out.println(mad7.computeMonthAndDayFromDaysAdded(59).toString());
        System.out.println(mad4.computeMonthAndDayFromDaysAdded(58).toString());
        System.out.println(mad3.computeMonthAndDayFromDaysAdded(500).toString());
        System.out.println(mad5.computeMonthAndDayFromDaysAdded(31).toString());
        System.out.println(mad6.computeMonthAndDayFromDaysAdded(30).toString());
    }
}
