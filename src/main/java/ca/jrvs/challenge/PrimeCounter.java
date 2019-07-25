package ca.jrvs.challenge;

public class PrimeCounter {

  /**
   * Count the number of prime numbers less than a non-negative number, n.
   *
   * @param n number to search for primes less than
   */
  public int countPrimes(int n) {
    boolean[] isPrime = new boolean[n];
    // Starts at 2 because 0 and 1 are not prime (removes check conditions later on)
    // Creates array of true for all numbers up to n
    for (int i = 2; i < n; i++) {
      isPrime[i] = true;
    }

    // Sees if the number has already been marked as not prime and skips it
    // If it hasnt been marked as not prime then it will set multiples of it to not prime
    // e.g. When outer for loop starts at i = 2, then all multiples of 2 will be set to not prime
    // then when i = 3, all multiples of 3 will be set to not prime, this will continue until i*i >= n
    // Since we dont need to check the second half
    for (int i = 2; i * i < n; i++) {
      if (!isPrime[i]) {
        continue;
      }
      for (int j = i * i; j < n; j += i) {
        isPrime[j] = false;
      }
    }
    // Will count the # of true elements left in the isPrime array
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (isPrime[i]) {
        count++;
      }
    }
    return count;
  }
}