package ca.challenge;

/**
 * Program that swaps two numbers without a third variable by doing some clever math
 */
public class SwapTwoNumsWithTwoVars {

  public static void swapNums(int x, int y) {

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("Numbers have been swapped.");
  }

}
