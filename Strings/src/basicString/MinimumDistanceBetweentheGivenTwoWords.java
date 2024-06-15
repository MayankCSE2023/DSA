package basicString;

import java.util.ArrayList;
import java.util.List;

/*Find the minimum distance between the given two words

Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.

Examples:

Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
Output: 3
Explanation: Minimum distance between the words “the” and “fox” is 3

Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
Output: 2
Explanation: Minimum distance between the words “geeks” and “practice” is 2

*/

public class MinimumDistanceBetweentheGivenTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s= new ArrayList<>();
		s.add("vml");
		s.add("uds");
		s.add("aih");
		s.add("du");
		s.add("vml");
		s.add("uds");
		System.out.println(shortestDistance(s,"vml","uds"));
		

	}
	
	public static int shortestDistance(List<String> s, String word1,String word2) {
		 
		int d1=-1;
		int d2=-1;
		int i=0;
		
		int min=Integer.MAX_VALUE;
		
		if(word1.equals(word2)){
		    return 0;
		}
		
		for(String str:s) {// vml uds aih du vml uds
			if(str.equals(word1)) {
				d1=i++;
			}else if(str.equals(word2)) {
				d2=i++;
			}else {
			    i++;
				continue;
			}
			
 			if(d1==-1 || d2==-1) {
 				continue;
 			}
			
			int diff=d1-d2;
			
			if(diff<0) {
				diff*=-1;
			}
			
			if(diff<min) {
				min=diff;
			}
		}
		
		return min;
	}

}
