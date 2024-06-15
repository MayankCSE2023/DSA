package medium;

/*5. Longest Palindromic Substring
Solved
Medium
Topics
Companies
Hint
Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.*/

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longestPalindrome("cbbd"));

	}
	
	
	public static String longestPalindrome(String s) {
        int len = s.length();
        int i = 0;
        String sb = new String(s.substring(0,1));
        boolean check = false;
        int max = 0;

        while (i < len) {
            int j = len - 1;

            while (j >= i) {
                check = checkPalindrome(s, i, j);

                if (check == true) {

                    if (j - i > max) {
                        max=j-i;
                        sb=s.substring(i, j + 1);
                    }
                    break;
                }

                j--;
            }

            i++;

        }

        return sb;
    }

    public static boolean checkPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
