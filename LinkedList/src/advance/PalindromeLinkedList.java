package advance;

/*Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false*/

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isPalindrome(ListNode head) {
         ListNode fast=head;
        ListNode slow=head;

        if(head.next==null){
            return true;
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

        ListNode p=slow;
        ListNode q=slow;
        ListNode r=null;

        while(q.next!=null){
            q=p.next;
            p.next=r;
            r=p;
            p=q;
        }
        p.next=r;
// p and q point to the last node which will be a new head

        ListNode head1=head;
        ListNode head2=q;


        while(head2!=null){
            if(head1.val!=head2.val){
                return false;
            }
            head2=head2.next;
            head1=head1.next;
        }

        return true;
        
    }

}
