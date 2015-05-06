package com.derik;

import java.util.ArrayList;

public class Divisible {
    /**
     * You're given a list of numbers. Return whether any number is divisible by any other number.
     * @param list an ArrayList of unique integers
     * @return true if a number is divisible by another in the ArrayList
     */
    public boolean isNonDivisible(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int currentDividend = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    j++;
                }
                int comparisonDivisor = list.get(j);
                int modulation = currentDividend % comparisonDivisor;

                if (modulation == 0) {
                    System.out.println("This set of numbers contains at least 2 that are divisible by each other.");
                    return true;
                }
            }
        }
        return false;
    }
}
