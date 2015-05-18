package com.derik;

public class Prominence {
    /**
     * Find the 1D topographical left col. This will be compared to the right col to determine the key col.
     * @param location an integer that represents a peak
     * @param landscape an array of integers that represent various peak heights. The lowest value is the lowest peak, and the highest value is the parent peak.
     * @return an integer that represents the left col
     */
    public int getLeftCol(int location, int[] landscape){
        int left_col = 0;

        for (int i = 0; i < landscape.length; i++) {
            if (landscape[i] == location) {
                if (landscape[i - 1] < landscape[i] && landscape[i + 1] < landscape[i]) {
                    for (int k = i - 1; k > -1; k--) {
                        if (k == 0 && landscape[k] < landscape[k + 1]) {
                            left_col = landscape[k];
                            System.out.println("The left col is at the boundary. It may or may not be a true col.");
                            break;
                        } else if (landscape[k - 1] > landscape[k]) {
                            left_col = landscape[k];
                            break;
                        }
                    }
                }
            }
        }
        return left_col;
    }

    /**
     * Find the 1D topographical right col. This will be compared to the left col to determine the key col.
     * @param location an integer that represents a peak
     * @param landscape an array of integers that represent various peak heights. The lowest value is the lowest peak, and the highest value is the parent peak.
     * @return an integer that represents the right col
     */
    public int getRightCol(int location, int[] landscape){
        int right_col = 0;

        for (int i = 0; i < landscape.length; i++) {
            if (landscape[i] == location) {
                if (landscape[i - 1] < landscape[i] && landscape[i + 1] < landscape[i]) {

                    for (int j = i + 1; j < landscape.length; j++) {
                        if (landscape[j] > landscape[j - 1]) {
                            right_col = landscape[j - 1];
                            break;
                        } else if (j == landscape.length - 1) {
                            System.out.println("The right col is at the boundary. It may or may not be a true col.");
                            right_col = landscape[j];
                            break;
                        }
                    }
                }
            }
        }
        return right_col;
    }

    /**
     * Find the 1D topographical prominence. The prominence is the difference between the elevation of the peak and the elevation of the key col.
     * @param location an integer that represents a peak
     * @param landscape an array of integers that represent various peak heights. The lowest value is the lowest peak, and the highest value is the parent peak.
     * @return an integer that represents the prominence of the location
     */
    public int getProminence(int location, int[] landscape){
        int prominence = 0;
        int key_col = 0;
        int indexInLocation = -1; //assume that the location is not a peak

        if (location <= 0) {
            throw new IllegalArgumentException("The location cannot be at sea level or below. Choose a different location.");
        }

        for (int i = 0; i < landscape.length; i++) {
            if(landscape[i] == location){
                if (i == 0 || i == landscape.length - 1){
                    throw new IllegalArgumentException("The location you chose is at the edge of the landscape. Choose a different location.");
                } else if (landscape[i - 1] < landscape[i] && landscape[i + 1] < landscape[i]) {
                    indexInLocation = i;
                    break;
                }
            }
        }

        if (indexInLocation == -1) {
            throw new IllegalArgumentException("The location you chose is not a peak in this landscape. Choose a different location.");
        }

        int right_col = getRightCol(location, landscape);
        int left_col = getLeftCol(location, landscape);

        if (right_col > left_col) {
            key_col = right_col;
        } else {
            key_col = left_col;
        }

        prominence = location - key_col;

        System.out.println("The prominence of this mountain range is " + prominence);
        return prominence;
    }

    /**
     * Find the maximum prominence in a given landscape in O(N^2).
     * @param landscape
     * @return the maximum prominence
     */
    public int getMaximumProminence(int[] landscape){
        int maxProminence = 0;

        // begin the searching for maximum prominence at index 1 and never ending at the final index since prominence cannot occur at the edge
        for (int i = 1; i < landscape.length - 1; i++) {

            try {
                int currentProminence = getProminence(landscape[i], landscape);

                if(currentProminence > maxProminence) {
                    maxProminence = currentProminence;
                }
            } catch (IllegalArgumentException e) {
                System.err.println("IllegalArgumentException: " + e.getMessage());
            }

        }
        System.out.println("The maximum prominence of this mountain range is " + maxProminence);
        return maxProminence;
    }
}
