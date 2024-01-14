package basicString;

import java.util.HashMap;

/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false*/

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "abba";
		String word = "dog cat cat dog";
		System.out.println(wordPattern(pattern, word));

	}

	public static boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();
		String[] strings = s.split(" ");

		if (pattern.length() != strings.length) {
			return false;
		}
		
//		for (String string : strings) {
//			System.out.println(string);
//		}

		for (int i = 0; i < strings.length; i++) {//  "abba"   "dog cat cat dog"
			char currentChar = pattern.charAt(i);
            String currentWord = strings[i];

            if (map.containsKey(currentChar)) {
                if (!map.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (map.containsValue(currentWord)) {
                    return false;
                }
                map.put(currentChar, currentWord);
            }
		}
		return true;
	}

}
