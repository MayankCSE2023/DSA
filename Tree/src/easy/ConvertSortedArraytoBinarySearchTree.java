package easy;

/*Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced
 binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.*/

public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public TreeNode sortedArrayToBST(int[] nums) {
        
        int len=nums.length;
        TreeNode root=null;
        return convert(root,nums,0,len-1);


    }

    TreeNode convert(TreeNode root, int[] nums, int low, int high){
        if(low<=high){
            int mid=(low+high)/2;
            root=new TreeNode(nums[mid]);
            root.left=convert(root.left,nums,low,mid-1);
            root.right=convert(root.right,nums,mid+1,high);
        }

        return root;
    }

}
