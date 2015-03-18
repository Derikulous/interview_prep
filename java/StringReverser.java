package com.derik;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word or sentence: ");

    String sentence = scanner.nextLine();
    reversedString(sentence);
    System.out.print(sentence);
  }

  static String reversedString(String originalString){
    String emptyStringToFill = "";
    for (int i = originalString.length() - 1; i >= 0 ; i--) {
      char endOfString = originalString.charAt(i);
      emptyStringToFill += endOfString;
    }
    System.out.println(emptyStringToFill);
  }
}
