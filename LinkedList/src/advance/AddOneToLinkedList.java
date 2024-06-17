package advance;

/*Add 1 to a number represented as linked list



A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 4->5->7
Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 
Example 2:

Input:
LinkedList: 1->2->3
Output: 1->2->4 
Your Task:
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 1021*/

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 

public class AddOneToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node addOne(Node head) 
    { 
        int rem=add(head,0);
        
        if(rem==1){
            Node node=new Node(1);
            node.next=head;
            head=node;
        }
        return head;
        
    }
    
    public static int add(Node head,int rem){
        if(head==null){
            return rem;
        }
        
        
        if(head.next==null){ // find last node
            if(head.data<9){
                head.data+=1;
                rem=0; // rem 0 if no overflow 
            }else{
                head.data=0;
                rem=1; // else rem=1
            }
            
            return rem;
        }
        
        rem = add(head.next, rem); // iterate though each node
        
        if(rem==0){  //if rem from previous operation is 0 the return 
            return rem;
        }else{
            head.data+=1; // if rem of last operation is 1 then add reminder
            if(head.data>9){ // check for overflow at this node after adding reminder
                head.data=0;
                rem=1;
            }else{
                rem=0;;
            }
        }
        return rem;
    }

}

// NOTE: Whenever we want to traverse backword in singly linked list the use recursion.
