package ca.jrvs.challenge;

import java.math.BigInteger;

public class OnlyDigits {

  // Take in string
  // Attempt to convert to a big int
  // Return result

  public static void digitsCheck(String s) {
    try {
      BigInteger bigIntStr = new BigInteger(s);
      System.out.println("Passed string contains only digits: " + bigIntStr);
    } catch (NumberFormatException e) {
      throw new RuntimeException("Passed string contains non-digit characters");
    }
  }
}