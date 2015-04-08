package com.derik;

import static org.junit.Assert.*;

public class SkellyWeightTest {

    @org.junit.Test
    public void testComputeMaxWeightGain() throws Exception {
        SkellyWeight skel = new SkellyWeight();
        assertEquals(15, skel.computeMaxWeightGain());
    }

    @org.junit.Test
    public void testComputeMaxWeightLoss() throws Exception {
        SkellyWeight skel = new SkellyWeight();
        assertEquals(20, skel.computeMaxWeightLoss());
    }

    @org.junit.Test
    public void testGetVariance() throws Exception {
        SkellyWeight skel = new SkellyWeight();
        assertEquals(238, skel.getVariance());
    }

    @org.junit.Test
    public void testComputeStndardDeviation() throws Exception {
        SkellyWeight skel = new SkellyWeight();
        assertEquals(15, skel.computeStandardDeviation());
    }
}
