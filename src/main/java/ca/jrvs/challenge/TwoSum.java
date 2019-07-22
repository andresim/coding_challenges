package ca.jrvs.challenge;

import java.util.HashMap;
import java.util.List;

public class TwoSum {

  // Given a list of ints and a target, find the two indices where the numbers at those indices sum
  // to the target.

  // Store entire list in a map (key = value, value = index)
  // Traverse the list
  // For each element, check if target - element = a key in the map
  // If it does, return the value from the dict and the current index

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