package binarySearchOnAnswer;

/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23*/

import java.util.Arrays;
import java.util.Iterator;

public class KokoLovesBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = { 30, 11, 23, 4, 20 };
		System.out.println(minEatingSpeed(piles, 6));

	}

	public static int minEatingSpeed(int[] piles, int h) {

		int low=1;
		int high=0;

		for (int i = 0; i < piles.length; i++) {
			if (piles[i] > high) {
				high = piles[i];
			}
		}
		
		
		int ans=Integer.MAX_VALUE;
		
		while(low<=high) {//30,11,23,4,20
			int mid=low+(high-low)/2;
			int k=findTotalHours(piles,mid);
			
			if(k<=h) {
				ans=mid;
			    high=mid-1;
			}else {
				low=mid+1;
			}
		}

		return ans;
	}
	
	//Note: You can always use binary search to find a MINIMUM or a MAXIMUM,
	//      this problem has the property that it wants you to find the minimum possible,
	     // and you have a defined maximum and minimum, we know number of days cannot be more
	//      than max and cannot be less than min, this exactly leads to binary search.

	public static int findTotalHours(int[] piles,int k) {

		int total = 0;
		for (int i = 0; i < piles.length; i++) {//30,11,23,4,20
			if (piles[i] % k == 0) {

				total = total + piles[i] / k;
			} else {
				total = total + piles[i] / k + 1;
			}
		}

		return total;
	}

}
