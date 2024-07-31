package medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isValidBST(TreeNode root) {
	        if (root == null) {
	            return true;
	        }

	        List<Integer> tree = new ArrayList<>();
	        long pre = Long.MIN_VALUE;

	        validate(root, tree);

	        for (int e : tree) {
	            if (pre >= (long) e) {
	                return false;
	            }

	            pre = e;
	        }

	        return true;
	    }

	     public static void validate(TreeNode root, List<Integer> tree){
	        if(root==null){
	            return;
	        }

	        validate(root.left,tree);

	        tree.add(root.val);
	       
	        validate(root.right,tree); 
	    }

	    //----below is wrong--------//

	    // public static boolean validate(TreeNode root, boolean status) {
	    //     if (root == null) {
	    //         return true;
	    //     }

	    //     if (!status) {
	    //         return false;
	    //     }

	    //     if (root.left != null && root.right != null) {
	    //         if (root.left.val >= root.val || root.right.val <= root.val) {
	    //             return false;
	    //         }
	    //     } else if (root.left != null) {
	    //         if (root.left.val >= root.val) {
	    //             return false;
	    //         }
	    //     } else if (root.right != null) {
	    //         if (root.right.val <= root.val) {
	    //             return false;
	    //         }
	    //     }

	    //     status = validate(root.left, status);
	    //     return validate(root.right, status);
	    // }

}
