package medium;


/*796. Rotate String
Attempted
Easy
Topics
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 

Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.*/

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kifcqeiqoh";
		String goal = "ayyrddojpq";
		
		System.out.println(rotateString(s, goal));
	}
	
	 public static boolean rotateString(String s, String goal) {
	
		 String allS=s+s;
		 int len=s.length();
		 int i=0;
		 
		 while(i+len <= allS.length()) {
			 if(goal.equals(allS.substring(i, i+len))) {
				 return true;
			 }
			 
			 i++;
		 }
		 
		 return false;
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //----------------------------------Problem when dublicate charater present in the string----------------------------
		 
//		 char start=s.charAt(0);
//		 int index= goal.indexOf(start);
//		 int i=0;
//		 
//		 if(s.length()!=goal.length() || index==-1){
//	            return false;
//	         }
//		 
//		 
//		 while(i<s.length()) {
//			 if(s.charAt(i++)!=goal.charAt(index++)) {
//				 return false;
//			 }
//			 
//			 index=index%goal.length();
//		 }
//		 
//		 return true;
	 }
	 
	 
	 /*NOTE: Generating key insights often involves understanding the problem's constraints and finding patterns or relationships within those constraints. Here's how one could arrive at the key insight for this problem:

Understanding the problem and the constraints: The problem involves rotations, i.e., moving the leftmost character to the rightmost position. It's also mentioned that the two strings s and goal are of the same length.

Observing examples: If we manually perform the rotations and observe the results, we may notice a pattern. For example, for s = "abcde", the rotations would be: "bcdea", "cdeab", "deabc", "eabcd", and back to "abcde".

Noticing patterns and forming insights: From the examples, we might notice that all the rotated strings are substrings of s + s = "abcdeabcde". Thus, we can check if goal is a substring of s + s to see if s can be rotated to form goal.

Verifying the insight: We can confirm this insight by trying various examples and corner cases, and seeing if this pattern holds true in every case.*/
	
	

}
