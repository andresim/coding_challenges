package ca.challenge;

/**
 * Given an input string, this will reverse the string word by word.
 */
public class ReverseStringofWords {

  public String reverseWords(String s) {

    String[] split = s.split(" ");
    String reverseString = null;

    for (int i = split.length - 1; i >= 0; i--) {
      if (i == 0) {
        reverseString += split[i];
      } else {
        reverseString += split[i] + " ";
      }
    }
    return reverseString.trim().replaceAll(" +", " ");
  }

}
