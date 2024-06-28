package hard;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*199. Binary Tree Right Side View
Attempted
Medium
Topics
Companies
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 

Example 1:


Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Example 2:

Input: root = [1,null,3]
Output: [1,3]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100*/

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
//	public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> list = rightSideView(root, new LinkedList<>());
//        int l=2;
//        while(root!=null && (root.left==null || root.right==null)){
//            if(root.left==null){
//                root=root.right;
//            }else{
//                root=root.left;
//            }
//            l++;
//        }
//        rightSideView(root!=null?root.left:null, list,l,list.size());
//        return list;
//    }
//
//    public List<Integer> rightSideView(TreeNode root, List<Integer> right) {
//        if (root == null) {
//            return right;
//        }
//
//        right.add(root.val);
//
//        if (root.right == null) {
//            rightSideView(root.left, right);
//        } else {
//            rightSideView(root.right, right);
//        }
//
//        return right;
//    }
//
//    public void rightSideView(TreeNode root, List<Integer> right, int l, int h) {
//        if (root == null) {
//            return;
//        }
//
//        if (l > h) {
//            right.add(root.val);
//        }
//
//        if (root.right == null) {
//            rightSideView(root.left, right,l+1,h);
//        } else {
//            rightSideView(root.right, right,l+1,h);
//        }
//    }
	
	 public List<Integer> rightSideView(TreeNode root){
	        List<Integer> rightView=new LinkedList<>();
	        Queue<TreeNode> q= new LinkedList<>();

	        if(root==null){
	            return rightView;
	        }

	        q.add(root);
	        q.add(null);

	        while(!q.isEmpty()){
	            TreeNode curr=q.remove();

	            if(curr.left!=null){
	                q.add(curr.left);
	            }

	            if(curr.right!=null){
	                q.add(curr.right);
	            }


	            if(q.peek()==null){
	                rightView.add(curr.val);
	                q.remove();

	                if(q.isEmpty()){
	                    break;
	                }
	                q.add(null);
	            }

	        }
	            return rightView;
	     }

}
