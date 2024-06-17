package doubleLinkedList;

import java.util.ArrayList;

/*Find pairs with given sum in doubly linked list
EasyAccuracy: 66.01%Submissions: 32K+Points: 2
Be the comment of the day in POTD and win a GfG T-Shirt!
Solve right now

banner
Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

 

Example 1:

Input:  
1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
target = 7
Output: (1, 6), (2,5)
Explanation: We can see that there are two pairs 
(1, 6) and (2,5) with sum 7.
 

Example 2:

Input: 
1 <-> 5 <-> 6
target = 6
Output: (1,5)
Explanation: We can see that there is one pairs  (1, 5) with sum 6.

 

Your Task:
You don't need to read input or print anything. Your task is to complete the function findPairsWithGivenSum() which takes head node of the doubly linked list and an integer target as input parameter and returns an array of pairs. If there is no such pair return empty array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 105
1 <= target <= 105*/

class NodeD
{
    int data;
    NodeD next,prev;
    
    NodeD(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class FindPairsWithGivenSumInDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, NodeD head) {
	        // code here
	        
	        NodeD first=head;
	        NodeD last=head;
	        
	        ArrayList<ArrayList<Integer>> pairs= new ArrayList<>();
	        
	        while(last.next!=null){
	            last=last.next;
	        }
	        
	        while(last.data>first.data){ // two pointers
	            if(first.data+last.data==target){
	                ArrayList<Integer> pair= new ArrayList<>();
	                pair.add(first.data);
	                pair.add(last.data);
	                pairs.add(pair);
	                first=first.next;
	            }else if(first.data+last.data>target){
	                last=last.prev;
	            }else{
	                first=first.next;
	            }
	        }
	        
	        return pairs;
	    }

}
