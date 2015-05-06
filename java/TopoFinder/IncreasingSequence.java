package com.derik;

/**
 * Write a function that returns true if it's an increasing sequence (+1 every time) and false if it's anything else.
 */
public class IncreasingSequence {
    /**
     * Compute if a sequence increases by 1 every time
     * @param sequence an array of integers
     * @return true if the sequence is incrementally increased by 1 in the array
     */
    public boolean isIncreasingSequence(int[] sequence){
        for (int i = 0; i < sequence.length - 1; i++) {
            int valueOfNextNumberInSequence = sequence[i+1];
            int currentIndexValue = sequence[i];
            if (currentIndexValue + 1 != valueOfNextNumberInSequence) {
                System.out.println("This is not an incrementally increasing sequence.");
                return false;
            }
        }
        System.out.println("This in an incrementally increasing sequence.");
        return true;
    }
}
