package sepcialSortingAlgos;

import java.util.ArrayList;
import java.util.HashMap;
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

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "treejhewjfhjkdsfkj";
		System.out.println(frequencySort(s));

	}
	
	// Bucket Sort

	public static String frequencySort(String s) {

		List<Character>[] bucket = new ArrayList[s.length()+1]; // Bucket list(Each array position is a list)
		HashMap<Character, Integer> map = new HashMap<>(); // hash map to know the frequency of each character
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {   // count the frequency
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				continue;
			}

			map.put(s.charAt(i), 1);
		}
		
		// Now we will add the character to the bucket array to index equivalent to its frequency

		for (Character e : map.keySet()) {
			if(bucket[map.get(e)]==null) { 
				bucket[map.get(e)]=new ArrayList<>();// initialse a arraylist to the index matching the frequency
				bucket[map.get(e)].add(e);
			}else {
				
				bucket[map.get(e)].add(e);
			}
		}

		for (int i = bucket.length - 1; i >= 0; i--) {
			if (bucket[i] != null) {
				while (!bucket[i].isEmpty()) { // look for all character at the particular index
					int count = i;
					Character c = bucket[i].remove(bucket[i].size() - 1); // remove the last charater
					while (count != 0) {
						sb = sb.append(c);// append to the sb the no. of times it occurs in the original array
						count--;
					}
				}
			}
		}

		return sb.toString();

	}

}
