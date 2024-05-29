package binarySearchOnAnswer;

import java.util.HashSet;

/*Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	public static int lengthOfLongestSubstring(String s) {
        int high=s.length();
        int low=1;
        int ans=1;

        if(s.length()==0){
            return 0;
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(s,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }

    public static boolean isPossible(String s, int window){
        int i=0;
        int j=window-1;

        while(j<s.length()){
            HashSet<Character> map=new HashSet<>();
            map.add(s.charAt(j));
            int n=j-1;

            while(n!=i-1){
                if(map.contains(s.charAt(n))){
                    break;
                }
                map.add(s.charAt(n));
                n--;
            }

            if(n==i-1){
                return true;
            }

            j++;
            i++;
        }

        return false;
    }
}