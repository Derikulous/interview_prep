package com.derik;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] dongArray = generateDongData();
    int numberOfDongs = dongArray.length;
    int sumOfDongLength = getSumOfDongArray(dongArray);

        // print out the average dong length
    float averageDongLength = (float) sumOfDongLength / numberOfDongs;
    System.out.println("The average dong length in the gym showers today is " + averageDongLength + " centimeters.");

        // print out the index of the largest dong
    int largestDongIndex = findLargestDongIndex(dongArray);
    System.out.println("The index of the largest dong you've seen is " + largestDongIndex);

        // print out the median dong size
    int medianDongSize = findMedianDongSize(dongArray);
    System.out.println("The median dong size you've encountered today is " + medianDongSize + " centimeters.");

        // print out the mode of dong size
    int[] frequentDongs = findMostFrequentDongSize(dongArray);
    int indexOfMostCommonDongLength = findLargestDongIndex(frequentDongs);
    System.out.println("You saw " + frequentDongs[indexOfMostCommonDongLength]+ " dongs of the same size today.");
  }

    /**
     * Create a list of dongs in Array format
     *
     * @param dongArray an array of integers representing dong lengths in centimeters
     * @return an array of dong lengths in centimeters
     */
    public static int[] generateDongData(){
      Scanner dongScanner = new Scanner(System.in);
      Scanner numberOfDongs = new Scanner(System.in);
      System.out.print("You've entered dong heaven: L.A. Fitness. Before proceeding, enter the number of dongs you expect to see today: ");

      int sizeOfDongArray = numberOfDongs.nextInt();
      if( sizeOfDongArray > 0){
        System.out.println("Wonderful, you should expect to see " + sizeOfDongArray + " dongs today");
        int[] dongArray = new int[sizeOfDongArray];

        System.out.print("Upon arriving in the showers, you cannot help but notice the variation in dong size. What are their individual lengths, in centimeters? ");
          for (int i = 0; i < dongArray.length; i++) {
            System.out.print("What is the size of dong " + (i + 1) + " ?");
            int dongLength = dongScanner.nextInt();
            dongArray[i] = dongLength;
          }
      return dongArray;
      } else {
        System.out.println("Whew. No dongs will be seen today. Go home safely.");
      }
    }

    /**
     * Get the sum of all dong lengths.
     *
     * @param arr an array of integers representing dong lengths in cm
     * @return the total dong length in centimeters
     */
    public static int getSumOfDongArray(int[] arr){
      int sum = 0;
      for(int num : arr){
        sum += num;
      }
      return sum;
    }

    /**
     * Find the longest dong in the collection
     *
     * @param arr an array of integers representing dong lengths in cm
     * @return the index that represents the largest dong in the collection
     */
    public static int findLargestDongIndex(int[] arr){
      int largestDongIndex = 0;
      for (int i = 0; i < arr.length; i++) {
        int newMaxDongLength = arr[i];
        if(newMaxDongLength > arr[largestDongIndex]){
          largestDongIndex = i;
        }
      }
      return largestDongIndex;
    }

    /**
     * Find the median value from dongs in the collection
     *
     * @param arr an array of integers representing dong lengths in cm
     * @return the median value that represents the median dong length
     */
    public static int findMedianDongSize(int[] arr){
      Arrays.sort(arr);
      int firstIndex = 0;
      int lastIndex = arr.length - 1;
      int middleIndex = (firstIndex + lastIndex) / 2;
      int medianValue = 0;
      boolean isOddArray = arr.length % 2 == 1;
      if(isOddArray){
        medianValue = arr[middleIndex];
      } else {
        int middleIndexTwo = middleIndex + 1;
        medianValue = (arr[middleIndex] + arr[middleIndexTwo]) / 2;
      }
      return medianValue;
    }

    /**
     * Find the most common dong lengths in the collection
     *
     * @param arr an array of integers representing dong lengths in cm
     * @return an array of values that represent the number of times each dong length is captured
     */
    public static int[] findMostFrequentDongSize(int[] arr){
      int[] dongSizeArray = new int[64];
      for (int i = 0; i < arr.length; i++) {
        dongSizeArray[arr[i]]++;
      }
      return dongSizeArray;
    }
  }
