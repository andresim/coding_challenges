package ca.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Function to find the longest substring within a given string of characters that
 * does not repeat any characters. Uses a hashmap and rolling window for performance optimization.
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap(); 

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    
}
