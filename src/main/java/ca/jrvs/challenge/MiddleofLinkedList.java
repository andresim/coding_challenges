package ca.jrvs.challenge;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleofLinkedList {

  public ListNode middleNode(ListNode head) {
    ListNode curr = head.next;
    int count = 0;
    while (head.next != null) {
      count++;
      head = head.next;
    }

    // This will get us the INDEX to find. If a list has an odd number length it will round which
    // works due to the first element having index 0. If the length is even then it will return the
    // second 'middle' value
    int position = count / 2;

    for (int i = 0; i < position; i++) {
      curr = curr.next;
    }
    return curr;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

}