package com.derik;

import static org.junit.Assert.*;

public class SkellyWeightTest {

    @org.junit.Test
    public void testComputeMaxWeightGain() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95});
        assertEquals(15, skel.computeMaxWeightGain());
    }

    @org.junit.Test
    public void testComputeMaxWeightLoss() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95});
        assertEquals(20, skel.computeMaxWeightLoss());
    }

    @org.junit.Test
    public void testGetVariance() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95});
        assertEquals(238, skel.getVariance());
    }

    @org.junit.Test
    public void testComputeStandardDeviation() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95});
        assertEquals(15, skel.computeStandardDeviation());
    }

    @org.junit.Test
    public void testWeightGainWithOneElementIsFirstElement() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{100});
        assertEquals(100, skel.computeMaxWeightGain());
    }

    @org.junit.Test
    public void testWeightLossWhenNoLosses() throws Exception {
        SkellyWeight skel = new SkellyWeight(new int[]{300, 320, 400});
        assertEquals(-1, skel.computeMaxWeightLoss());
    }
}
