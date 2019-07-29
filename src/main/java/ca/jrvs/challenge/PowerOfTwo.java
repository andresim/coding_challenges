package ca.jrvs.challenge;

import static java.lang.StrictMath.log;

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

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
