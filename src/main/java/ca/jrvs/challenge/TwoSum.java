package ca.jrvs.challenge;

import java.util.HashMap;
import java.util.List;

/**
 * Given a list of ints and a target, find the two indices where the numbers at those indices sum to
 * the target.
 */
public class TwoSum {

  public static void twoSum(List<Integer> intList, int target) {
    boolean found = false;
    HashMap<Integer, Integer> listMap = new HashMap<Integer, Integer>();
    int index = 0;
    for (Integer value : intList) {
      listMap.put(value, index++);
    }

    for (int i = 0; i < intList.size(); i++) {
      int neededVal = target - intList.get(i);
      if (listMap.containsKey(neededVal)) {
        int pos2 = listMap.get(neededVal);
        System.out.println("The two indices are: [" + i + "," + pos2 + "]");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Could not find any pair of indices where the values sum to the target");
    }
  }
}