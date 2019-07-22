package ca.jrvs.challenge;

import java.util.Arrays;

public class LargestSmallestInts {

  // Given an array of integers, will return the smallest and largest values

  // Sort the array using built in array method
  // Return values at index 0 and index = array.length - 1

  public static int[] largeSmall(int[] array){

    int[] largeSmall = new int[2];

    Arrays.sort(array);
    largeSmall[0] = array[0];
    largeSmall[1] = array[array.length-1];

    return largeSmall;

    //OR:
    //System.out.println(largeSmall);
  }

}
