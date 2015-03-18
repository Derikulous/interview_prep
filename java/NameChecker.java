package com.derik;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    ArrayList<String> peopleArray = new ArrayList<String>();

    while (true) {
      System.out.print("Enter a first name: ");
      String firstName = user_input.next();

      System.out.print("Enter a last name: ");
      String lastName = user_input.next();
// concatenate first and last name
      String fullName = firstName + " " + lastName;

      if(!nameAlreadyExists(fullName, peopleArray)){
        peopleArray.add(fullName);
      }
      System.out.println(peopleArray);
    }
  }
  static boolean nameAlreadyExists(String input, ArrayList<String> array) {
    for(String name : array){
      if(input.equals(name)){
        System.out.println("Sorry, this name already exists");
        return true;
      }
    }
    return false;
  }
}
