public static Node insertnew(Node head, int k){
    Node node = new Node(k);
    node.next = head;
    if(head != null){
        head.prev = node;
    }
    head = node;
    return head;
}