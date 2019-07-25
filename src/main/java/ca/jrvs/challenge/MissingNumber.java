package ca.jrvs.challenge;

import java.util.HashMap;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * Due to the static properties of the passed array, we can actually use the length of the array in place of the largest number
 */
public class MissingNumber {

  public static void missingNum(int[] nums){
    // Find largest number
    // Store all nums in passed array in a hashmap (dictionary)
    // For each value from 0 to largest, check to see if it is in the dictionary
    // if it is not, return that number

    // Create hashmap with all the array values as keys
    HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
    for (Integer value : nums) {
      numsMap.put(value, 1);
    }

    for(int i = 0; i<=nums.length; i++){
      if(!numsMap.containsKey(i)){
        System.out.println("Missing number is " + i);
      }
    }
  }

}
