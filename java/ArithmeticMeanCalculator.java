package com.derik;

import java.util.Scanner;

public class Main {
// Given an array of integers, compute the arithmetic mean
  public static void main(String[] args) {
    int[] numArray = generateTestData();

    int sum = getSumOfArray(numArray);
    int numberOfNumbers = numArray.length;
    float mean = (float) sum / numberOfNumbers;
    System.out.println(mean);
  }

  public static int[] generateTestData(){
    Scanner numberInput = new Scanner(System.in);
    System.out.print("Enter how many numbers you want: ");

    int sizeOfArray = numberInput.nextInt();

    int[] intArray = new int[sizeOfArray];

    for (int i=0; i < intArray.length; i++) {
      int val = (int) (Math.random() * 10);
      intArray[i] = val;
    }
    return intArray;
  }

  public static int getSumOfArray(int[] arr){
// sum of a collection of numbers
    int sum = 0;
    for(int num : arr) {
      sum += num;
    }
    return sum;
  }
}
