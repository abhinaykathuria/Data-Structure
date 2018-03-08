public class LinkedListMergeSortedList {

    public Node head1;
    public Node head2;


    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void main(String[] args)
    {
        LinkedListMergeSortedList llist = new LinkedListMergeSortedList();
        llist.head1 = new Node(3);
        llist.head1.next = new Node(6);
        llist.head1.next.next = new Node(15);
        llist.head1.next.next.next = new Node(30);

        printList(llist.head1);



        llist.head2 = new Node(10);
        llist.head2.next = new Node(18);
        llist.head2.next.next = new Node(20);
        System.out.println();
        printList(llist.head2);

       Node head= llist. mergeList();
        System.out.println();
        printList(head);
        
        /*Create loop for testing */
    }

    private  Node mergeList() {

    Node start1=head1;
    Node start2=head2;
    Node head=null;
    Node temp=null;

    while(start1!=null && start2!=null)
    {

        if(start1.data<start2.data)
        {
            if(head==null)
            {
                head=start1;
                //head.next=null;
                temp=start1;
                //temp.next=null;

            }
            else {
                temp.next = start1;
                temp=start1;
            }
            start1=start1.next;
        }
        else
        {
            if(head==null)
            {
                head=start2;
                temp=start2;
            }
            else {
                temp.next = start2;
                temp=start2;
            }

            start2=start2.next;
        }

    }
    temp.next=null;
    return head;
    }

    private static void printList(Node head) {

        Node start=head;
        while (start!=null) {

            System.out.print(" "+ start.data );
            start=start.next;
        }
    }

}
