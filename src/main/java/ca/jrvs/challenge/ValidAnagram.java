package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */
public class ValidAnagram {

  public static void anagramCheck(String s, String t) {
    s = s.toLowerCase();
    t = t.toLowerCase();

    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    Arrays.sort(sArray);
    Arrays.sort(tArray);

    if (sArray.equals(tArray)) {
      System.out.println("The passed strings are anagrams of each other");
    } else {
      System.out.println("The strings are not valid anagrams");
    }
  }

}
