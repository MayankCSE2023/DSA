package twoPointers;

/*Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

 

Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.*/

public class CountBinarySubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00110011";
		System.out.println(countBinarySubstrings(s));

	}
	
	public static int countBinarySubstrings(String s) {
        int begin=0;
        int end=1;
        int tent=1;
        int count=0;
        char last=s.charAt(begin);

        while(end<s.length()){//"00110011"
        	last=s.charAt(begin);
            
            while(end<s.length() && s.charAt(end)==last){
                end++;
                tent++;
            }
            
            begin=end;

            while(end<s.length() && s.charAt(end)!=last && tent!=0){
                count++;
                end++;
                tent--;
            }
            end=begin+1;
            tent=1;
        }

        return count;
    }

}
