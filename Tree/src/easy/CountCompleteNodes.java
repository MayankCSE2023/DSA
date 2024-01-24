package easy;

public class CountCompleteNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int countNodes(TreeNode root) {
	        
	        if(root==null){return 0;}

	        if(root.left==null && root.right==null){return 1;}
	        else{
	            return 1+ countNodes(root.left)+countNodes(root.right);
	        }
	    }

}
