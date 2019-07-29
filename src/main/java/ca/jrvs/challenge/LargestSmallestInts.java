package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * Program to return the largest and smallest integers given an unsorted integer array
 */
public class LargestSmallestInts {

  public static void largeSmall(int[] array) {

    int[] largeSmall = new int[2];

    Arrays.sort(array);
    largeSmall[0] = array[0];
    largeSmall[1] = array[array.length - 1];

    System.out.println("[" + largeSmall[0] + "," + largeSmall[1] + "]");
  }

}
