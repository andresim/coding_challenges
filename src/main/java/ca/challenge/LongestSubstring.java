package ca.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Function to find the longest substring within a given string of characters that
 * does not repeat any characters. 
 */
public class LongestSubstring {

    /*
    "abcbegd"
    ans = 1
    map contains a

    ans = 2
    map contains ab

    ans = 3
    map contains abc

    ans = 

    */

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
