package ca.jrvs.challenge;

import ca.jrvs.challenge.LinkedListImp.Node;
import java.util.LinkedList;

/**
 * Program that will find the size of a singly linked list, I initially used the built in linked
 * list method But afterwards changed it to traverse the linked list implementations I have made
 */
public class SingleLinkedListLength {

  public static void linkedListLength(LinkedList<Class> list) {
    System.out.println("The size of the list is: " + list.size());
  }

  public static void myListlength(LinkedListImp list) {
    int count = 0;
    Node curr = null;
    while (list.head.next != null) {
      count++;
      curr = list.head.next;
    }
    System.out.println("The length of the list is: " + count);
  }
}