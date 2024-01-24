package subSet;

import java.util.HashSet;

/*Problem statement
You are given two strings 'A' and 'B' of length 'N' and 'M' respectively.



Return the string that has more distinct subsequences, if both strings have the same number of distinct subsequences, then return 'A'.



For Example:
'N' = 2, 'M' = 2, 'A' = "ab", 'B' = "dd".

'A' has distinct subsequences = ["a", "b", "ab"].
'B' has distinct subsequences = ["d", "dd"].
So our answer is "ab".
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
1 3
f
eeg
Sample Output 1:
eeg
Explanation of sample output 1:
'A' has distinct subsequences = ["f"].
'B' has distinct subsequences = ["e", "g", "eg", "ee", "eeg"].
So our answer is "eeg".
Sample Input 2:
3 4
abc
dddd
Sample Output 2:
abc
Constraints:
1 <= 'N', 'M' <= 30.

Time Limit: 1 sec*/

public class MoreSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="ab";
		String b="acv";
		
		System.out.println(moreSubsequence(2, 2, a, b));

	}
	
	 public static String moreSubsequence(int n, int m, String a, String b) {
	        // Write your code here

	        HashSet<String> setA=new HashSet<>();
	        HashSet<String> setB=new HashSet<>();
	        possibleSet(a, 0, "", setA);
	        possibleSet(b, 0, "", setB);

	        if(setA.size()>=setB.size()){
	            return a;
	        }
	           
	         return b;
	    }

	    public static void possibleSet(String s,int i,String seq,HashSet<String> set){
	        if(i==s.length()){
	            set.add(new String(seq));
	            return;
	        }

	        possibleSet(s,i+1,seq+s.charAt(i),set);
	        possibleSet(s,i+1,seq,set);
	    }

}
