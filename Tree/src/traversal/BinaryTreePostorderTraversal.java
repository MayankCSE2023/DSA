package traversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 List<Integer> list= new ArrayList<Integer>();
	    public List<Integer> postorderTraversal(TreeNode root) {
	        if(root==null){
	            return list;
	        }
	         postorderTraversal(root.left);
	         postorderTraversal(root.right);  // we cant have 2 return value in 1 block
	        list.add(root.val);
	       return list;
	    }

}
