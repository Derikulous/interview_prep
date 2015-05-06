package com.derik;

public class Prominence {
    /**
     * Find the 1D topographical prominence. The prominence is the difference between the elevation of the peak and the elevation of the key col.
     * @param location an integer that represents a peak
     * @param landscape an array of integers that represent various peak heights. The lowest value is the lowest peak, and the highest value is the parent peak.
     * @return an integer that represents the prominence of the location
     */
    public int getProminence(int location, int[] landscape){
        int prominence = 0;
        int key_col = landscape[0];

        for (int num : landscape){
            if (num < key_col){
                key_col = num;
            }
        }
        prominence = location - key_col;
        System.out.println("Prominence is " + prominence);
        return prominence;
    }
}
