package binarySearchOnAnswer;

/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.*/

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,7,8,9};
		System.out.println(findKthPositive(arr, 9));

	}
	
	public static int findKthPositive(int[] arr, int k) {
        int l = arr.length;

        if (arr[l - 1] == l) {
            return l + k;
        }

        int low = 0;
        int high = l-1;
        int index = -1;
        

        while (low <= high) {//[5,6,7,8,9], k = 9
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - mid - 1;

            if (missing >= k) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        if(index==-1) {
        	index=l;
        }
        
    return index+k;
    }

}
