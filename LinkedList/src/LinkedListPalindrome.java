public class LinkedListPalindrome {


    public  Node head;
    public  Node head1;


    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* This function prints contents of linked list starting from
        the given node */
    private  void printList(Node head3) {

        Node start=head3;
        while (start!=null) {

            System.out.print(" "+ start.data );
            start=start.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedListPalindrome llist = new LinkedListPalindrome();

        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("\nCreated Linked list is:");
        llist.printList(llist.head);
        llist.reverse();
        System.out.println();
        llist. printList(llist.head1);


        System.out.println("\nPalindrome : "  +llist.checkPalindrome());

    }

    private void reverse() {


        if(head==null)
            return ;
        else if(head.next==null)
            return ;
        else
        {
            Node start= head.next;
            Node prev=head;
            prev.next=null;
            while(start.next!=null)
            {
                Node temp=start.next;
                start.next=prev;
                prev=start;
                start=temp;
            }
            start.next=prev;
             head1=start;


        }
    }

    private boolean checkPalindrome() {

        Node start1=head;
        Node start2=head1;

        while(start1!=null&&start2!=null)
        {
            if(start1.data!=start2.data)
                return false;
            start1=start1.next;
            start2=start2.next;
        }

    return true;

    }
}
