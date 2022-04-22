/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
//complete this function
Node prev = head.prev;
Node curr = head;
while (curr != null) {
    Node next = curr.next;
    curr.next = prev;
    curr.prev = next;
    prev = curr;
    curr = next;
}
return prev;
}