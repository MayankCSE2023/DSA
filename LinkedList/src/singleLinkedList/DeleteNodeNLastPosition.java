package singleLinkedList;

public class DeleteNodeNLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head=new ListNode(1,null);
		ListNode node=head;
		node.next=new ListNode(2,null);
		node=node.next;
		node.next=new ListNode(3,null);
		node=node.next;
		node.next=new ListNode(4,null);
		node=node.next;
		node.next=new ListNode(5,null);
		
		head=removeNthFromEnd(head, 2);
		node=head;
		
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		

	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(0);/// in one pass
	    dummy.next = head;
	    ListNode fast = dummy;
	    ListNode slow = dummy;

	    // Move fast pointer n+1 steps ahead
	    for (int i = 0; i <= n; i++) {//1,2,3,4,5
	        fast = fast.next;
	    }

	    // Move both pointers until fast reaches the end
	    while (fast != null) {
	        fast = fast.next;
	        slow = slow.next;
	    }

	    // Remove the n-th node from the end
	    slow.next = slow.next.next;

	    return dummy.next;
		
		
		
		
		
		
		
		
		
		
		
		
		
		//        int l=0;
//        ListNode node=head;
//
//        while(node!=null){
//            node=node.next;
//            l++;
//        }
//        
//        System.out.println(l);
//
//        int k=l-n;
//        node=head;
//
//        if(l==n){
//            head=head.next;
//        }else{
//            while(k-1>0){
//                node=node.next;
//                k--;
//            }
//
//            node.next=node.next.next;
//        }
//
//
//        return head;
    }

}
