package advance;

/*Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106*/

public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	 public ListNode oddEvenList(ListNode head) {

	        if (head == null || head.next == null || head.next.next == null) {
	            return head;
	        }

	        ListNode odd = head;
	        ListNode even = head.next;
	        while (even != null && even.next != null) {
	            ListNode temp = odd.next;// odd.next is starting of even
	            odd.next = even.next;// add next odd node to main odd nodes
	            even.next = even.next.next;// add next even node to main even nodes
	            odd = odd.next;// move odd pointer to end of odd next node is starting of even nodes
	            odd.next = temp;//connect the odd to even
	            even = even.next; // move the even pointer to end of even main nodes next node is odd
	        }

	        return head;
	    }

}
