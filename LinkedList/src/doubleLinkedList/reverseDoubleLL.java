package doubleLinkedList;


class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};

public class reverseDoubleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static Node reverseDLL(Node head)
	    {
	        // Write your code here.

	        Node p=head;
	        Node q=head;
	        Node r=null;

	        while(q.next!=null){
	            q=p.next;
	            p.next=r;
	            p.prev=q;
	            r=p;
	            p=q;
	        }

	        p.next=r;
	        p.prev=null;
	        head=p;

	        return head;
	    }

}
