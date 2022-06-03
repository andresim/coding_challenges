package ca.challenge;

import java.math.BigInteger;

/**
 * Program to check if a string contains only digits
 */
public class OnlyDigits {

  public static void digitsCheck(String s) {
    try {
      BigInteger bigIntStr = new BigInteger(s);
      System.out.println("Passed string contains only digits: " + bigIntStr);
    } catch (NumberFormatException e) {
      throw new RuntimeException("Passed string contains non-digit characters");
    }
  }
}