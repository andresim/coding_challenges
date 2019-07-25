package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

  // Sorts array then compares an element to the one following. If there are duplicates then they will be sorted beside eachother
  public boolean containsInt(int[] nums){
    Arrays.sort(nums);
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == nums[i+1]){
        return true;
      }
    }
    return false;
  }

}
