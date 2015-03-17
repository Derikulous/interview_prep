package com.derik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> array = dictArray("/usr/share/dict/words");
    public static int[] countArray = new int[26];


    public static void main(String[] args) {
        for (String word : array){
            char firstLetterChar = word.charAt(0);
            getFirstLetter(firstLetterChar);
        }

        printFirstLetterArray();

    }

    static void getFirstLetter(char c){
        int ci = (int) c;
        int idx = ci - 65;
        countArray[idx]++;
    }

    static void printFirstLetterArray(){
        for (int i = 0; i < countArray.length; i++) {
            String letter = Character.toString((char)(i+65));
            int howManyFirstLetters = countArray[i];
            if(howManyFirstLetters > 0){
                System.out.println(letter + ":" + howManyFirstLetters);
            }
        }
    }

    static ArrayList<String> dictArray(String filename){
        try{
            Scanner sc = new Scanner(new File(filename));
            ArrayList<String> lines = new ArrayList<String>();
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine().toUpperCase());
            }
            return lines;
        } catch(FileNotFoundException e) {
            return new ArrayList<String>();
        }
    }
}
