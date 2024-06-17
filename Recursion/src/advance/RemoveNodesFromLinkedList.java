package advance;

/*

2487. Remove Nodes From Linked List

You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.

 

Example 1:


Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
Example 2:

Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.
 

Constraints:

The number of the nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105*/

class ListNode {
     int val;
     ListNode next;
     ListNode(){}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class RemoveNodesFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public ListNode removeNodes(ListNode head) {
        
        return modifiedList(head);
    }

    public static ListNode modifiedList(ListNode head){
        if(head.next==null){ 
            return head;
        }

        head.next=modifiedList(head.next); // first traverse to the last node

        if(head.next.val>head.val){ // keep checking if next node(Right Node) value is greater then the current node
            return head.next; // if yes then remove this node by returning the right node
        }

        return head; //else  return the current node

    }

}
