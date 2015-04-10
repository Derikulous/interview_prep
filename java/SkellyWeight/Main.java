package com.derik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        Scanner weeksToAdd = new Scanner(System.in);

        System.out.println("How many weeks will you weigh yourself?");

        int sizeOfWeekArray = weeksToAdd.nextInt();

        while (sizeOfWeekArray <= 0){
            System.out.println("Please add more than 0 weeks of measurements.");
            sizeOfWeekArray = weeksToAdd.nextInt();
        }

        int[] weightsArray = new int[sizeOfWeekArray];

        for (int i = 0; i < weightsArray.length; i++) {
            System.out.println("How much did you weigh during the beginning of week " + (i + 1));
            int weightScanner = user_input.nextInt();

            while (weightScanner <= 0){
                System.out.println("Add a positive value for your weight.");
                weightScanner = user_input.nextInt();
            }
            weightsArray[i] = weightScanner;
        }

        SkellyWeight fridge = new SkellyWeight(weightsArray);
        fridge.computeMaxWeightGain();
        fridge.computeMaxWeightLoss();
        System.out.println("The standard deviation is " + fridge.computeStandardDeviation());
    }
}
