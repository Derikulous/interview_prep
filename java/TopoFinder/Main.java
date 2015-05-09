package com.derik;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;

public class Main {
    // Write a function that returns true if it's an increasing sequence (+1 every time) and false if it's anything else.
    public static void main(String[] args) {
        // Increasing sequence finder
        IncreasingSequence newSeq = new IncreasingSequence();
        int[] sequence = {1, 2, 3, 4};
        int[] sequence2 = {1, 2, 5};
        int[] sequence3 = {-1, 1, 2, 3};

        newSeq.isIncreasingSequence(sequence);
        newSeq.isIncreasingSequence(sequence2);
        newSeq.isIncreasingSequence(sequence3);

        // Is a number divisible by another in the set?
        Divisible newDiv = new Divisible();

        ArrayList<Integer> seq = new ArrayList<Integer>();
        seq.add(4);
        seq.add(2);
        seq.add(7);

        ArrayList<Integer> seq1 = new ArrayList<Integer>();
        seq1.add(2);
        seq1.add(4);
        seq1.add(7);

        newDiv.isNonDivisible(seq);
        newDiv.isNonDivisible(seq1);

        //Prominence finder
        Prominence newProm = new Prominence();
        int[] landscape = {3, 8, 7, 4, 6, 9, 8, 9, 11, 2};
        int[] landscape2 = {5, 3, 1, 6, 2, 7, 4, 3, 9};
        int[] landscape3 = {5, 3, 1, 2, 8, 4, 3, 9};
        int[] landscape4 = {5, 3, 2, 3, 2, 1, 3, 9};
        newProm.getProminence(8, landscape);
        newProm.getProminence(7, landscape2);
        newProm.getProminence(8, landscape3);
        newProm.getProminence(3, landscape4);
        newProm.getProminence(5, landscape4);
    }
}
