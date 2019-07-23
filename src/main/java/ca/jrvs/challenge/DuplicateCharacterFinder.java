package ca.jrvs.challenge;

import java.util.HashMap;

public class DuplicateCharacterFinder {

  // For each character, look it up in the dictionary to see if there are other instances, if not,
  // put it in the dictionary.
  // This implementation looks to do the above in O(n) time

  public static void dupeChars(String s) {
    char[] stringArray = s.toCharArray();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (Character letter : stringArray) {
      if (map.containsKey(letter)) {
        System.out.println("Found a duplicate letter: " + letter);
      } else {
        map.put(letter, 1);
      }
    }
  }
}
