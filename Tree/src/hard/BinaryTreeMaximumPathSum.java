package hard;

/*A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path

*Example 1:


Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
Example 2:


Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 

Constraints:

The number of nodes in the tree is in the range [1, 3 * 104].
-1000 <= Node.val <= 1000*/

class Int {
	private int val;

	public Int(int val) {
		this.val = val;
	}

	public void setValue(int val) {
		this.val = val;
	}

	public int getValue() {
		return val;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public class BinaryTreeMaximumPathSum {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

		public int maxPathSum(TreeNode root) {
			Int maxSum = new Int(Integer.MIN_VALUE);
			pathSum(root, maxSum);

			return maxSum.getValue();
		}

		public static int pathSum(TreeNode root, Int maxSum) {
			if (root == null) {
				return 0;
			}

			int leftSum = pathSum(root.left, maxSum);
			int rightSum = pathSum(root.right, maxSum);

			int sum = root.val + leftSum + rightSum;

			if (root.val > maxSum.getValue()) {
				maxSum.setValue(root.val);
			}

			if (sum > maxSum.getValue()) {
				maxSum.setValue(sum);
			}

			int maxPathSum = root.val + Math.max(leftSum, rightSum);

			return (maxPathSum > 0 ? maxPathSum : 0);// if sum of the path till now is >0 then return it

		}

	}

}
