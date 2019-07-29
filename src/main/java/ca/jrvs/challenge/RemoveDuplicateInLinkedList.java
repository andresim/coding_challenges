package ca.jrvs.challenge;

import ca.jrvs.challenge.LinkedListImp.Node;
import java.util.HashMap;

/**
 * Program to remove duplicates in an unsorted linked list
 */
public class RemoveDuplicateInLinkedList {

  public void removeDuplicate(LinkedListImp list) {
    Node cur = list.head.next;
    HashMap<Node, Integer> listVals = new HashMap<Node, Integer>();
    for (int i = 0; i < list.size - 1; i++) {
      if (listVals.containsKey(cur)) {
        list.deleteAtIndex(i);
      } else {
        listVals.put(cur, i);
      }
      cur = cur.next;
    }
  }
}