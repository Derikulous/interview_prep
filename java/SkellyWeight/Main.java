package com.derik;

public class Main {
    public static void main(String[] args) {
        SkellyWeight fridge = new SkellyWeight();
        System.out.println("The most weight gained in one week is " + fridge.computeMaxWeightGain() + " lbs.");
        System.out.println("The most weight lost in one week is " + fridge.computeMaxWeightLoss() + " lbs.");
        System.out.println("The standard deviation is " + fridge.computeStandardDeviation());
    }
}
