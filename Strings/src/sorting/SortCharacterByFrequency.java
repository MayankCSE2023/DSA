package sorting;

import java.util.ArrayList;
import java.util.List;

/*Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.*/
class Pair{
	char c;
	int fre;
	public Pair(char c, int fre) {
		this.c=c;
		this.fre=fre;
	}
}

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tree";
		System.out.println(frequencySort(s));
		
	}
	
	public static String frequencySort(String s) {

        int[] arr=new int[125];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        
        List<Pair> pair=new ArrayList<>(); 
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>0) {
        		pair.add(new Pair((char)i,arr[i]));
        	}
        }
        
        

    }

}
