package com.derik;

/**
 * A basic weight analyzer that finds the most weight gained in a single week, the most weight lost in a single week, and the standard deviation
 */
public class SkellyWeight {
    public static final int[] WEIGHTS = new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95};

    /**
     * A method that calculates the maximum weight gained from a week to week comparison
     * @return mostWeightGained
     */
    public int computeMaxWeightGain(){
        int mostWeightGained = WEIGHTS[1] - WEIGHTS[0];

        for (int i = 0; i < WEIGHTS.length; i++) {
            if(i+1 != WEIGHTS.length){
                int weightComparison = WEIGHTS[i+1] - WEIGHTS[i];

                if(weightComparison > mostWeightGained){
                    mostWeightGained = weightComparison;
                }
            }
        }
        return mostWeightGained;
    }

    /**
     * A method that calculates the maximum weight lost from a week to week comparison
     * @return mostWeightLost
     */
    public int computeMaxWeightLoss(){
        int mostWeightLost = WEIGHTS[0] - WEIGHTS[1];

        for (int i = 0; i < WEIGHTS.length; i++) {
            if(i+1 != WEIGHTS.length){
                int weightComparison = WEIGHTS[i] - WEIGHTS[i+1];

                if(weightComparison > mostWeightLost){
                    mostWeightLost = weightComparison;
                }
            }
        }
        return mostWeightLost;
    }

    public int getSumOfWeightArray(){
        int sum = 0;
        for(int num : WEIGHTS){
            sum += num;
        }
        return sum;
    }

    /**
     * Variance is defined as the spread of the numbers in a particular set.
     * To calculate this, we take the difference of each number from the mean, then square the absolute value from the result.
     * The result is then a sum of all the squared values. Variance is calculated by dividing the result from the number of elements in the set.
     * @return variance
     */
    public int getVariance(){
        int mean = getSumOfWeightArray() / WEIGHTS.length;
        int result = 0;

        for (int num : WEIGHTS){
            int difference = num - mean;
            int square = (int) Math.pow(difference, 2);
            result += square;
        }
        int variance = result / WEIGHTS.length;
        return variance;
    }

    /**
     * This method simply calculates the standard deviation from the variance.
     * @return stdev as an integer instead of double
     */
    public int computeStandardDeviation(){
        double stdev = Math.sqrt(getVariance());
        return (int) stdev;
    }
}
