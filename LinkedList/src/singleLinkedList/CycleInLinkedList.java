package singleLinkedList;

public class CycleInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean hasCycle(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;

	        while(fast!=null && fast.next!=null && fast.next.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;

	            if(fast==slow){
	                return true;
	            }
	        }
	        
	        return false;
	    }

}
