package ca.challenge;

import java.util.HashMap;
import java.util.Map;

/*
 * Function that will return the indices of two numbers in a given array of integers such that
 * the two numbers add up to a given target value. This version uses a Hashmap for performance
 * improvements.
 */
public class TwoSumHashMap {

    public int[] twoSumHash(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i); 
            }
        }
        return new int[0];
    }

}
