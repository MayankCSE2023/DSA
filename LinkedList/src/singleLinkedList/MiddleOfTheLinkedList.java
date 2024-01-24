package singleLinkedList;

/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100*/

public class MiddleOfTheLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode middleNode(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;

	        if(head.next==null){
	            return head;
	        }


	        while(fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;

	            if(fast==null || fast.next==null){
	                break;
	            }

	            if(fast.next.next==null){
	                slow=slow.next;
	                break;
	            }
	        }

	        return slow;

	    }

}