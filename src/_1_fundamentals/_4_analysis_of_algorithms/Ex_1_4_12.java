package _1_fundamentals._4_analysis_of_algorithms;

import edu.princeton.cs.algs4.StdOut;

/**
 * Write a program that, given two sorted arrays of N int values, prints all elements
 * that appear in both arrays, in sorted order. The running time of your program
 * should be proportional to N in the worst case.
 */
public class Ex_1_4_12 {

    public static void main(String[] args) {
        int[] sorted1 = {1, 3, 4, 7, 7, 9, 10, 13};
        int[] sorted2 = {3, 5, 7, 10, 11, 13, 15};
        printSimilar(sorted1, sorted2);
    }

    private static void printSimilar(int[] sorted1, int[] sorted2) {
        int i = 0;
        int j = 0;
        while (i < sorted1.length && j < sorted2.length) {
            if (sorted1[i] > sorted2[j]) {
                j++;
            } else if (sorted1[i] < sorted2[j]) {
                i++;
            } else {
                StdOut.println(sorted1[i]);
                while (i < sorted1.length-1 && sorted1[i + 1] == sorted1[i])
                    i++;
                i++;
                while (j < sorted2.length-1 && sorted2[j + 1] == sorted2[j])
                    j++;
                j++;
            }
        }
    }

}
