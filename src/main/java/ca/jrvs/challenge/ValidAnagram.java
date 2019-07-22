package ca.jrvs.challenge;

import java.util.Arrays;

public class ValidAnagram {

  // Given two strings:

  // Convert both two lowercase
  // Sort both into alphabetical order
  // If string1 = string 2 then its an anagram

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
