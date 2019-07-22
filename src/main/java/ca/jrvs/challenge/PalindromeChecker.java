package ca.jrvs.challenge;

import java.util.Arrays;

public class PalindromeChecker {

  // Take in String
  // Save copy of original string
  // Put String in Reverse order
  // see if reverse matches original
  // Return result of above line

  public static void palindromeCheck(String s) {
    char[] stringtoCheck = s.toCharArray();
    int length = stringtoCheck.length;

    char[] reverseArray = null;

    for (int i = 0; i < stringtoCheck.length; i++) {
      reverseArray[length] = stringtoCheck[i];
      length--;
    }

    if (s.equals(Arrays.toString(reverseArray))) {
      System.out.println("The string is a palindrome");
    } else {
      System.out.println("The string is not a palindrome");
    }
  }

}
