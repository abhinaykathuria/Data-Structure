public class LinkedListSwap {

    public Node head;



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
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedListSwap llist = new LinkedListSwap();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.swap(2,7);
        System.out.println("\nUpdated Linked list is: "  );
        llist.printList();
    }

    private void swap(int pos1, int pos2) {

        Node start1=head;
        Node prev1=null;

        while(start1!=null && start1.data!=pos1)
        {
            prev1=start1;
            start1=start1.next;
        }

        Node start2=head;
        Node prev2=null;

        while(start2!=null && start2.data!=pos2)
        {
            prev2=start2;
            start2=start2.next;
        }

        if(start1==null|| start2==null)
            return;

        if(prev1!=null)
            prev1.next=start2;
        else
            head=start2;
        if(prev2!=null)
            prev2.next=start1;
        else
            head=start1;


        Node temp=start2.next;
        start2.next=start1.next;
        start1.next=temp;
    }

}
