package com.derik;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);

    while(true){
      System.out.println("Enter a weight in pounds. Enter -1 to exit");
      float weightInPounds = user_input.nextFloat();
      double conversionFactor = 0.453592;
      double poundsToKiloConverter = weightInPounds * conversionFactor;
      if (weightInPounds == EXIT_CODE){
        break;
      }
      System.out.println(poundsToKiloConverter);
    }
  }
  public static int EXIT_CODE = -1;
}
