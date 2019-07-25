package ca.jrvs.challenge;

import java.util.Arrays;

public class FindDuplicateNum {

  /**
   * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive)
   * , prove that at least one duplicate number must exist. Assume that there is only one duplicate
   * number, find the duplicate one.
   * Expected: O(n)
   */
  public int findDuplicate(int[] nums) {
    //Using a sorting method to make sure its O(n)
    Arrays.sort(nums);

    // Initialize to an int that would never be returned

    int duplicate = -1;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == nums[i+1]){
        duplicate = nums[i];
        break;
      }
    }
    return duplicate;
  }

}
