package ca.jrvs.challenge;

/**
 * Program that implements a (singly) linked list and base methods (adding, deleting, searching)
 */
public class LinkedListImp {

  public Node head;
  public int size;

  // Constructor for linked list based on Node
  public LinkedListImp() {
    head = new Node(0);
    size = 0;
  }

  // Gets the value at a given index
  public int get(int index) {
    System.out.println(size);
    if (index < 0 || index >= size) {
      return -1;
    }

    Node cur = head.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur.value;
  }

  // Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
  public void addAtHead(int val) {
    Node cur = new Node(val);
    cur.next = head.next;
    head.next = cur;
    size++;
  }

  // Append a node of value val to the last element of the linked list.
  public void addAtTail(int val) {
    Node node = new Node(val);
    Node cur = head.next;

    for (int i = 0; i < size - 1; i++) {
      cur = cur.next;
    }

    cur.next = node;
    size++;
  }

  // Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }

    Node node = new Node(val);
    Node pre = head;
    for (int i = 0; i < index; i++) {
      pre = pre.next;
    }

    node.next = pre.next;
    pre.next = node;
    size++;
  }

  // Delete the index-th node in the linked list, if the index is valid.
  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }

    Node pre = head;
    for (int i = 0; i < index; i++) {
      pre = pre.next;
    }

    pre.next = pre.next.next;
    size--;
  }

  public String toString() {

    StringBuilder res = new StringBuilder();

    Node cur = head.next;
    while (cur != null) {
      res.append(cur + "->");
      cur = cur.next;
    }
    res.append("Null");

    return res.toString();
  }

  public class Node {

    public int value;
    public Node next;

    public Node(int val) {
      this.value = val;
      this.next = null;
    }
  }
}