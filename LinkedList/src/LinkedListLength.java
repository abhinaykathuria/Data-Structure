public class LinkedListLength {

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
        LinkedListLength llist = new LinkedListLength();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();


        System.out.println("\nLength:" + llist.length());
        System.out.println("\nLength:" + llist.lengthRecur(llist.head));
    }



    //Finding Length in an iterative manner
    private int length() {

        Node start=head;
        int len=0;
        while(start!=null)
        {
            len++;
            start=start.next;
        }
    return len;
    }
//Finding Length in a recursive manner
private int lengthRecur(Node node) {

        if(node==null)
            return 0;
        else
            return 1+lengthRecur(node.next);
}


}
