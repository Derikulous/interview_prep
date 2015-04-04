package com.derik;

import static org.junit.Assert.*;

public class MonthAndDayTest {

    @org.junit.Test
    public void testToString() throws Exception {
        MonthAndDay mad = new MonthAndDay(1,3);
        assertEquals("Month: 0, Day: 2", mad.toString());
    }

    @org.junit.Test
    public void testMonthAndDayForDaysSinceJan1st() throws Exception {
        try { // month should not be less than 1
            MonthAndDay mad = new MonthAndDay(0, 12);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        try { // month should not be greater than 12
            MonthAndDay mad = new MonthAndDay(13, 12);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        try { // day should not be less than 1
            MonthAndDay mad = new MonthAndDay(1, 0);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        try { // day should not be greater than 31
            MonthAndDay mad = new MonthAndDay(1, 32);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void testGetMonth() throws Exception {
        MonthAndDay mad = new MonthAndDay(5, 12);
        assertEquals(5, mad.getMonth());
    }

    @org.junit.Test
    public void testGetDay() throws Exception {
        MonthAndDay mad = new MonthAndDay(5, 12);
        assertEquals(12, mad.getDay());
    }

    @org.junit.Test
    public void testComputeDayOfYear() throws Exception {
        MonthAndDay mad = new MonthAndDay(3, 16);
        assertEquals(74, mad.computeDayOfYear());

        MonthAndDay mad2 = new MonthAndDay(12, 31);
        assertEquals(364, mad2.computeDayOfYear());
    }

    @org.junit.Test
    public void testComputeMonthAndDayFromDaysAdded() throws Exception {
        MonthAndDay mad = new MonthAndDay(12, 30);
        assertEquals("Month: 1, Day: 1", mad.computeMonthAndDayFromDaysAdded(2).toString());

        MonthAndDay mad2 = new MonthAndDay(1, 1);
        assertEquals("Month: 2, Day: 28", mad2.computeMonthAndDayFromDaysAdded(58).toString());

        MonthAndDay mad3 = new MonthAndDay(1, 1);
        assertEquals("Month: 1, Day: 1", mad3.computeMonthAndDayFromDaysAdded(365).toString());

        MonthAndDay mad4 = new MonthAndDay(1, 1);
        assertEquals("Month: 1, Day: 2", mad4.computeMonthAndDayFromDaysAdded(366).toString());
    }
}
