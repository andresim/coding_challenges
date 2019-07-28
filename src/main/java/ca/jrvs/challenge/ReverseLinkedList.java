package ca.jrvs.challenge;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

}
