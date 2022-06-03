package ca.challenge;

/**
 * Classic Fizzbuzz. This version allows users to input the numbers they want to fizz and buzz on
 */
public class FizzBuzz {

    public void fizzBuzzer(int limit, int fizzer, int buzzer) {

        for (int i = 1; i < limit+1; i++){
            if(i%fizzer == 0 && i%buzzer == 0) {
                System.out.println("FizzBuzz");
            } else if(i%fizzer == 0) {
                System.out.println("Fizz");
            } else if (i%buzzer == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
}
