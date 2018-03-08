public class LinkedListCountOccurence {

    Node head;



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
        LinkedListCountOccurence llist = new LinkedListCountOccurence();

        llist.push(7);
        llist.push(2);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(2);
        llist.push(5);
        llist.push(2);


        System.out.println("\nCreated Linked list is:");
        llist.printList();


        System.out.println("\nCount :" + llist.countOcc(2));
    }

    private int countOcc(int i) {
        int count=0;
        Node start=head;
        while(start!=null)
        {
            if(start.data==i)
                count++;
            start=start.next;
        }
        return count;
    }
}
