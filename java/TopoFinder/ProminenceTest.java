package com.derik;

import static org.junit.Assert.*;

public class ProminenceTest {

    @org.junit.Test
    public void testGetProminence() throws Exception {
        Prominence promCheck = new Prominence();
        int[] landscape = {3, 2, 4, 5, 6, 2};
        assertEquals(1, promCheck.getProminence(3, landscape));
    }

    @org.junit.Test
    public void testGetProminence2() throws Exception {
        Prominence promCheck = new Prominence();
        int[] landscape = {5, 3, 1, 2, 7, 4, 3, 9};
        assertEquals(6, promCheck.getProminence(7, landscape));
    }

    @org.junit.Test
    public void testGetMaximumProminence() throws Exception {
        Prominence promCheck = new Prominence();
        int[] landscape = {5, 3, 1, 2, 7, 4, 3, 9};
        assertEquals(8, promCheck.getMaximumProminence(landscape));
    }
}
