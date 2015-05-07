package com.derik;

import java.util.Arrays;

public class Prominence {
    /**
     * Find the 1D topographical prominence. The prominence is the difference between the elevation of the peak and the elevation of the key col.
     * @param location an integer that represents a peak
     * @param landscape an array of integers that represent various peak heights. The lowest value is the lowest peak, and the highest value is the parent peak.
     * @return an integer that represents the prominence of the location
     */
    public int getProminence(int location, int[] landscape){
        // throw exception if the location value doesn't exist in the peak array
        int loc = Arrays.binarySearch(landscape, location);

        if (loc == -1) {
            System.out.println("That peak value does not exist.");
            return location;
        }

        int prominence = 0;
        int key_col = landscape[0];

        for (int num : landscape) {
            if (num < key_col){
                key_col = num;
            }
        }
        prominence = location - key_col;
        System.out.println("The prominence of this mountain range is " + prominence);
        return prominence;
    }

    public int getMaximumProminence(int[] landscape){
        int lowestValueIndex = 0;
        int highestValueIndex = 0;
        int firstValue = landscape[0];

        // get highest index value
        for (int i = 0; i < landscape.length; i++) {
            int comparisonValue = landscape[i];
            if (comparisonValue > firstValue) {
                firstValue = comparisonValue;
                highestValueIndex = i;
            }
        }

        for (int j = 0; j < landscape.length; j++) {
            int comparisonValue = landscape[j];
            if (comparisonValue < firstValue) {
                lowestValueIndex = j;
                firstValue = comparisonValue;
            }
        }

        int maxProminence = landscape[highestValueIndex] - landscape[lowestValueIndex];
        System.out.println("The maximum prominence of this mountain range is " + maxProminence);
        return maxProminence;
    }
}
