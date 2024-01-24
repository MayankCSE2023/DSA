package basicString;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.*/

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0P";
		System.out.println(isPalindrome(s));

	}
	
	 public static boolean isPalindrome(String s) {
	        if(s.length()==0) {
	        	return true;
	        }
	        
	        StringBuilder str=new StringBuilder();

	        for(int i=0;i<s.length();i++){
	            
	        	 if(((int)s.charAt(i)>=65 && (int)s.charAt(i)<91) || ((int)s.charAt(i)>=97 && (int)s.charAt(i)<123)|| ((int)s.charAt(i)>=48 && (int)s.charAt(i)<58)){
		                str.append(s.charAt(i));
		            }
	        }

	        String newS=str.toString().toLowerCase();
	        
	        if(newS.length()==0) {
	        	return true;
	        }

	        int i=0;
	        int j=newS.length()-1;

	        while(i<j){
	            if(newS.charAt(i++)!=newS.charAt(j--)){
	                return false;
	            }
	        }

	        return true;
	    }

}
