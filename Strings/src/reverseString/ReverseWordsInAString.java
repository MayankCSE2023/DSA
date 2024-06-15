package reverseString;

/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?*/

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a good   example";
		System.out.println(reverseWords(str));
	}
	
	public static String reverseWords(String s) {
        String str = new String();
        int end=0,start=0;
        
   
        for(int i=s.length()-1;i>=0;i--) {//"a good   example"
        	if(s.charAt(i)!=' ') {
        		end=i;
        		while(i>=0 && s.charAt(i)!=' ') {
        			i--;
        		}
        		i++;
        		start=i;
        		str=str+" "+s.substring(start, end+1);
        	}
        	str=str.strip();
        }
        
        return str;
    }

}
