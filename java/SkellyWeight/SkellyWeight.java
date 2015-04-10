package com.derik;

/**
 * A basic weight analyzer that finds the most weight gained in a single week, the most weight lost in a single week, and the standard deviation
 */
public class SkellyWeight {
//    public static final int[] WEIGHTS = new int[]{115, 120, 135, 140, 143, 142, 145, 146, 148, 148, 142, 135, 115, 95};

    private int[] weights;

    public SkellyWeight(int[] weights){
        this.weights = weights;
    }

    /**
     * A method that calculates the maximum weight gained from a week to week comparison
     * @return mostWeightGained
     */
    public int computeMaxWeightGain(){
        if (weights.length == 1){
            System.out.println("You only have 1 week of results. Add more to determine weight gained.");
            return weights[0];
        }

        int mostWeightGained = weights[1] - weights[0];

        for (int i = 0; i < weights.length-1; i++) {
            int weightComparison = weights[i+1] - weights[i];

            if (weightComparison > mostWeightGained){
                mostWeightGained = weightComparison;
            }
        }

        if (mostWeightGained <=0){
            System.out.println("You did not gain any weight. Congrats, you only lost weight!");
            return -1;
        }

        System.out.println("The most weight gained in one week is " + mostWeightGained + " lbs.");
        return mostWeightGained;
    }

    /**
     * A method that calculates the maximum weight lost from a week to week comparison
     * @return mostWeightLost
     */
    public int computeMaxWeightLoss(){
        if (weights.length == 1){
            System.out.println("You didn't lose any weight because you only have 1 week of results.");
            return weights[0];
        }

        int mostWeightLost = weights[0] - weights[1];

        for (int i = 0; i < weights.length-1; i++) {
            int weightComparison = weights[i] - weights[i+1];

            if (weightComparison > mostWeightLost){
                mostWeightLost = weightComparison;
            }
        }

        if (mostWeightLost <= 0){
            System.out.println("You did not lose any weight. Congrats, you only gained weight!");
            return -1;
        }

        System.out.println("The most weight lost in one week is " + mostWeightLost + " lbs.");
        return mostWeightLost;
    }

    public int getSumOfWeightArray(){
        int sum = 0;
        for (int num : weights){
            sum += num;
        }
        return sum;
    }

    /**
     * Variance is defined as the spread of the numbers in a particular set.
     * To calculate this, we take the difference of each number from the mean, then square the absolute value from the result.
     * The result is then a sum of all the squared values divided by the number of elements in the set.
     * @return variance
     */
    public int getVariance(){
        int mean = getSumOfWeightArray() / weights.length;
        int result = 0;

        for (int num : weights){
            int difference = num - mean;
            int square = (int) Math.pow(difference, 2);
            result += square;
        }
        int variance = result / weights.length;
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
