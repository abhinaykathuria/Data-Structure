public class LinkedListReverse {


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
        LinkedListReverse llist = new LinkedListReverse();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.reverse();
        System.out.println("\nUpdated Linked list is: "  );
        llist.printList();
    }

    private void reverse() {


        if(head==null)
            return;
        else if(head.next==null)
            return;
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
            head=start;


        }
    }
}
