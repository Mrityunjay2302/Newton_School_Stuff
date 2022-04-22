public static Node MakeCircular(Node head){
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    temp.next = head;
    return head;
}