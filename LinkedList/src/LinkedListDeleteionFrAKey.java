public class LinkedListDeleteionFrAKey {


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
        LinkedListDeleteionFrAKey llist = new LinkedListDeleteionFrAKey();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.deleteNode(1); // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }

    private void deleteNode(int i) {

        Node prev=head;
        Node start=head;
        if(head.data==i)
        {
            head=head.next;
            return;
        }
        while(start.data!=i && start!=null)
        {
            prev=start;
            start=start.next;
        }
        prev.next=start.next;

    }
}
