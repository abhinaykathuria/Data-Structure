import java.util.HashSet;

public class LinkedListDetectLoop {

     Node head;  // head of list

    /* Linked list Node*/
     class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


     public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args)
    {
        LinkedListDetectLoop llist = new LinkedListDetectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (llist.detectLoop(llist.head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }

    private  boolean detectLoop(Node head) {

        HashSet hs=new HashSet();
        Node start=head;
        while(start!=null)
        {
            if(hs.contains(start))
                return true;
            else
                hs.add(start);
            start=start.next;
        }

    return false;

    }


}
