package ca.jrvs.challenge;

public class FibonacciNumbers {

  // Recursion will be huge here

  // Given a # n, have function call itself for n-1 and n-2 (recursively)
  // Have static conditions so that if n = 1, it will return 1 and if n = 0 it will return 0
  // Sum the F(n-1) and F(n-2) values

  public static int fibonacci(int n) {
    int sum = 0;
    if (n == 0) {
      return sum;
    } else if (n == 1) {
      sum = 1;
    } else {
      sum = fibonacci(n - 1) + fibonacci(n - 2);
    }
    return sum;
  }
}