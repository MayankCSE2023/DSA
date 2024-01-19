package basics;

/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.*/



//  Definition for singly-linked list.
//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 

public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		
		//Input: list1 = [1,2,4], list2 = [1,3,4]
				//Output: [1,1,2,3,4,4]

	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	       
	       ListNode list=merge(list1,list2,new ListNode());
	       return list;
	    }

	    public static ListNode merge(ListNode list1, ListNode list2, ListNode list){
	        if(list1==null && list2==null){
	            return null;
	        }

	        if(list1==null){
	            return list2;
	        }else if(list2==null){
	            return list1;
	        }
	        
	        if(list1.val<=list2.val){
	            list.val=list1.val;
	            list.next=merge(list1.next,list2,new ListNode());
	        }else{
	            list.val=list2.val;
	            list.next=merge(list1,list2.next,new ListNode());
	        }

	        return list;
	    }

}
