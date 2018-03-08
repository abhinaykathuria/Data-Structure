//The function should return true if x is present in linked list and false otherwise.
public class LinkedListSearch {
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
        LinkedListSearch llist = new LinkedListSearch();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();


        System.out.println("\nFound : " + llist.find(7));
        System.out.println("\nFound : " + llist.findRecur(llist.head,7));
    }

    private boolean find(int key) {

        Node start=head;
        while(start!=null)
        {
            if(start.data==key)
                return true;
            start=start.next;
        }
        return false;
    }

    private boolean findRecur(Node node,int key) {
        if (node== null)
            return false;
        else if(node.data==key)
            return true;
        else
            return findRecur(node.next,key);
    }

}
