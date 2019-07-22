package ca.jrvs.challenge;

public class EvenOddChecker {

  // MOD METHOD
  // Do number %2
  // If result of that is = 1 then num is odd

  public static void modCheck(int n) {
    int modVal = n % 2;

    if (modVal == 0) {
      System.out.println("Number is even.");
    } else {
      System.out.println("Number is odd");
    }
  }

  // BIT method
  // Do Number & 1
  // if thats true > num is odd

  public static void bitCheck(int n) {
    if ((n & 1) == 0) {
      System.out.println("Number is odd");
    } else {
      System.out.println("Number is even");
    }
  }

}
