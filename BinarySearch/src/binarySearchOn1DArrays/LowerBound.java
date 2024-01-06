package binarySearchOn1DArrays;

/*You are given an array 'arr' sorted in non-decreasing order and a number 'x'.

You must return the index of lower bound of 'x'.

Note:
For a sorted array 'arr', 'lower_bound' of a number 'x' is defined as the smallest index 'idx' such that the value 'arr[idx]' is not less than 'x'
If all numbers are smaller than 'x', then 'n' should be the 'lower_bound' of 'x', where 'n' is the size of array.
Consider 0-based indexing.


Example:
Input: ‘arr’ = [1, 2, 2, 3] and 'x' = 0

Output: 0

Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6
1 2 2 3 3 5
0


Sample Output 1:
0


Explanation Of Sample Input 1 :
Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.


Sample Input 2:
6
1 2 2 3 3 5
2*/

public class LowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,3,3,5};
		System.out.println(lowerBound(nums, 6, 4));
	}
	
	public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low=0;
        int high=n-1;
        int mid=0;

        while(low<=high){
            mid=low+(high-low)/2;

            if(arr[mid]==x){
                if(mid-1<0 || arr[mid-1]!=x){
                    return mid;
                }else{
                    high=mid-1;
                }
            }else if(arr[mid]>x){
                if(mid-1<0 || arr[mid-1]<x){
                    return mid;
                }
                high=mid-1;
            }else{
                if(mid+1==n || arr[mid+1]>=x){
                    return mid+1;
                }
                low=mid+1;
            }
        }

        return mid;
    }

}
