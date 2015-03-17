package com.derik;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a name");
    String str = in.nextLine();
    if(vowelCheck(str) == true){
      System.out.println("Your name is feminine in nature. Not gonna make it.");
    } else {
      System.out.println("Your name is masculine. Still not gonna make it.");
    }
  }

  static boolean vowelCheck(String str){
    if (str.endsWith("a") || str.endsWith("e") || str.endsWith("i")|| str.endsWith("o")|| str.endsWith("u")){
      return true;
    } else {
      return false;
    }
  }
}

