
package advance;

/*Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.*/
public class RemoveDuplicatesfromSortedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0,head);// create a dummy node for head dublicates
        ListNode front=head;// it will check dublicates for each node val
        ListNode back=dummy; // it will keep track of our num dublicates node
        int count=1;// count no. of dublicate nodes

        if(head==null || head.next==null){// no dublicates
            return head;
        }

        while(front!=null){

            while(front.next!=null && front.val==front.next.val){// check if current node is dublicate
                front=front.next;
                count++;
            }


            if((front.next==null && back.next==front) || count==1){// in case of no dublicates
                back.next=front;
                back=back.next;
                front=front.next;
            }else{                                                // in case of dublicates
                front=front.next;
            }
            count=1;    //rest count for each unique val
        }
            
            back.next=null;   // mark last node next as null
            head=dummy.next;  //head is dummy next
        
        return head;
    }

}
