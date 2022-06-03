package ca.challenge;

import java.util.Arrays;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 */
public class PalindromeChecker {

  public static void palindromeCheck(String s) {

    if (s.equals("")) {
      System.out.println("The string is a palindrome");
      return;
    }
    char[] stringToCheck = s.toCharArray();
    int length = stringToCheck.length;

    char[] reverseArray = null;

    for (int i = 0; i < stringToCheck.length; i++) {
      reverseArray[length] = stringToCheck[i];
      length--;
    }

    if (s.equals(Arrays.toString(reverseArray))) {
      System.out.println("The string is a palindrome");
    } else {
      System.out.println("The string is not a palindrome");
    }
  }

}
