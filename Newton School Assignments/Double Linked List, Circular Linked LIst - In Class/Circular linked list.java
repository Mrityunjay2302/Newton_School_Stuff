public static int check(Node head){
    Node temp = head.next;
    while (temp != null){
        if (temp == head) return 1;
        temp = temp = temp.next;
    }
    return 0;
}