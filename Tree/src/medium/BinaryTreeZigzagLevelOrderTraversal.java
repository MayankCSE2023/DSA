package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100*/

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        boolean zigzag=false;

	        List<List<Integer>> tree=new ArrayList<>();
	        List<Integer> level= new ArrayList<>();
	        List<Integer> reverse= new ArrayList<>();


	        Queue<TreeNode> q =new LinkedList<>();
	        
	        if(root==null){ //check if tree is empty 
	            return tree;
	        }

	        q.add(root);
	        q.add(null);

	        while(!q.isEmpty()){

	            TreeNode curr=q.remove();
	            level.add(curr.val); //add level elements
	            
	            if(curr.left!=null){//add left node to queue
	                q.add(curr.left);
	            }

	             if(curr.right!=null){//add right node to queue
	                q.add(curr.right);
	            }


	            if(q.peek()==null){  //if next queue is null then a level is complete
	                q.remove(); // remove null
	                if(zigzag==false){ // zigzag adding levels to  tree
	                tree.add(level);
	                zigzag=true;
	                }else{
	                  for(int i=level.size()-1; i>=0;i--){ //reverse the level alternatively
	                      reverse.add(level.get(i));
	                  }
	                  tree.add(reverse);
	                  reverse= new ArrayList<>(); // create a new arraylist 
	                  zigzag=false;
	                }
	                 level= new ArrayList<>();// if level.clear() it will clear all the output.

	                if(q.isEmpty()){
	                    break;
	                }
	                q.add(null);
	            }
	        }

	        return tree;
	    }

}
