package com.derik;

import static org.junit.Assert.*;

public class ProminenceTest {

    @org.junit.Test
    public void testGetProminence() throws Exception {
        try { // location should not be on the edge
            Prominence promCheck = new Prominence();
            int[] landscape = {3, 2, 4, 5, 6, 2};
            promCheck.getProminence(3, landscape);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        try { // peak value should exist
            Prominence promCheck = new Prominence();
            int[] landscape = {3, 2, 4, 5, 6, 2};
            promCheck.getProminence(1, landscape);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        try { // location should not be equal to or less than zero
            Prominence promCheck = new Prominence();
            int[] landscape = {3, 2, 0, 5, 3, 2};
            promCheck.getProminence(0, landscape);
            fail("Should have raised an illegal argument exception");
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void testGetProminence2() throws Exception {
        Prominence promCheck = new Prominence();
        int[] landscape = {5, 3, 1, 2, 7, 4, 3, 9};
        assertEquals(4, promCheck.getProminence(7, landscape));
    }

    @org.junit.Test
    public void testGetProminence3() throws Exception {
        Prominence promCheck = new Prominence();
        int[] landscape = {2, 3, 5, 3, 1, 6, 4, 5, 11, 2};
        assertEquals(3, promCheck.getProminence(5, landscape));
    }
}
