public class LinkedListInsertion {

     Node head;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

public static void main(String args[])
{

    LinkedListInsertion list= new LinkedListInsertion();
    list.insertAtBeg(3);
    list.insertAtBeg(5);
    list.insertAtEnd(10);
   list.insertAfter(1,13);
    list.printLinkedList();

}

    private void insertAfter(int pos, int d) {

        Node start=head;
        Node new_node=new Node(d);
        int i=1;
        if(pos==1)
        {
            new_node.next=head;
            head=new_node;
            return;
        }
        Node prev=head;
        while(i<pos && start.next!=null)
        {

        i++;
        }
        prev.next=new_node;
        new_node.next=start;


    }

    private void insertAtEnd(int i) {

        Node new_node= new Node(i);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            Node start=head;
            while(start.next!=null)
            {
                start=start.next;
            }
            start.next=new_node;
        }
    }

    private void printLinkedList() {

        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+ " ->");
            start=start.next;
        }
    }

    private void insertAtBeg(int i) {
   Node new_node= new Node(i);
    if(head==null)
    {
    head=new_node;
    }
    else
    {
        new_node.next=head;
        head=new_node;
    }
    }
}
