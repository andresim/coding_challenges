package ca.jrvs.challenge;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once
 * and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 */
public class RemoveDupesFromSortedArray {

  public int removeDupes(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    // This loop is basically counting the # of times the number in the array changes (AKA counts all new #s)
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }
}
