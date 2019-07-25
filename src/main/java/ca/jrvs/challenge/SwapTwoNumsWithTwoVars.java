package ca.jrvs.challenge;

public class SwapTwoNumsWithTwoVars {

  public static void swapNums(int x, int y) {
    // Going to add the two together into one variable, then subtract to get the difference

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("Numbers have been swapped.");
  }

}
