package ca.jrvs.challenge;

public class RemoveArrayElement {

  /**
   * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
   *
   * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
   *
   * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
   */

  public int removeArrayElement(int[] nums, int val){
    int remainingLength = nums.length;
    int count = 0;

    for(int i = 0; i<nums.length; i++){
      if (nums[i] == val){
        count++;
      }
    }
    // If it finds the value it will swap it with one from the end of the array, as long as that num
    // is not another instance of the value.
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == val){
        for(int j = nums.length-1; j>i; j--){
          if(nums[j] != val){
            int temp = nums[j];
            nums[j] = nums[i];
            nums [i] = temp;
            break;
          }
        }
      }
    }

    return remainingLength-count;
  }

}
