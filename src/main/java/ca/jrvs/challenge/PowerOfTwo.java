package ca.jrvs.challenge;

import static java.lang.StrictMath.log;

public class PowerOfTwo {

  // Check to see if input # is a power of 2

  // Static condition to check if input is 1
  // Static condition to check if # is odd

  // Do log of the number over log 2
  // Check to see if the result is a whole number (no decimals) (can use % for this)

  public static void powOfTwoCheck(int n) {

    String good = "This number is a valid power of 2";
    String bad = "This number is not a valid power of 2";
    if (n == 1) {
      System.out.println(good);
    } else if (n % 2 == 1) {
      System.out.println(bad);
    } else {
      double result = log(n) / log(2);
      if (result % 1 == 0) {
        System.out.println(good);
      } else {
        System.out.println(bad);
      }

    }
  }
}
