package binarySearchOnAnswer;

import java.util.Arrays;

/*You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.

You are also given an integer 'k' which denotes the number of aggressive cows.
You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.
Print the maximum possible minimum distance.

Example:
Input: 'n' = 3, 'k' = 2 and 'arr' = {1, 2, 3}

Output: 2

Explanation: The maximum possible minimum distance will be 2 when 2 cows are placed at positions {1, 3}. Here distance between cows is 2.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6 4
0 3 4 7 10 9


Sample Output 1 :
3


Explanation to Sample Input 1 :
The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}. Here distance between cows are 3, 4 and 3 respectively.


Sample Input 2 :
5 2
4 2 1 3 6


Sample Output 2 :
5*/

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stalls= {1,2,3,4,6};
		System.out.println(aggressiveCows(stalls, 3)); 
		
	}
	
	public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
		
		Arrays.sort(stalls);//because we want to find minimum distance between each aggressive cows.
		int low=1;
		int high=stalls[stalls.length-1]-stalls[0];
		int ans=1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			boolean possible=possible(stalls, k, mid);
			
			if(possible==true) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		
		return ans;
    }
	
	public static boolean possible(int []stalls, int k,int dist) {//{1,2,3,4,6}
		int last=stalls[0];
		int cow=1;
		
		for(int i=0;i<stalls.length;i++) {
			
			if(stalls[i]-last>=dist) {
				last=stalls[i];
				cow++;
			}
			
			if(cow>=k) {
				return true;
			}
		}
		
		return false;
	}

}
