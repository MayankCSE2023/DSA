package basics;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {

        // ListNode p=head;
        // ListNode q=head;
        // ListNode r=null;

        if(head==null || head.next==null){
            return head;
        }

        head=reverse(null,head);
        // while(q.next!=null){
        //     q=p.next;
        //     p.next=r;
        //     r=p;
        //     p=q;
        // }
        
        // p.next=r;
        // head=q;

        return head;
        
    }

    public static ListNode reverse(ListNode prev,ListNode current) {
        if(current==null){
            return prev;
        }

            ListNode next=current.next;
            current.next=prev;

        return reverse(current,next);
    }
}
