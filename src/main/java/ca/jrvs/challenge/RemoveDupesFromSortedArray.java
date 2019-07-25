package ca.jrvs.challenge;

import java.util.HashMap;

public class RemoveDupesFromSortedArray {

  public int removeDupes(int[] nums){
    if(nums.length == 0){
      return 0;
    }
    int i = 0;
    // This loop is basically counting the # of times the number in the array changes (AKA counts all new #s)
    for(int j = 1; j<nums.length; j++){
      if(nums[i] != nums[j]){
        i++;
        nums[i] = nums[j];
      }
    }
    return i+1;
  }
}
