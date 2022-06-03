package ca.challenge;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such
 * that each number is the sum of the two preceding ones, starting from 0 and 1. Given N, calculate
 * the fibonacci number at N
 */
public class FibonacciNumbers {

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