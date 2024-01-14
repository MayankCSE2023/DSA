package basicString;
/*Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false*/

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String goal = "cdaeb";

		System.out.println(rotateString(s, goal));

	}

	public static boolean rotateString(String s, String goal) {

		if (s.length() != goal.length()) {
			return false;
		}

		int i = s.indexOf(goal.charAt(0));
		int j = 0;

		while (j < goal.length()) {
			if (i == s.length()) {
				i = i % s.length();
			}

			if (s.charAt(i) != goal.charAt(j)) {
				return false;
			}
			
			i++;
			j++;
		}
		return true;

	}
}
