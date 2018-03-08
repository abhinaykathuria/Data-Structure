public class LinkedListMiddleElement {

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
        LinkedListMiddleElement llist = new LinkedListMiddleElement();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        System.out.println("\nCreated Linked list is:");
        llist.printList();


        System.out.println("\nNth Node " + llist.middleElement());
    }

    private int middleElement() {

        Node slwPtr=head;
        Node fstPtr=head;
        while(fstPtr!=null && fstPtr.next!=null)
        {
            slwPtr=slwPtr.next;
            fstPtr=fstPtr.next.next;
        }
    return slwPtr.data;
    }


}
