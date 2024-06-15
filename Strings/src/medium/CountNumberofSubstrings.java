package medium;

/*Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 

Example 1:

Input:
S = "aba", K = 2
Output:
3
Explanation:
The substrings are: "ab", "ba" and "aba".
Example 2:

Input: 
S = "abaaca", K = 1
Output:
7
Explanation:
The substrings are: "a", "b", "a", "aa", "a", "c", "a". 
Your Task:
You don't need to read input or print anything. Your task is to complete the function substrCount() which takes the string S and an integer K as inputs and returns the number of substrings having exactly K distinct characters.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ |S| ≤ 106
1 ≤ K ≤ 26

*/

public class CountNumberofSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abaaca";
		System.out.println(countSubstring(s, 2));

	}
	
	public static int countSubstring(String s, int k) { // "aabaaca"
		
		int start=0;
		int end=start;
		int ch=1;
		int count=0;
		
		while(start<s.length()) {
			
			if(end==s.length()) {
				
				ch=1;
				start++;
				end=start;
				continue;
			}
			
			if(s.charAt(end)!=s.charAt(start)) {
				ch++;
			}else {
				if(ch==k) {
					count++;
				}
				end++;
				continue;
			}
			
			if(ch>k) {
				start++;
				end=start;
				ch=1;
			}
		}
		
		
		return count;
	}

}
