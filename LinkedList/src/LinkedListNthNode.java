public class LinkedListNthNode {

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
        LinkedListNthNode llist = new LinkedListNthNode();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();


        System.out.println("\nNth Node " + llist.nthNode(5));
    }

    private int nthNode(int pos) {

        int i=0;
        Node start=head;
        while (start!=null && i<pos) {
            start=start.next;
            i++;
        }
        if(start!=null)
        {
            return start.data;
        }
        return -1;
    }

}
